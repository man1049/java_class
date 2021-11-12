package naver.man10_49.Practice;

import java.util.Arrays;

public class Practice_3 {

	public static void main(String[] args) {
		
		////프로그래머스 코딩테스트 1단계 소수만들기
		
		int[] nums = {1,2,3,4};
		int temp1 = 0;
		int temp2 = 0;
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length-2; i = i + 1) {
			
			for(int j = i+1; j < nums.length-1 ; j = j + 1) {
				
				for(int k = j+1; k < nums.length ; k = k + 1) {
					
					for(int n = 2 ; n <= (nums[i]+nums[j]+nums[k]) ; n = n + 1) {
						
						if((nums[i]+nums[j]+nums[k])%n == 0) {
							temp1 ++;
						}
					}
					
					if (temp1 == 1) {
						temp2 ++;
					}
					temp1 = 0;
				}
			}
		}
	}
}
