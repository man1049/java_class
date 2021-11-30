package naver.man10_49.autospamfree;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class AutoSpamDAOImpl implements AutoSpamDAO {

	protected static Connection con;
	protected static PreparedStatement pstmt;
	protected static ResultSet rs;

	private static AutoSpamDAO autospamDAO;
	static ChromeOptions options = null;
	static WebDriver dr = null;
	static WebElement ue = null;
	static Select dd = null;

	private AutoSpamDAOImpl() {};

	public static AutoSpamDAO sharedInstance() {
		if(autospamDAO == null) {
			autospamDAO = new AutoSpamDAOImpl();
		}
		return autospamDAO;
	}

	static {
		System.setProperty("webdriver.chrome.driver", "m.exe");
		options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("enable-automation"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation"); 
		options.addArguments("--disable-gpu"); 
		dr = new ChromeDriver(options);

	}

	@Override
	public boolean todayFree(String id, String pw) {
		
		try {
			
			dr.get("https://oraksil.cc/");

			dr.findElement(By.xpath("//*[@id=\"mb_id\"]")).sendKeys(id);
			dr.findElement(By.xpath("//*[@id=\"mb_password\"]")).sendKeys(pw);
			dr.findElement(By.xpath("//*[@id=\"basic_outlogin\"]/div[3]/button")).click();

			dr.get("https://oraksil.cc/bbs/write.php?bo_table=diablo");

			dr.findElement(By.xpath("//*[@id=\"wr_subject\"]")).sendKeys("✴️✴️✴️✴️✴️ 디아블로2 NOWD 서버 ✴️✴️✴️✴️✴️");
			dr.findElement(By.xpath("//*[@id=\"wr_content\"]")).sendKeys("https://nowd2.com/");
			ue = dr.findElement(By.name("bf_file[]"));
			ue.sendKeys("C:\\spam.jpg");
			dr.findElement(By.xpath("//*[@id=\"btn_submit\"]")).click();
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean todayNc(String id, String pw) {
		try {
			dr.get("https://todaync.com/");
			//로그인
			dr.findElement(By.xpath("//*[@id=\"outlogin_wrap_open\"]/img")).click();
			dr.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys(id);
			dr.findElement(By.xpath("//*[@id=\"login_pw\"]")).sendKeys(pw);
			dr.findElement(By.xpath("//*[@id=\"login_auto_login\"]")).click();

			//작성페이지로 이동
			dr.get("https://todaync.com/bbs/write.php?bo_table=etc_hongbo");

			//분류 드롭다운
			Select dd = new Select(dr.findElement(By.xpath("//*[@id=\"ca_name\"]")));
			dd.selectByValue("디아2");
			//제목
			dr.findElement(By.xpath("//*[@id=\"wr_subject\"]")).sendKeys("✴️✴️✴️✴️✴️ 디아블로2 NOWD 서버 ✴️✴️✴️✴️✴️");
			//링크

			dr.switchTo().frame(0);
			System.out.println("프레임스위칭");
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/button")).click();
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/div/div/div/input")).sendKeys("https://nowd2.com/");
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/div/div/div/button[1]")).click();
			dr.switchTo().parentFrame();
			//업로드
			ue = dr.findElement(By.name("bf_file[]"));
			ue.sendKeys("C:\\spam.jpg");
			dr.findElement(By.xpath("//*[@id=\"btn_submit\"]")).click();

			return true;
		}catch (Exception e) {
			return false;
		}


	}

	@Override
	public boolean Uami(String id, String pw) {
		try {
			dr.get("https://uami1.net/");
			//로그인
			dr.findElement(By.xpath("//*[@id=\"outlogin_mb_id\"]")).sendKeys(id);
			dr.findElement(By.xpath("//*[@id=\"outlogin_mb_password\"]")).sendKeys(pw);
			dr.findElement(By.xpath("//*[@id=\"basic_outlogin\"]/div[3]/button")).click();

			//작성페이지로 이동
			dr.get("https://uami1.net/bbs/write.php?bo_table=manu1_2");

			//제목
			dr.findElement(By.xpath("//*[@id=\"wr_subject\"]")).sendKeys("✴️✴️✴️✴️✴️ 디아블로2 NOWD 서버 ✴️✴️✴️✴️✴️");
			//링크

			dr.switchTo().frame(0);
			System.out.println("프레임스위칭");
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/button")).click();
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/div/div/div/input")).sendKeys("https://nowd2.com/");
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/div/div/div/button[1]")).click();
			dr.switchTo().parentFrame();
			//업로드
			ue = dr.findElement(By.name("bf_file[]"));
			ue.sendKeys("C:\\spam.jpg");
			return true;
		}catch(Exception e) {
			return false;
		}

	}

	@Override
	public boolean todayServer(String id, String pw) {
		try {
			dr.get("https://todayserver.net/");
			//로그인
			dr.findElement(By.xpath("//*[@id=\"outlogin_wrap_open\"]/img")).click();
			dr.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys(id);
			dr.findElement(By.xpath("//*[@id=\"login_pw\"]")).sendKeys(pw);
			dr.findElement(By.xpath("//*[@id=\"login_auto_login\"]")).click();

			//작성페이지로 이동
			dr.get("https://todayserver.net/bbs/write.php?bo_table=hongbo_etc");

			//분류 드롭다운
			dd = new Select(dr.findElement(By.xpath("//*[@id=\"ca_name\"]")));
			dd.selectByValue("디아2");
			//제목
			dr.findElement(By.xpath("//*[@id=\"wr_subject\"]")).sendKeys("✴️✴️✴️✴️✴️ 디아블로2 NOWD 서버 ✴️✴️✴️✴️✴️");
			//url작성
			dr.switchTo().frame(0);
			//System.out.println("프레임스위칭");

			dr.findElement(By.xpath("/html/body")).sendKeys("https://nowd2.com/");
			//dr.findElement(By.xpath("//*[@id=\"fwrite\"]/b/div[4]/div/div/div[1]/div[52]/div")).click();
			//dr.findElement(By.xpath("//*[@id=\"fm_link_value\"]")).sendKeys("https://nowd2.com/");
			//dr.findElement(By.xpath("//*[@id=\"buttonWrapper\"]/img[1]")).click();
			dr.switchTo().parentFrame();
			//업로드
			ue = dr.findElement(By.name("bf_file[]"));
			ue.sendKeys("C:\\spam.jpg");
			dr.findElement(By.xpath("//*[@id=\"btn_submit\"]")).click();
			return true;
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			return false;
		}
	}

	@Override
	public boolean linPlay(String id, String pw) {
		try {
			try {
				dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				dr.get("https://linplay.io/");
			}catch (Exception e) {}
			finally {
				try {
					dr.findElement(By.xpath("//*[@id=\"outlogin_mb_id\"]")).sendKeys(id);
					dr.findElement(By.xpath("//*[@id=\"outlogin_mb_password\"]")).sendKeys(pw);
					dr.findElement(By.xpath("//*[@id=\"basic_outlogin\"]/div[3]/button")).click();
				}catch(Exception e) {}
				finally {
					try {
						dr.get("https://linplay.io/bbs/write.php?bo_table=1_4");
					}catch(Exception e) {}
					finally {
						dd = new Select(dr.findElement(By.xpath("//*[@id=\"ca_name\"]")));
						dd.selectByValue("디아블로");
						dr.findElement(By.xpath("//*[@id=\"wr_subject\"]")).sendKeys("✴️✴️✴️✴️✴️ 디아블로2 NOWD 서버 ✴️✴️✴️✴️✴️");
						dr.findElement(By.xpath("//*[@id=\"fwrite\"]/div[5]/div/div/div[3]/div[2]")).sendKeys("https://nowd2.com/");
						ue = dr.findElement(By.name("bf_file[]"));
						ue.sendKeys("C:\\spam.jpg");
						//자동입력방지 입력 후 작성완료 수동

					}
				}
			}
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public void autoSpamExit(String code) {
		try {
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pstmt = con.prepareStatement("select code,counter from ex where code = ?");
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			rs.first();
			if(rs.getInt(2) == 1) {
				pstmt = con.prepareStatement("update ex set counter = 0 where code = ?");
				pstmt.setString(1, code);
				pstmt.execute();
			}
			Runtime.getRuntime().exec("taskkill /f /im m.exe");
			con.close();
			pstmt.close();
			rs.close();
			dr.close();
			
		} catch (Exception e) {}		
	}
}
