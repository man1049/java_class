package naver.man10_49.a211116;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		int i= 0;
		int j = 0;
		while(i < 5) {
			while(j < 10) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement body = driver.findElement(By.tagName("body"));
			body.sendKeys(Keys.PAGE_DOWN);
			j++;
			}
			i++;
			j = 0;
			String html = driver.getPageSource();
			System.out.println(html);
		}
	}
}
