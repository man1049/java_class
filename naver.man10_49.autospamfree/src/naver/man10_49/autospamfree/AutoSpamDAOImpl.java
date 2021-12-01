package naver.man10_49.autospamfree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class AutoSpamDAOImpl implements AutoSpamDAO {

	//DB연결
	protected static Connection con;
	protected static PreparedStatement pstmt;
	protected static ResultSet rs;

	//DAO 변수 지정
	private static AutoSpamDAO autospamDAO;

	//크롬드라이버
	static ChromeOptions options = null;
	static WebDriver dr = null;
	static WebElement ue = null;
	static Select dd = null;

	static StringBuilder sb = null;
	static int count = 0;
	static String date = null;

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

		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		date = sdf.format(System.currentTimeMillis());

		//오늘날짜URL.txt파일이 없으면 생성
		try {
			BufferedReader br = new BufferedReader(new FileReader("./"+date+"URL.txt"));
			br.close();
		}catch(Exception e) {
			try {
				PrintWriter pwr = new PrintWriter("./"+date+"URL.txt");
				pwr.close();
			}catch(Exception ee) {}
		}

		//아이디와 비밀번호를 저장 할 a파일이 없을 시 생성
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\tf.a"));
			br.close();
		}catch(Exception e) {
			PrintWriter pwr;
			try {
				pwr = new PrintWriter("./pi\\tf.a");
				pwr.close();
			} catch (FileNotFoundException e1) {}
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\tn.a"));
			br.close();
		}catch(Exception e) {
			PrintWriter pwr;
			try {
				pwr = new PrintWriter("./pi\\tn.a");
				pwr.close();
			} catch (FileNotFoundException e1) {}
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\um.a"));
			br.close();
		}catch(Exception e) {
			PrintWriter pwr;
			try {
				pwr = new PrintWriter("./pi\\um.a");
				pwr.close();
			} catch (FileNotFoundException e1) {}
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\ts.a"));
			br.close();
		}catch(Exception e) {
			PrintWriter pwr;
			try {
				pwr = new PrintWriter("./pi\\ts.a");
				pwr.close();
			} catch (FileNotFoundException e1) {}
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\lp.a"));
			br.close();
		}catch(Exception e) {
			PrintWriter pwr;
			try {
				pwr = new PrintWriter("./pi\\lp.a");
				pwr.close();
			} catch (FileNotFoundException e1) {}
		}
	}
	
	//투데이프리
	@Override
	public boolean todayFree() {
		String str = null;
		String id = null;
		String pw = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\tf.a"));
			if((int)(br.lines().count()) != 1) {
				id = JOptionPane.showInputDialog( null, "아이디 입력","Login",JOptionPane.PLAIN_MESSAGE);
				pw = JOptionPane.showInputDialog( null, "비밀번호 입력", "Login",JOptionPane.PLAIN_MESSAGE);
				PrintWriter pwr;
				try {
					pwr = new PrintWriter("./pi\\tf.a");
					pwr.print(id+" "+pw);
					pwr.close();
				} catch (FileNotFoundException e1) {}
			}else {
				br.close();
				br = new BufferedReader(new FileReader("./pi\\tf.a"));
				while(true) {
					if((str = br.readLine()) != null) {
							id = str.split(" ")[0];
							pw = str.split(" ")[1];
					}else {
						str = null;
						break;
					}
				}
			}
			br.close();	
		}catch(Exception e) {}
		
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

			sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader("./"+date+"URL.txt"));
			while(true) {
				String res = null;
				if((res = br.readLine()) != null) {
					sb.append(res+"\n");
				}else {
					break;
				}
			}

			PrintWriter pwr = new PrintWriter("./"+date+"URL.txt");
			count++;
			if(sb.toString() != null) {
				pwr.print(sb.toString()+"\n"+count+". "+dr.getCurrentUrl()+"\n");
			}else {
				pwr.print(count+". "+dr.getCurrentUrl()+"\n");
			}
			br.close();
			pwr.close();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//투데이nc
	@Override
	public boolean todayNc() {
		String str = null;
		String id = null;
		String pw = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\tn.a"));
			if((int)(br.lines().count()) != 1) {
				id = JOptionPane.showInputDialog( null, "아이디 입력","Login",JOptionPane.PLAIN_MESSAGE);
				pw = JOptionPane.showInputDialog( null, "비밀번호 입력", "Login",JOptionPane.PLAIN_MESSAGE);
				PrintWriter pwr;
				try {
					pwr = new PrintWriter("./pi\\tn.a");
					pwr.print(id+" "+pw);
					pwr.close();
				} catch (FileNotFoundException e1) {}
			}else {
				br.close();
				br = new BufferedReader(new FileReader("./pi\\tn.a"));
				while(true) {
					if((str = br.readLine()) != null) {
							id = str.split(" ")[0];
							pw = str.split(" ")[1];
					}else {
						str = null;
						break;
					}
				}
			}
			br.close();	
		}catch(Exception e) {}
		
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
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/button")).click();
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/div/div/div/input")).sendKeys("https://nowd2.com/");
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/div/div/div/button[1]")).click();
			dr.switchTo().parentFrame();
			//업로드
			ue = dr.findElement(By.name("bf_file[]"));
			ue.sendKeys("C:\\spam.jpg");
			dr.findElement(By.xpath("//*[@id=\"btn_submit\"]")).click();

			sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader("./"+date+"URL.txt"));
			while(true) {
				String res = null;
				if((res = br.readLine()) != null) {
					sb.append(res+"\n");
				}else {
					break;
				}
			}

			PrintWriter pwr = new PrintWriter("./"+date+"URL.txt");
			count++;
			if(sb.toString() != null) {
				pwr.print(sb.toString()+"\n"+count+". "+dr.getCurrentUrl()+"\n");
			}else {
				pwr.print(count+". "+dr.getCurrentUrl()+"\n");
			}
			br.close();
			pwr.close();

			return true;
		}catch (Exception e) {
			return false;
		}
	}

	//우아미
	@Override
	public boolean Uami() {
		String str = null;
		String id = null;
		String pw = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\um.a"));
			if((int)(br.lines().count()) != 1) {
				id = JOptionPane.showInputDialog( null, "아이디 입력","Login",JOptionPane.PLAIN_MESSAGE);
				pw = JOptionPane.showInputDialog( null, "비밀번호 입력", "Login",JOptionPane.PLAIN_MESSAGE);
				PrintWriter pwr;
				try {
					pwr = new PrintWriter("./pi\\um.a");
					pwr.print(id+" "+pw);
					pwr.close();
				} catch (FileNotFoundException e1) {}
			}else {
				br.close();
				br = new BufferedReader(new FileReader("./pi\\um.a"));
				while(true) {
					if((str = br.readLine()) != null) {
							id = str.split(" ")[0];
							pw = str.split(" ")[1];
					}else {
						str = null;
						break;
					}
				}
			}
			br.close();	
		}catch(Exception e) {}
		
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
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/button")).click();
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/div/div/div/input")).sendKeys("https://nowd2.com/");
			dr.findElement(By.xpath("//*[@id=\"se2_tool\"]/div/ul[6]/li[1]/div/div/div/button[1]")).click();
			dr.switchTo().parentFrame();
			//업로드
			ue = dr.findElement(By.name("bf_file[]"));
			ue.sendKeys("C:\\spam.jpg");

			sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader("./"+date+"URL.txt"));
			while(true) {
				String res = null;
				if((res = br.readLine()) != null) {
					sb.append(res+"\n");
				}else {
					break;
				}
			}

			PrintWriter pwr = new PrintWriter("./"+date+"URL.txt");
			count++;
			if(sb.toString() != null) {
				pwr.print(sb.toString()+"\n"+count+". "+"직접입력필요"+"\n");
			}else {
				pwr.print(count+". "+dr.getCurrentUrl()+"\n");
			}
			br.close();
			pwr.close();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	//투데이서버
	@Override
	public boolean todayServer() {
		String str = null;
		String id = null;
		String pw = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\ts.a"));
			if((int)(br.lines().count()) != 1) {
				id = JOptionPane.showInputDialog( null, "아이디 입력","Login",JOptionPane.PLAIN_MESSAGE);
				pw = JOptionPane.showInputDialog( null, "비밀번호 입력", "Login",JOptionPane.PLAIN_MESSAGE);
				PrintWriter pwr;
				try {
					pwr = new PrintWriter("./pi\\ts.a");
					pwr.print(id+" "+pw);
					pwr.close();
				} catch (FileNotFoundException e1) {}
			}else {
				br.close();
				br = new BufferedReader(new FileReader("./pi\\ts.a"));
				while(true) {
					if((str = br.readLine()) != null) {
							id = str.split(" ")[0];
							pw = str.split(" ")[1];
					}else {
						str = null;
						break;
					}
				}
			}
			br.close();	
		}catch(Exception e) {}
		
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

			dr.findElement(By.xpath("/html/body")).sendKeys("https://nowd2.com/");
			//dr.findElement(By.xpath("//*[@id=\"fwrite\"]/b/div[4]/div/div/div[1]/div[52]/div")).click();
			//dr.findElement(By.xpath("//*[@id=\"fm_link_value\"]")).sendKeys("https://nowd2.com/");
			//dr.findElement(By.xpath("//*[@id=\"buttonWrapper\"]/img[1]")).click();
			dr.switchTo().parentFrame();
			//업로드
			ue = dr.findElement(By.name("bf_file[]"));
			ue.sendKeys("C:\\spam.jpg");
			dr.findElement(By.xpath("//*[@id=\"btn_submit\"]")).click();

			sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader("./"+date+"URL.txt"));
			while(true) {
				String res = null;
				if((res = br.readLine()) != null) {
					sb.append(res+"\n");
				}else {
					break;
				}
			}

			PrintWriter pwr = new PrintWriter("./"+date+"URL.txt");
			count++;
			if(sb.toString() != null) {
				pwr.print(sb.toString()+"\n"+count+". "+dr.getCurrentUrl()+"\n");
			}else {
				pwr.print(count+". "+dr.getCurrentUrl()+"\n");
			}
			br.close();
			pwr.close();
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean linPlay() {
		String str = null;
		String id = null;
		String pw = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("./pi\\lp.a"));
			if((int)(br.lines().count()) != 1) {
				id = JOptionPane.showInputDialog( null, "아이디 입력","Login",JOptionPane.PLAIN_MESSAGE);
				pw = JOptionPane.showInputDialog( null, "비밀번호 입력", "Login",JOptionPane.PLAIN_MESSAGE);
				PrintWriter pwr;
				try {
					pwr = new PrintWriter("./pi\\lp.a");
					pwr.print(id+" "+pw);
					pwr.close();
				} catch (FileNotFoundException e1) {}
			}else {
				br.close();
				br = new BufferedReader(new FileReader("./pi\\lp.a"));
				while(true) {
					if((str = br.readLine()) != null) {
							id = str.split(" ")[0];
							pw = str.split(" ")[1];
					}else {
						str = null;
						break;
					}
				}
			}
			br.close();	
		}catch(Exception e) {}
		
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

						sb = new StringBuilder();
						BufferedReader br = new BufferedReader(new FileReader("./"+date+"URL.txt"));
						while(true) {
							String res = null;
							if((res = br.readLine()) != null) {
								sb.append(res+"\n");
							}else {
								break;
							}
						}

						PrintWriter pwr = new PrintWriter("./"+date+"URL.txt");
						count++;
						if(sb.toString() != null) {
							pwr.print(sb.toString()+"\n"+count+". "+"직접입력필요"+"\n");
						}else {
							pwr.print(count+". "+"직접입력필요"+"\n");
						}
						br.close();
						pwr.close();
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
			sb = new StringBuilder();
			BufferedReader br = new BufferedReader(new FileReader("./"+date+"URL.txt"));
			while(true) {
				String res = null;
				if((res = br.readLine()) != null) {
					sb.append(res+"\n");
				}else {
					break;
				}
			}

			PrintWriter pwr = new PrintWriter("./"+date+"URL.txt");
			if(sb.toString() != null) {
				pwr.print(sb.toString()+
						"수령 캐릭터명 : \n"
						+ "받을 아이템 : \n");
			}
			br.close();
			pwr.close();
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
			} catch (Exception e) {}
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
