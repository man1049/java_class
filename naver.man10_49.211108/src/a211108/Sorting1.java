package a211108;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting1 {
	
	public static void main(String[] args) {
		

	String [] ar = {"아이린", "슬기", "조이", "예리", "웬디"};
	//문자열 내림차순 정렬 - Array.sort 메서드 이용
	//Comparator를 구현한 클래스 만들기
	class Temp implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			
			return o2.compareTo(o1);
		}
	}
	Arrays.sort(ar,new Temp());
	System.out.println(Arrays.toString(ar));
	
	
	Integer [] ar2 = {50,60,10,20,30,40,70,80,90};
	//문자열 내림차순 정렬 - Array.sort 메서드 이용
	//Comparator를 구현한 클래스 만들기
	class Temp2 implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			System.out.println("o2 : "+o2 + "\t o1 : " + o1 + "\to2-o1 : "+(o2-o1));
			return o2-o1;
		}
	}
	Arrays.sort(ar2,new Temp2());
	System.out.println(Arrays.toString(ar2));
	}
}
