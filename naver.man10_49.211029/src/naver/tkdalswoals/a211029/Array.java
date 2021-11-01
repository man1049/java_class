package naver.tkdalswoals.a211029;

public class Array {

	public static void main(String[] args) {
		//Double 3개 배열로 저장
		Double[] scores = {80.8,44.2,65.4};
		//String 3개 배열로 저장
		String[] names = {"김백산","소백산","태백산"};
		
		//데이터 접근
		System.out.println("Scores의 개수 : " + scores.length);
		System.out.println("scores의 2번째 데이터 : " + scores[1]);
		
		// 반복문으로 데이터 가져오기
		for(int i = 0; i < names.length ; i = i + 1) {
			System.out.print(names[i]+" ");
			System.out.println("");
		}
		//빠른 열거를 이용
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
	}
}