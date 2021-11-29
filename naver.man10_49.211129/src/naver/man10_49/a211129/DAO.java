package naver.man10_49.a211129;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DAO {
	protected static Connection con;
	protected static PreparedStatement pstmt;
	protected static ResultSet rs;
	
	static {
		try {
			File f = new File("./db.properties");
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			
			String dr = p.getProperty("driver");
			String url = p.getProperty("url");
			String id = p.getProperty("id");
			String pw = p.getProperty("pw");
			
			Class.forName(dr);
			con = DriverManager.getConnection(url,id,pw);
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
