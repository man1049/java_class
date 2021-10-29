package a211028;

public class Array {

	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 99;
		int score3 = 87;
		
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("");
		
		int[] score = {90,99,87};
		
		for(int i = 0 ; i< score.length ; i = i + 1) {
			System.out.println(score[i]);
		}
		
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("");
		
		int[] score_2 = new int[3];
		score_2[0] = 90;
		score_2[1] = 99;
		score_2[2] = 87;
		
		for(int i = 0 ; i< score_2.length ; i = i + 1) {
			System.out.println(score_2[i]);
		}
		
		System.out.println("");
		System.out.println("--------------------");
		System.out.println("");
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] score_3 = new int[3];
		int res;
		for(int i = 0 ; i < score_3.length ; i = i + 1) {
			System.out.print("점수를 입력하세요 : ");
			res = sc.nextInt();
			score_3[i] = res;
		}
		System.out.println("각각의 점수는?");
		for(int i = 0 ; i< 3 ; i = i + 1) {
			System.out.println(score_3[i]);
		}
		

	}

}
