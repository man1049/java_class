package naver.man10_49.a211115;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParsing {

	public static void main(String[] args) {
		//한겨레 신문사 Main 기사의 타이틀 가져오기
		
		//1.https://hani.co.kr의 HTML을 가져오기
		String html = "";
		URL url;
		StringBuilder sb = new StringBuilder();
		try {
			url = new URL("https://www.hani.co.kr/");
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();

			huc.setConnectTimeout(30000);
			huc.setUseCaches(false);

			BufferedReader br = new BufferedReader(new InputStreamReader(huc.getInputStream()));
			
			while(true) {
				String read = br.readLine();
				if(read == null) {
					break;
				}
				sb.append(read);
				sb.append("\n");
			}
			html = sb.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(html != null) {
			//HTML을 Document 객체로 변환
			//import는 org.jsoup으로 시작하는 것을 import
			Document doc = Jsoup.parse(html);
			
			//Main 기사 찾아오기
			Elements elements = doc.select("#main-top > div.main-top > div.main-top-article > h4 > a");
			
			//순회
			for(int i = 0 ; i < elements.size() ; i = i + 1) {
				Element element = elements.get(i);
				//태그 안의 내용
				System.out.println(element.text());
				//태그 안의 속성 가져오기
				System.out.println(element.attr("href"));
				
				
				
			}
		}
		
		

	}

}
