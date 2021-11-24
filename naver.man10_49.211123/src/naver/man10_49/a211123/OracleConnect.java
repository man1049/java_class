package naver.man10_49.a211123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnect {

	public static void main(String[] args) {
		
		try {
			//드라이버 클래스 로드 - 한번만 수행
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		//데이터베이스 사용을 위해 연결
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@172.30.1.5:1521:xe","system","1324");
			System.out.println("성공");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
