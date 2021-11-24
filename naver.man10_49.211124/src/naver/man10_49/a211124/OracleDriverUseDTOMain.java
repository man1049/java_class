package naver.man10_49.a211124;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class OracleDriverUseDTOMain {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@192.168.10.50:1521:xe";
	private static String id = "user20";
	private static String pw = "user20";
	private static Connection con = null;
	private static PreparedStatement psmt = null;
	private static Calendar cal = null;

	public static void main(String[] args) {
		OD_DAO dto = new OD_DAO();
		
		dto.setCon();
		dto.setPsmt("INSERT INTO BACKSAN(BNUM,BNAME,BDATE) VALUES(?,?,?)");
		dto.setCal(1993, 2, 5);
		dto.exepted(4, "장백산");
	}


}
