package a211109;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		//속성과 값을 문자열로 저장하는 인스턴스를 생성
		Properties prop = new Properties();
		
		//값을 저장
		prop.setProperty("name", "adam");
		prop.setProperty("age", "44");
		
		//값 읽기
		
		System.out.println(prop.get("name"));
		System.out.println(prop.get("age"));
		//없는 key를 불러오면 null
		//속성과 값을 저장하는 자료구조에서는 없는 속성의 값을 대입해봐야 합니다.
		//null이 리턴되는지 아니면 예외가 발생하는지 확인해봐야 합니다.
		System.out.println(prop.get("ppor"));
		
		//파일에 저장
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop/data.txt");
			prop.store(fos, "주석");
			
			fos = new FileOutputStream("C:\\Users\\tj\\Desktop/data.xml");
			prop.storeToXML(fos, "주석");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
