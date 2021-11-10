package naver.man10_49.Practice;

public class Practice_9 {

	public static void main(String[] args) {
		//자연수 n이 매개변수로 주어집니다.
		//n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로
		//표현한 수를 return 하도록 solution 함수를 완성해주세요.
		
		int n = 45;
		int n_cul = n;
		String n_str = "";
		while(n_cul > 0) {
			n_str = n_str+(n_cul%3);
			n_cul = n_cul/3;
		}
			n_cul = Integer.parseInt(n_str, 3);
	}

}
