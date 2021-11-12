package naver.man10_49.Practice;
import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		 // System.out.println("Hello World");
		
		/*
		String name = "전재민";
		int age = 29;
		int tall = 178;
		int weight = 69;
		System.out.println(name+"\t"+age+"\t"+tall+"\t"+weight);
		
		System.out.println((double)(weight / ((double)tall/100*(double)tall/100)));
		
		double bmi = (double)(weight / ((double)tall/100*(double)tall/100));
		double bmi_res = ((int)((bmi+0.05)*10)/(double)10);
		System.out.println(bmi_res);
		
		if (25 < bmi_res) {
			System.out.println("비만");
		}else if (23 < bmi_res && bmi_res <= 25 ) {
			System.out.println("과체중");
		}else if (18.5 < bmi_res && bmi_res <= 23 ) {
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
		*/
		
		
		/*
		int year = 2300;
		
		if ( year%4 == 0 && year%100 != 0 || year%400 == 0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
		*/
		
		
		/*String[] name = {"김백산","태백산","소백산","김두한","왕코","쌍칼","나미꼬","심영","의사"};
		
		for (String i : name) {
			System.out.print(i+"\t");
		}
		*/
		/*
		int res = 0 ;
		
		for (int i = 1 ; i<=100 ; i = i + 1) {
			res = res + i;
		}
		
		System.out.println(res);
		*/
		
		/*for (int i = 6 ; i > 0 ; i = i - 1) {
			for ( int j = i - 1 ; j > 0 ; j = j - 1) {
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		
		/*
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("최대 별의 개수를 입력하세요 : ");
		input = sc.nextInt();
		
		System.out.print("\n");
		
		
		
		// 열을 지칭하는 for
		// input이 만약 5일시 i 는 5가됩니다.
		for (int i = input ; i > 0 ; i = i - 1) {
			
			// " " 공백을 입력
			// j는 i-1을 합니다.
			// j를 지속적으로 -1을 하면서 0 이상이 되면 멈춥니다.
			// 공백을 input-1개부터 출력하며 점차 줄어듭니다.
			for (int j = i-1 ; j > 0 ; j = j - 1) {
				System.out.print(" ");
			}
			
			// * 을 입력
			// k의 초기값은 j와 같이 i-1을 합니다.
			// k가 인풋값과 같을 시 종료합니다.
			// *을 1개 부터 인풋값까지 출력합니다.
			for (int k = i-1 ; k < input ; k = k + 1) {
				System.out.print("*");
			}
			// 끝나면 엔터
			System.out.print("\n");
		}
		// *이 최대치에 도달했을 때 다시 역순으로 출력
		for (int i = 2 ; i < input+1 ; i = i + 1) {
			// " " 공백을 입력
			for (int j = i - 1 ; j > 0 ; j = j - 1) {
				System.out.print(" ");
				
			}
			// * 을 입력
			for (int k = i-1 ; k < input ; k = k + 1) {
				System.out.print("*");
			}
			// 끝나면 엔터
			System.out.print("\n");
		}
		*/
		
		/*
		int[] score = {33,57,78};
		String[] name = {"김백산","소백산","태백산"};
		int score_high = 0;
		String name_high = "";
		*/
		
		/*
		// 배열에 있는 점수 모두 출력
		for (int i : score ) {
			System.out.print(i + "\t");
		}
		*/
		
		/*
		 
		// score배열을 순회하면서 score[i]에 해당하는 점수를 score_high에 입력하고
		// 동시에 name[i]에 해당하는 이름을 name_high에 입력 
		for (int i = 0 ; i < score.length ; i = i + 1) {
			if (score[i] > score_high) {
				score_high = score[i];
				name_high = name[i];
			}
		}
		//출력
		System.out.println("가장 높은 점수를 받은 학생 \n"+name_high+ " : " + score_high);
		*/
		
		/*
		// 2부터 1223까지 소수의 개수
		
		int num = 1223;
		int count_res = 0;
		int count = 0;
		
		// i를 num까지 반복
		for (int i = 2 ; i <= num ; i = i + 1) {
			// j를 2부터 시작하여 i까지 반복
			for(int j = 2 ; j<=i ; j = j + 1) {
				// i를 j 로 나눠서 나머지가 0인것을 count에 넣음
				if(i%j == 0) {
					count = count + 1;
				}
			}
			// i를 j로 나눠서 나머지가 0인게 1또는 자신밖에 없으므로
			// 나머지가 0인게 1개일시 count_res를 +1 해줌
			if(count == 1) {
				count_res = count_res + 1;
			}
			// 다른 값을 계산하기 위하여 count값을 초기화
			count = 0;
		}
		
		//개수를 계산 후 출력
		System.out.print(count_res);
		*/
		
		/*
		// 2부터 8128까지 완전수의 개수
		
		int number = 0; // 약수의 합을 계산 할 변수
		int number_res = 0; // 총 합을 저장 할 변수

		//1을 제외한 2부터 8128까지 반복
		for(int i = 2 ; i <= 8128 ; i = i + 1) {
			//약수는 무조건 1이 들어가므로 1부터 시작하여
			//i와 같을 때 까지 반복
			for(int j = 1 ; j <= i ; j = j + 1) {
				//i와 j 를 나눴을 때 나머지가 0인것을 number에 저장
				if( i%j == 0) {
					number = number + (i/j);
				}
			}
			
			//number의 값이 i와 j 가 같은 수 까지 포함이므로 i를 *2 해줌
			if(number == i*2) {
				number_res = number_res + 1;
			}
			//계산이 끝났으므로 number의 값을 초기화
			number = 0;
		}
		
		//모두 계산이 끝난 후 개수를 출력
		System.out.println(number_res);
		
		*/
	}

}
