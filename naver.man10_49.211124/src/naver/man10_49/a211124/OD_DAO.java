package naver.man10_49.a211124;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OD_DAO {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@192.168.10.50:1521:xe";
	private static String id = "user20";
	private static String pw = "user20";
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static Calendar cal = null;
	private static Date date = null;
	
	public static void setCon() {
		try {
			OD_DAO.con = DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {System.out.println(e);}

	}
	public static void setPsmt(String a) {
		try {
			OD_DAO.psmt = con.prepareStatement(a);
			
		} catch (Exception e) {System.out.println(e);}
	}
	public static void setCal(int i,int j,int k) {
		cal = new GregorianCalendar(i,j,k);
		date = new Date(cal.getTimeInMillis());

	}
	
	public static void exepted(int i,String name) {
		try {
			psmt.setInt(1, i);
			psmt.setString(2, name);
			psmt.setDate(3, date);
			int exec = OD_DAO.psmt.executeUpdate();
			if (exec > 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		} catch (SQLException e) {System.out.println(e);}
		finally {
			try {con.close(); psmt.close();} catch (Exception e) {}
		}
	}
}
