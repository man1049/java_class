package naver.man10_49.a211116;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMain {

	public static void main(String[] args) {
		//크롬 드라이버 경로를 환경 변수에 추가
		//다운로드 받은 파일의 경로가 정확하게 설정되어야 합니다.
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//웹 브라우저 드라이버 인스턴스를 생성
		WebDriver driver = new ChromeDriver();
		
		//접속 할 URL을 get 메서드에 설정
		driver.get("http://www.naver.com");
		
	}

}
