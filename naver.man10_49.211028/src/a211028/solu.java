package a211028;

import java.util.Scanner;

public class solu {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		//스캐너 입력 = 5
		for ( int i = 0 ; i < 1 ; i = i + 1){

			int n_1 = 0;
			int n_2 = 0; 
			int res = 0;

			for(int j = 0 ; j < T ; j = j + 1){
				if ( T == 1){
					System.out.println(j+"번째 수는 "+ 1 + " 입니다");
					break;
				}else if( T == 2){
					System.out.println(j+"번째 수는 "+ 1 + " 입니다");
					break;
				}
				// T가 4일때
				if ( n_1 >= 1) {
					res = n_1 + n_2;
					System.out.println(T+" n_1"+" 의값"+n_1);
					System.out.println(T+" n_2"+" 의값"+n_2);
					n_2 = n_1;
					n_1 = res;
				}else if (n_1 == 0) {
					n_1 = n_1 + 1;
				}
			}
			System.out.println(T+"번째 수는"+res+"입니다");
		}
	
		/*Scanner sc = new Scanner(System.in);
		int T = 0;
		int n_1 = 0;
		int n_2 = 0; 
		int res = 0;
		int[] T_array = new int[5];
		T_array[0]=sc.nextInt();
		T_array[1]=sc.nextInt();
		T_array[2]=sc.nextInt();
		T_array[3]=sc.nextInt();
		T_array[4]=sc.nextInt();
		for(int test_case = 0; test_case <= 4; test_case++)
		{		

			if ( test_case >= 2) {
				res = n_1 + n_2;
				n_2 = n_1;
				n_1 = res;
				res = n_1 + n_2;
				T_array[test_case] = res;
			}else if (n_1 == 0) {
				n_1 = n_1 + 1;
				res = n_1 + n_2;
				T_array[test_case] = res;
			}else if (n_1 == 1) {
				res = n_1;
				T_array[test_case] = res;
			}
			if(test_case==T){
				System.out.println(test_case+"번째 수는"+res+"입니다");
			}
		T = T+1;
		}*/
		/*
		import java.util.Scanner;
		import java.io.FileInputStream;

		class Solution
		{
			public static void main(String args[]) throws Exception
			{
				System.setIn(new FileInputStream("res/input.txt"));
				Scanner sc = new Scanner(System.in);
				int T = 0;
				int n_1 = 0;
				int n_2 = 0; 
				int res = 0;
				int[] T_array = new int[5];
				T_array[0]=sc.nextInt();
				T_array[1]=sc.nextInt();
				T_array[2]=sc.nextInt();
				T_array[3]=sc.nextInt();
				T_array[4]=sc.nextInt();
				for(int test_case = 0; test_case <= 4; test_case++)
				{		

					if ( test_case >= 2) {
						res = n_1 + n_2;
						n_2 = n_1;
						n_1 = res;
						res = n_1 + n_2;
						T_array[test_case] = res;
					}else if (n_1 == 0) {
						n_1 = n_1 + 1;
						res = n_1 + n_2;
						T_array[test_case] = res;
					}else if (n_1 == 1) {
						res = n_1;
						T_array[test_case] = res;
					}
					if(test_case==T){
						System.out.println(test_case+"번째 수는"+res+"입니다");
					}
				T = T+1;
				}
			}
		}*/

	}
}