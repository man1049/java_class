package naver.man10_49.autospamfree;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class AutoSpamCheckDAOImpl implements AutoSpamCheckDAO {
	private static AutoSpamCheckDAO autospamcheckipDAO;
	protected static Connection con;
	protected static PreparedStatement pstmt;
	protected static ResultSet rs;

	public static AutoSpamCheckDAO sharedInstance() {
		if(autospamcheckipDAO == null) {
			autospamcheckipDAO = new AutoSpamCheckDAOImpl();
		}
		return autospamcheckipDAO;
	}

	@Override
	public int checkcode(String code) {
		try {
			InputStream in = this.getClass().getClassLoader().getResourceAsStream("db.properties");
			Properties p = new Properties();
			p.load(in);
			
			String drv = p.getProperty("driver");
			String url = p.getProperty("url");
			String id = p.getProperty("id");
			String pw = p.getProperty("pw");
			Class.forName(drv);
			con = DriverManager.getConnection(url,id,pw);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "인증서버가 닫혀있습니다.","사용불가", JOptionPane.ERROR_MESSAGE);
		}
		// -1 : 정보없음
		// 0 : 로그인성공
		// 1 : 중복접속 차단
		// 2 : 차단알림
		try {
			pstmt = con.prepareStatement("select code,counter from ex where code = ?");
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			rs.first();
			if(rs.getString(1).equals(code)){}
			else {
				return -1; // 등록되지 않음
			}
			int i = rs.getInt(2);
			if(i == 1){
				pstmt = con.prepareStatement("update ex set counter = ? where code = ?");
				pstmt.setInt(1, rs.getInt(2)+1);
				pstmt.setString(2, code);
				pstmt.executeQuery();
				return 1;
			}else if(i == 2) {
				return 2;
			} else {
				pstmt = con.prepareStatement("update ex set counter = ? where code = ?");
				pstmt.setInt(1, rs.getInt(2)+1);
				pstmt.setString(2, code);
				pstmt.executeQuery();
				return 0;
			}
			
		} catch (SQLException e) { 
			
		}
		return -1;
	}


}
