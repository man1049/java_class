package naver.man10_49.a211116;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaverLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nid.naver.com/nidlogin.login");
		
		//자바스크립트 실행 객체를 생성
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//네이버 로그인 입력란의 name을 찾아 옵니다.
		//id와 pw
		js.executeScript("document.getElementsByName('id')[0].value=\'stt4t3\'");
		js.executeScript("document.getElementsByName('pw')[0].value=\'t3y44323\'");
		driver.findElement(By.xpath("//*[@id=\"log.login\"]")).click();
	}

}
