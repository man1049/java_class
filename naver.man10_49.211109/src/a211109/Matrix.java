package a211109;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
		//스타크래프트 유닛 명단을 종족별로 저장
		//3개의 종족이 존재하고 각 종족에는 여러가지 유닛이 존재

		//각 팀 선수 명단
		String[] zerg = {"저글링","히드라","울트라","스커지","드론","뮤탈","디파일러"};
		String[] terran = {"마린","시즈탱크","벌쳐","메딕","SCV"};
		String[] protoss = {"질럿","드라군","리버","옵저버","프로브"};

		//2개의 배열을 하나의 배열로 생성 - 동일한 성격을 갖는 데이터는 하나로 관리
		String [][] starcraft = {zerg,terran,protoss};

		//데이터 출력 - 팀 선수 명단을 줄 단위로 출력
		for(int i = 0 ; i < starcraft.length ; i = i + 1) {
			String[] ztp = starcraft[i];
			
			if(i == 0) {
				System.out.print("저그\t\t");
			}else if(i == 1) {
				System.out.print("테란\t\t");
			}else if(i == 2) {
				System.out.print("프로토스\t\t");
			}

			for(String unit : ztp) {
				System.out.print(unit+"\t");
			}
			System.out.println();
		}
		System.out.println("//////////////////////////////////////////////////////");
		Map<String, Object> map = new HashMap<>();
		Map<String, Object> map2 = new HashMap<>();
		Map<String, Object> map3 = new HashMap<>();
		
		map.put("스타크래프트", zerg);
		map2.put("스타크래프트", terran);
		map3.put("스타크래프트", protoss);

		Map[] maps = {map,map2,map3};
		int i = 0;
		for(Map<String,Object> star : maps) {
			i++;
			String[] a = (String[]) star.get("스타크래프트");
			
			System.out.println(a[i]);
			
			
		}
	}

}
