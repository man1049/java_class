package a211109;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataFrameMapUse {

	public static void main(String[] args) {
		//Mapy을 이용해서 하나의 행을 표현하면 DTO 클래스가 필요없음
		//여기서 주의할점은 key를 문자열로 작성하기 떄문에 key 이름을 정확하게 기억해야 함
		//get을 이용해서 가져온 후 사용 할 때 강제 형 변환을 해주어야 함
		List<Map<String, Object>> list =
				new ArrayList();
		
		int item = 0;
		
		//1개의 데이터를 생성해서 추가하기
		Map<String, Object> map = new HashMap<>();
		map.put("팀명", "FC서울");
		map.put("승", 6);
		map.put("패", 10);
		map.put("무", 3);
		map.put("전", (Integer)map.get("승") + (Integer)map.get("패") + (Integer)map.get("무"));
		map.put("점수", (Integer)map.get("승")*3 + (Integer)map.get("패")*(-2) + (Integer)map.get("무"));
		map.put("업적", item);
		
		list.add(map);
		
		map = new HashMap<>();
		map.put("팀명", "인천FC");
		map.put("승", 8);
		map.put("패", 8);
		map.put("무", 3);
		map.put("전", (Integer)map.get("승") + (Integer)map.get("패") + (Integer)map.get("무"));
		map.put("점수", (Integer)map.get("승")*3 + (Integer)map.get("패")*(-2) + (Integer)map.get("무"));
		map.put("업적", item);
		
		list.add(map);
		
		map = new HashMap<>();
		map.put("팀명", "리버풀");
		map.put("승", 11);
		map.put("패", 1);
		map.put("무", 7);
		map.put("전", (Integer)map.get("승") + (Integer)map.get("패") + (Integer)map.get("무"));
		map.put("점수", (Integer)map.get("승")*3 + (Integer)map.get("패")*(-2) + (Integer)map.get("무"));
		map.put("업적", item);
		
		list.add(map);
		
		map = new HashMap<>();
		map.put("팀명", "뮌헨");
		map.put("승", 9);
		map.put("패", 3);
		map.put("무", 7);
		map.put("전", (Integer)map.get("승") + (Integer)map.get("패") + (Integer)map.get("무"));
		map.put("점수", (Integer)map.get("승")*3 + (Integer)map.get("패")*(-2) + (Integer)map.get("무"));
		map.put("업적", item);
		
		list.add(map);
		
		for(Map<String , Object> mp : list) {
			System.out.print(mp.get("팀명")+"\t");
			System.out.print(mp.get("전")+"전\t");
			System.out.print(mp.get("승")+"승\t");
			System.out.print(mp.get("무")+"무\t");
			System.out.print(mp.get("패")+"패\t");
			System.out.print(mp.get("점수")+"점\t");
			System.out.print(mp.get("업적")+"개\n");
		}
		
		System.out.print("////////////////////////////////////////////////////////////\n");
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			int size = i + 2;
			for(; i < size ; i = i +1) {
					System.out.print(list.get(i).get("팀명")+"\t");
					System.out.print(list.get(i).get("전")+"전\t");
					System.out.print(list.get(i).get("승")+"승\t");
					System.out.print(list.get(i).get("무")+"무\t");
					System.out.print(list.get(i).get("패")+"패\t");
					System.out.print(list.get(i).get("점수")+"점\t");
					System.out.print(list.get(i).get("업적")+"개\n");
					
			}
			if(size == list.size()) {
				break;
			}
			System.out.println("엔터를 누르면 다음 2개가 나옵니다.");
			sc.nextLine();
		}
		
		System.out.print("////////////////////////////////////////////////////////////\n");
		
		// 내부데이터 오름차순
		list.sort(new Comparator<Map<String,Object>>(){
			
			//내부데이터를 다른 용도로 사용시 강제형변환을 이용해서 사용
			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				String front = (String)o1.get("팀명");
				String back = (String)o2.get("팀명");
				return front.compareTo(back);
			}
		});
		
		for(Map<String, Object> mp : list) {
			System.out.print(mp.get("팀명")+"\t");
			System.out.print(mp.get("전")+"전\t");
			System.out.print(mp.get("승")+"승\t");
			System.out.print(mp.get("무")+"무\t");
			System.out.print(mp.get("패")+"패\t");
			System.out.print(mp.get("점수")+"점\t");
			System.out.print(mp.get("업적")+"개\n");
		}
		System.out.print("////////////////////////////////////////////////////////////\n");
		list.sort(new Comparator<Map<String, Object>>(){

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				return ((Integer)o1.get("점수")-(Integer)o2.get("점수")) *(-1);
			}
			
		});

		for(Map<String, Object> mp : list) {
			System.out.print(mp.get("팀명")+"\t");
			System.out.print(mp.get("전")+"전\t");
			System.out.print(mp.get("승")+"승\t");
			System.out.print(mp.get("무")+"무\t");
			System.out.print(mp.get("패")+"패\t");
			System.out.print(mp.get("점수")+"점\t");
			System.out.print(mp.get("업적")+"개\n");
		}
		
		System.out.print("////////////////////////////////////////////////////////////\n");

	}

}
