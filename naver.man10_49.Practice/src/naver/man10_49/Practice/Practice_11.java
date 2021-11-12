package naver.man10_49.Practice;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Practice_11 {

	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2,3,4}; // 1,5
		int[] reserv = {1,2,3}; // 1,2,3,4,5
		int[] reserve;
		int count = 0;
		//1,2,3,5
		
		Arrays.sort(lost);
		Arrays.sort(reserv);
		
		
		Map<String,Integer> n_map = new TreeMap<>();
		
		for(int i = 1 ; i <= n ; i = i + 1) {
			n_map.put("n"+i, i);
		}
		
		for(int lst : lost) {
			n_map.remove("n"+lst);
		}
		
		for(int resev : reserve) {
			
			if(n_map.get("n"+resev) == null) {
				n_map.put("n"+resev, resev);
				continue;
			}else if(n_map.get("n"+(resev-1)) == null && resev != 1){
				n_map.put("n"+(resev-1), resev-1 );
				continue;
			}else if(n_map.get("n"+(resev+1)) == null && resev != n) {
				n_map.put("n"+(resev+1), resev+1 );
			}
			
		}
		System.out.println(n_map.toString());
		
		
		
		

	}

}
