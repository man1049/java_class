package naver.tkdalswoals.a211029;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] int_array = new int[10];
		for(int i = 0 ; i < 10 ; i = i + 1) {
			System.out.print("정렬 할 숫자를 입력하세요 : ");
			int_array[i] = input.nextInt();
		}
		input.close();
		int min_int = 0;
		int max_int = 2100000000;
		int array_num = 0;
		int array_length = int_array.length;
		
		
		for(int i = 0 ; i < array_length-1 ; i = i + 1) {
			for(int j = i + 1 ; j < array_length ; j = i + 1){
				if (int_array[i]>int_array[j]) {
					
					array_num = int_array[j];
					int_array[j] = int_array[i];
					int_array[i] = array_num;
					
				}
			}
			System.out.print(int_array[i]+" ");
		}
	
		for(int num : int_array) {
			System.out.print(num+" ");
		}
		
		
		
		
		
		
		
		
		/*
		// 순회
		for(int num : int_array) {
			//순회하는 수와 min_int와 비교해서 더 작은값을 min_int에 입력
			if (min_int < num) {
				min_int = num;
				//배열에 i를 증가시켜 넣으면서 min_int와 비교 맞다면 
				for(int i = 0 ; i < 10 ; i = i + 1) {
					if(min_int == int_array[i]) {
						
					}
				}
				
			}
			//순회하는 수와 max_int와 비교해서 더 큰값을 max_int에 입력
			if (max_int > num) {
				max_int = num;
			}
		}
		*/
		
		

	}

}
