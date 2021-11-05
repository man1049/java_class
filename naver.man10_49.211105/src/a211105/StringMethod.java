package a211105;

public class StringMethod {

	public static void main(String[] args) {
		// 문자열 일치여부 확인
		
		String text1 = "man";
		String text2 = "MAN";
		String text3 = "Man";
		
		System.out.println(text1.trim().toUpperCase().equals(text2.trim().toUpperCase()));
		System.out.println(text1.trim().toUpperCase().equals(text3.trim().toUpperCase()));
		
		//대소문자 변환을 하지 않은 상태에서 크기를 비교하면 소문자가 크다고 나옴
		System.out.println(text1.compareTo(text2));
		int res = text1.compareTo(text2);
		if(res > 0) {
			System.out.println("text1이 더 크다");
		}else if(res == 0) {
			System.out.println("둘다 같다");
		}else {
			System.out.println("text2가 더 크다");
		}
	}

}
