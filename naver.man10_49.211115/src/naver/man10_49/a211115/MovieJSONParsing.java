package naver.man10_49.a211115;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

//title 와 genre를 저장할 DTO 클래스 - Movie
class Movie{
	private String title;
	private String genre;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + "]";
	}
	
	
}

public class MovieJSONParsing {

	public static void main(String[] args) {
		//http://cyberadam.cafe24.com/movie/list 에서 제공하는 데이터 중에서
		//title 과 genre 만 파싱하기
		
		//1.Web 의 문자열 가져오기
		//가져온 문자열을 저장할 변수
		String json = null;
		try {
			//다운로드 받을 URL을 만들기
			//여기까지 작성하고 실행 - URL 형식이 잘못되었으면 예외 발생
			URL url = new URL(
					"http://cyberadam.cafe24.com/movie/list");
			
			//연결
			HttpURLConnection con = 
					(HttpURLConnection)url.openConnection();
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			//스트림 생성 - 문자열
			BufferedReader br = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			//문자열을 임시로 저장할 인스턴스 생성
			StringBuilder sb = new StringBuilder();
			
			//문자열 읽기
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line);
				sb.append("\n");
			}
			
			//결과를 변수에 저장
			json = sb.toString();
			
			//System.out.println(json);
			
		}catch(Exception e) {
			System.out.println("1:" + e.getLocalizedMessage());
		}
		
		
		//2.가져온 문자열을 파싱 - 원하는 모양으로 만들기
		if(json != null) {
			try {
				//전체 문자열을 객체로 변환
				JSONObject obj = new JSONObject(json);
				
				//원하는 데이터는 객체 안에 list 라는 이름의 배열로 존재
				JSONArray ar = obj.getJSONArray("list");
				
				//전체를 저장할 List를 생성
				List<Movie> list = new ArrayList<>();
				//배열을 순회
				for(int i=0; i<ar.length(); i=i+1) {
					//배열의 요소를 객체로 가져오기
					JSONObject movie = ar.getJSONObject(i);
					String title = movie.getString("title");
					String genre = movie.getString("genre");
					//System.out.println(title + ":" + genre);
					
					//하나의 행을 저장할 인스턴스를 생성
					Movie movie1 = new Movie();
					//데이터 설정
					movie1.setTitle(title);
					movie1.setGenre(genre);
					//list에 인스턴스 추가
					list.add(movie1);
				}
				
				for(Movie m : list) {
					System.out.println(m);
				}
				
			}catch(Exception e) {
				System.out.println("2:" + e.getLocalizedMessage());
			}
		}

	}

}
