package a211105;

public class StringCompare {

	public static void main(String[] args) {
		// String 과 StringBuilder의 차이
		
		//1. 생성
		String text1 = "My name is";
		StringBuilder text2 = new StringBuilder("my name is");
		
		System.out.println(text1.hashCode());
		System.out.println(text2.hashCode());
		
		
		//3. 문자열 추가 연산
		text1 = text1 + "Big M.A.N";
		text2.append("Big M.A.N");
		
		//4 추가 연산 후 해시코드 확인
		//String은 새로운 공간에서 작업을 수행하고 그 공간의 참조를 리턴하기 때문에
		//해시코드가 변경됨
		System.out.println(text1.hashCode());
		//StringBuilder 는 현재 공간에서 작업을 수행하기 떄문에 해시코드가 그대로
		System.out.println(text2.hashCode());
		
	}

}
