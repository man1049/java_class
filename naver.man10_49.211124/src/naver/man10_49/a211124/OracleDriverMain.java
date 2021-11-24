package naver.man10_49.a211124;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OracleDriverMain {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@192.168.10.50:1521:xe";
	private static String id = "user20";
	private static String pw = "user20";
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static Calendar cal = null;

	public static void main(String[] args) {
		try {
			//오라클 연동 및 생성,수정,삭제
			
			Class.forName(driver);
			//System.out.println("드라이버 클래스 로드 성공");
			con = DriverManager.getConnection(url,id,pw);
			//System.out.println("접속 성공");
			
			//생성하기
			/*
			psmt = con.prepareStatement("INSERT INTO BACKSAN(BNUM,BNAME,BDATE) VALUES(?,?,?)");
			psmt.setInt(1, 3);
			psmt.setString(2, "태백산");
			cal = new GregorianCalendar(1981,3,11);
			Date date = new Date(cal.getTimeInMillis());
			psmt.setDate(3, date);
			
			int res = psmt.executeUpdate();
			if(res > 0) {
				System.out.println("삽입 성공");
			}else {
				System.out.println("삽입 실패");
			}
			*/
			
			//수정하기
			/*
			psmt = con.prepareStatement("UPDATE BACKSAN SET BNAME=?, BDATE=? WHERE BNUM=?");
			psmt.setString(1, "전재민");
			cal = new GregorianCalendar(1993,3,21);
			Date date = new Date(cal.getTimeInMillis());
			psmt.setDate(2, date);
			psmt.setInt(3, 3);
			
			int res = psmt.executeUpdate();
			if(res >= 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			*/
			
			//조회
			/*
			Map<String,Object> map = new HashMap<>();
			psmt = con.prepareStatement("select * from BACKSAN order by bnum asc");
			ResultSet rs = psmt.executeQuery();
			
			List<Map<String,Object>> backsan = new ArrayList<>();
			while(rs.next()) {
				map = new HashMap<>();
				
				map.put("bnum", rs.getInt("bnum"));
				map.put("bname", rs.getString("bname"));
				map.put("bdate", rs.getDate("bdate"));
				
				backsan.add(map);
				
				//int bnum = rs.getInt("bnum");
				//String bname = rs.getString("bname");
				//Date bdate = rs.getDate("bdate");
				//System.out.println(bnum+"\t"+bname+"\t"+bdate.toString());
			}
			for(Map<String,Object> list : backsan) {
				System.out.println(list.toString());
			}
			*/
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {con.close(); psmt.close();} catch (Exception e) {}
		}
		

	}


}
