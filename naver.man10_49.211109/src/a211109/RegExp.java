package a211109;

public class RegExp {

	public static void main(String[] args) {
		// 영문 소문자로 시작하는 3글자를 확인
		
		//확인하기 위한 문자열
		String[] ar = {"abc","acc","addd","Ads","한aa","1sf"};
		
		//조회 할 패턴 생성
		//소문자로 시작하는 3글자
		String pattern = "^[a-z]..";
		
		for(String str : ar) {
			System.out.println(str.matches(pattern));
		}
		
	}

}
