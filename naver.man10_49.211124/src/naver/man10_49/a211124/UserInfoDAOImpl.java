package naver.man10_49.a211124;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;

//UserInfoDAO 인터페이스의 메서드를 구현 할 클래스
public class UserInfoDAOImpl implements UserInfoDAO {
	//서버에서 사용되는 클래스인 경우 singleton으로 디자인하는 것이 일반적
	//Framework를 이용하면 이 작업은 Framework가 자동으로 수행합니다.
	private UserInfoDAOImpl() {}

	private static UserInfoDAO userinfoDAO;

	public static UserInfoDAO sharedInstance() {
		if(userinfoDAO == null) {
			userinfoDAO = new UserInfoDAOImpl();
		}
		return userinfoDAO;
	}
	private static String driver;
	private static String url;
	private static String id;
	private static String pw;
	
	private static BufferedReader br = null;
	private static PrintWriter pwr = null;
	private static LocalTime ltime = LocalTime.now();
	private static LocalDate ldate = LocalDate.now();
	private static String now_date = Integer.toString(ldate.getYear()) +Integer.toString(ldate.getMonthValue())+Integer.toString(ldate.getDayOfMonth());
	private static String log_read_string = " ";
	private static UserInfoLogOutput uilog = new UserInfoLogOutput();
	
	
	//Connection 은 맨 처음 한 번 연결해놓고 계속 사용하는 경우가 일반적
	private static Connection con = null;

	//static 초기화 : 클래스가 처음 사용 될 때 한번만 수행되는 코드
	static {
		try {
			//프로퍼티 파일을 읽기 위한 준비 
			File f = new File("./db.properties");
			FileInputStream is = new FileInputStream(f);
			Properties properties = new Properties();
			properties.load(is);

			//프로퍼티 파일의 내용을 읽어서 변수에 저장
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			id = properties.getProperty("id");
			pw = properties.getProperty("pw");

			//드라이버 클래스 로드
			Class.forName(driver);

			con = DriverManager.getConnection(url,id,pw);
			System.out.println("static 초기화 성공");
			
			//로그파일이 없을 시 생성
			uilog.ExceptionOutputCreateFile();
			
		} catch (Exception e) {
			uilog.ExceptionOutput(e);
		}
	}


	@Override
	public List<UserInfoDTO> getList() {
		List<UserInfoDTO> list = new ArrayList<>();
		try {

			PreparedStatement psmt = con.prepareStatement("select * from USERINFO");
			ResultSet rs = psmt.executeQuery();


			while(rs.next()) {
				UserInfoDTO uidto = new UserInfoDTO();
				uidto.setUinum(rs.getInt("UINUM"));
				uidto.setUidate(rs.getDate("UIDATE"));
				uidto.setUiname(rs.getString("UINAME"));
				uidto.setUinickname(rs.getString("UINICKNAME"));
				uidto.setUiaddress(rs.getString("UIADDRESS"));
				list.add(uidto);
			}
			rs.close();
			psmt.close();
		} catch (Exception e) {
			uilog.ExceptionOutput(e);
		}

		return list;
	}

	@Override
	public UserInfoDTO getUserInfo(int uinum) {
		//1개를 리턴하는 메서드는 처음에 null을 대입한 상태에서 시작
		//1개를 가져오는 메서드를 호출했을 때는 결과가 null인지 확인해야함
		UserInfoDTO uidto = null;
		try {

			PreparedStatement psmt = con.prepareStatement("select * from USERINFO where uinum = ?");
			psmt.setInt(1, uinum);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				uidto = new UserInfoDTO();
				uidto.setUiaddress(rs.getString("uiaddress"));
				uidto.setUidate(rs.getDate("uidate"));
				uidto.setUiname(rs.getString("uiname"));
				uidto.setUinickname(rs.getString("uinickname"));
				uidto.setUinum(rs.getInt("uinum"));
			}
			psmt.close();
			rs.close();

		}catch(Exception e) {
			uilog.ExceptionOutput(e);
		}
		return uidto;
	}

	@Override
	public int insertUserInfo(UserInfoDTO uidto) {
		int res = -1;
		try {
			//num은 시퀀스를 이용해서 삽입하므로 시퀀스를 이용하는 내용을 설정하고
			//나머지 3개는 매번 내용이 바뀌므로 ?로 처리
			PreparedStatement psmt = con.prepareStatement("insert into userinfo (uinum,uidate,uiname,uiaddress,uinickname) values(usernumber.nextval,?,?,?,?)");

			//?에 값을 바인딩
			psmt.setDate(1, uidto.getUidate());;
			psmt.setString(2, uidto.getUiname());
			psmt.setString(3, uidto.getUiaddress());
			psmt.setString(4, uidto.getUinickname());

			//실행
			res = psmt.executeUpdate();
			if(res < 0) {
				System.out.println("insert 실패");
			}else {
				System.out.println("insert 성공");
			}

			psmt.close();
		}catch (Exception e) {
			
			uilog.ExceptionOutput(e);
			
			/*
			//Exception시 로그파일만들기
			try {
				StringBuilder sb = new StringBuilder();
				br = new BufferedReader(new FileReader("./"+now_date+"_log.txt"));
				while(br.ready()) {
					sb.append(br.readLine()+"\n");
				}
				
				log_read_string = sb.toString();
				//System.out.println(log_read_string);
				br.close();
			} catch (Exception e1) {
			//System.out.println("불러오기경로오류");
			}
			
			try {
				pwr = new PrintWriter("./"+now_date+"_log.txt");
				pwr.println(now_date+" / "+ltime.getHour()+":"+ltime.getMinute()+":"+ltime.getSecond()+":"+" / "+e+log_read_string);
				pwr.flush();
				pwr.close();
			} catch (Exception e1) {
			//System.out.println("저장경로오류"); System.out.println(e1.getLocalizedMessage());
			}*/
			
		}
		return res;
	}

	@Override
	public int updateUserInfo(UserInfoDTO uidto) {
		int res = -1;
		
		try {
			PreparedStatement psmt = 
			con.prepareStatement("update userinfo set UIDATE = ?, UINAME = ?,UIADDRESS = ?,UINICKNAME = ? where UINUM = ?");
			
			psmt.setDate(1, uidto.getUidate());
			psmt.setString(2, uidto.getUiname());
			psmt.setString(3, uidto.getUiaddress());
			psmt.setString(4, uidto.getUinickname());
			psmt.setInt(5, uidto.getUinum());
			
			res = psmt.executeUpdate();
			if(res<0) {
				System.out.println("실패");
			}else {
				System.out.println("성공");
			}
		} catch (SQLException e) {
			uilog.ExceptionOutput(e);
		}
		
		return res;
	}

	@Override
	public int deleteUserInfo(int uinum) {
		int res = -1;
		try {
			PreparedStatement psmt = con.prepareStatement("delete from UserInfo where uinum = ?");
			psmt.setInt(1, uinum);
			
			res = psmt.executeUpdate();
			if(res > 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			uilog.ExceptionOutput(e);
		}
		
		return res;
	}

}
