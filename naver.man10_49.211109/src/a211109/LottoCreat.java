package a211109;

import java.util.Random;
import java.util.TreeSet;

public class LottoCreat {

	public static void main(String[] args) {
		//램던한 1~45까지의 숫자 6개를 저장
		//6개의 중복되지 않은 데이터를 저장하기에 가장 알맞은 자료구조의 생성
		//배열, List, Set, Map 중에 선택
		TreeSet<Integer> ts = new TreeSet<>();
		Random rd3= new Random();
		Random rd2= new Random(rd3.nextInt());
		Random rd = new Random(rd2.nextInt());
		int lotto = 0;
		
		while(ts.size() < 6) {
			lotto = rd.nextInt(45);
			if(lotto != 0){
				ts.add(lotto);
			}
		}
		for(int ss : ts) {
			System.out.println(ss);
		}


	}

}
