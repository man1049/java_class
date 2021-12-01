package naver.man10_49.autospamfree;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JOptionPane;

public class AutoSpamUpdateCheckDAOImpl implements AutoSpamUpdateCheckDAO {

	private static AutoSpamUpdateCheckDAO autospamupdatecheckDAO;
	protected static Connection con;
	protected static PreparedStatement pstmt;
	protected static ResultSet rs;

	public static AutoSpamUpdateCheckDAO sharedInstance() {
		if(autospamupdatecheckDAO == null) {
			autospamupdatecheckDAO = new AutoSpamUpdateCheckDAOImpl();
		}
		return autospamupdatecheckDAO;
	}
	
	@Override
	public void updatecheck(String ver) {
		Runtime runtime = Runtime.getRuntime(); 
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
		try {
			pstmt = con.prepareStatement("select ver from upcheck where ver = ?");
			pstmt.setString(1, "1");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				new AutoSpamCheck();
			}else {
				JOptionPane.showMessageDialog(null, "구버전입니다. 새로운 버전을 받아주세요.","업데이트", JOptionPane.ERROR_MESSAGE);
				try { // Block for Windows Platform 
					String cmd = "rundll32 url.dll,FileProtocolHandler " + "https://nowd2.com/bbs/board.php?bo_table=newpds&wr_id=48";
					runtime.exec(cmd); 
					} catch(Exception e) {}
			}
		} catch(Exception e) {}
	}
}
