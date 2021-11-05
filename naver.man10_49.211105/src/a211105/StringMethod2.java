package a211105;

public class StringMethod2 {

	public static void main(String[] args) {
		// 문자열 일치여부 확인
		
		String text = "ㅁello String";
		
		//text의 길이를 출력
		System.out.println(text.length());
		
		//text의 첫글자가 대문자인지 판별
		System.out.println(text.charAt(0) == text.toUpperCase().charAt(0));
		
		//text의 첫글자가 영문자인지 판별
		if('Z' > text.charAt(0) && text.charAt(0) > 'A' || 'z' > text.charAt(0) && text.charAt(0) > 'a') {
			System.out.println("영문자입니다.");
		}else {
			System.out.println("영문자가아닙니다.");
		}
	}

}
