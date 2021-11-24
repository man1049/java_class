package naver.man10_49.a211124;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			System.out.println(e.getLocalizedMessage());
		}
		return uidto;
	}

	@Override
	public int insertUserInfo(UserInfoDTO userinfodto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserInfo(UserInfoDTO userinfodto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUserInfo(int uinum) {
		// TODO Auto-generated method stub
		return 0;
	}

}
