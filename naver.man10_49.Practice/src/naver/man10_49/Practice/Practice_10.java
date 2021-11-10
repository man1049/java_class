package naver.man10_49.Practice;

import java.util.*;

public class Practice_10 {

	public static void main(String[] args) {
		//정수 배열 numbers가 주어집니다.
		//numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
		//모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
		
		int[] numbers = {2,1,3,4,1};
		int count = 0;
		int[] answer;
		
		Set<Integer> res_num = new TreeSet<>();
		
		for(int i = 0 ; i < numbers.length ; i = i + 1) {
			for(int j = i+1 ; j < numbers.length ; j = j + 1) {
				res_num.add(numbers[i]+numbers[j]);
			}
		}
		
		answer = new int[res_num.size()];
		Iterator<Integer> it = res_num.iterator();
		while(it.hasNext()) {
			answer[count] = (int) it.next();
			count += 1;
		}
		
		//{2,3,4,5,6,7} 출력
		//return answer;
		
	}
}
