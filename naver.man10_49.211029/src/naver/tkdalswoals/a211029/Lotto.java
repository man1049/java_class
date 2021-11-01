package naver.tkdalswoals.a211029;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num_array = new int[6];
		int array_length = num_array.length;
		int num ;
		boolean flag = true;
		
		for(int i = 0 ; i < array_length ; i = i + 1) {
			System.out.print("1~45 사이의 숫자를 입력해주세요:");
			num = sc.nextInt();
			if( num < 1 || num > 45 ) {
				i = i - 1;
				System.out.println("유효하지 않는 숫자입니다 다시 입력해 주세요.");
				continue;
			}
			if(i == 0) {
				num_array[i] = num;
				continue;
			}
			
			for(int j = i-1 ; j >= 0 ; j = j - 1) {
				if ( num == num_array[j]) {
					System.out.println("중복된 숫자입니다.");
					flag = false;
					break;
				}
			}
			
			if(flag == false) {
				i = i - 1;
				flag = true;
				continue;
			}
			
			num_array[i] = num;
		}
		
		for(int i = 0 ; i < num_array.length ; i = i + 1) {
			for(int j = i-1 ; j >= 0 ; j = j - 1) {
				
			}
			System.out.print(num_array[i]+"\t");
		}


	}

}
