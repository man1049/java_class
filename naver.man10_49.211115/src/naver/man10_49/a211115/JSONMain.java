package naver.man10_49.a211115;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMain {

	public static void main(String[] args) {
		/*
		//JSON Object
		String json = "{\"name\":\"김백산\", \"age\":67}";
		//문자열 전체를 JSON으로 변환
		JSONObject obj = new JSONObject(json);
		
		//객체는 key-name을 대입해서 세부 데이터를 가져옵니다.
		String name = obj.getString("name");
		int age = obj.getInt("age");
		System.out.println(name);
		System.out.println(age);
		*/
		
		/*
		String json = "[91513,19313,68886,6812785]";
		JSONArray ar = new JSONArray(json);
		for(int i = 0 ; i < ar.length() ; i = i + 1) {
			int num = ar.getInt(i);
			System.out.println(num);
		}
		*/
		
		String json = "{\"count\":20, "
	            + "\"list\":[{\"name\":\"adam\"}, {\"name\":\"rusia\"}]}";
		//객체 {count:20, list[name:"adam", name:"rusia"]}
		
		JSONObject obj = new JSONObject(json);
		//count는 정수이므로 바로 읽을 수 있습니다.
		int count = obj.getInt("count");
		System.out.println(count);
		
		//list는 대괄호로 되어 있습니다.
		JSONArray list = obj.getJSONArray("list");
		
		//배열 순회
		for(int i = 0; i<list.length(); i = i + 1) {
			//배열의 요소들을 객체로 가져오기
			JSONObject temp = list.getJSONObject(i);
			String name = temp.getString("name");
			System.out.println(name);
		}
		
	}

}
