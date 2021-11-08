package a211108;
import java.util.HashMap;

public class MapUse {

	public static void main(String[] args) {
		//Key는 String으로 하고 Value는 Object로 하는 HashMap을 생성
		//Value를 Object로 하는 이유는 Object에는 모든 종류의 데이터를 대입 할 수 있기떄문
		//대신에 Object로 된 데이터는 출력을 할 때를 제외하고는 강제 형 변환을 통해서
		//원래의 자료형으로 되돌려서 사용해야함
		
		
		//1. HashMap을 생성
		HashMap<String, Object> hm = new HashMap<>();
		
		//2. 데이터 저장
		hm.put("name", "김백산");
		hm.put("name", "태백산");
		hm.put("name", "소백산");
		hm.put("name", "장백산");
		hm.put("name", "권백산");
		hm.put("age", 29);
		hm.put("age", 3024);
		hm.put("age", 2212);
		hm.put("age", 69);
		hm.put("age", 55);
		
		//3. 데이터 꺼내기
		String name = (String)hm.get("name");
		int age = (Integer)hm.get("age");
		
		System.out.println(name);
		System.out.println(age);
		
		//7. 데이터 삭제
		//hm.remove("name");
		hm.put("name", null);
		//get으로 꺼내면 null 이기 때문에 삭제로 간주
		System.out.println(name);
		

	}

}
