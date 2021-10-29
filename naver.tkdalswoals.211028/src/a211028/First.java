package a211028;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		/*for(int i = 1 ; i<4 ; i++) {
			System.out.println("image"+i+".jpg");
		}
		 */

		/*
		for(int i = 1 ; i < 11 ; i = i + 1) {
			System.out.println(i);
		}
		 */
		/*
		int j = 1;
		while(j<11) {
			System.out.println(j);
			j = j + 1;
		}
		 */
		/*Scanner sc = new Scanner(System.in);
		int input;
		int[] output = new int[21000];
		int add = 0;
		int count = 1;
		System.out.println("몇번 진행하시겠습니까?");
		input = sc.nextInt();
		output[0] = input;

		for(int i = 1; i <= output[0]; i = i + 1) {
			System.out.println(count + "번째 합을 시작합니다.");
			for(int j = 1; j <= 10; j = j + 1) {
				System.out.println(j+"번째 계산 할 숫자를 입력하세요.");
				input = sc.nextInt();
				if (input%2 == 1) {
					add = add + input;
				}else {
					input = 0;
				}
			}
			output[i] = add;
			add = 0;
			count = count + 1;
		}
		for(int i = 1; i <= output[0]; i = i + 1) {
			System.out.println("#"+i+" "+output[i]);
		}*/		
	}

}
