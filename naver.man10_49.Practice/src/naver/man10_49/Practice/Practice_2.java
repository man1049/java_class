package naver.man10_49.Practice;

import java.util.Arrays;

public class Practice_2 {

	public static void main(String[] args) {

		//프로그래머스 코딩테스트 1단계 K번째수

		//제공된 테스트데이터
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		//리턴배열
		int[] answer = {};
		int[] array_res;
		int count = 0;


		answer = new int[commands.length];


		for(int i = 0 ; i < commands.length ; i = i + 1){

			array_res = new int[commands[i][1] - commands[i][0]+1];

			for(int j = commands[i][0]-2 ; j < commands[i][1]-1 ; j = j +1 ) {

				if(commands[i][0] == commands[i][1]) {
					array_res = new int[1];
					array_res[0] = array[commands[i][0]-1];
					break;
				}

				if(commands[i][0] == 1 && commands[i][1] == 7) {
					array_res = new int[7];
					array_res = array;
					break;
				}

				array_res[count] = array[j+1];
				count ++;

			}
			Arrays.sort(array_res);;
			count = 0 ;
			answer[i] = array_res[commands[i][2]-1];
			array_res = null;

		}

		for(int a : answer) {
			System.out.print(a + " ");
		}

	}

}
