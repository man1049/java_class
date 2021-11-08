package a211108;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		
		//ArrayList와 LinkedList 속도 비교
		
		//ArrayList 와 LinkedList 생성
		ArrayList <Integer>al = new ArrayList<>();
		LinkedList <Integer>ll = new LinkedList<>();

			al.add(1);
			al.add(3);
			
			ll.add(1);
			ll.add(3);
			
			long star = System.nanoTime();
			for(int i = 0 ; i < 100000 ; i = i + 1) {
				al.add(1, 2);
			}
			long end = System.nanoTime();
			System.out.println(end-star);
			
			star = System.nanoTime();
			for(int i = 0 ; i < 100000 ; i = i + 1) {
				ll.add(1, 2);
			}
			end = System.nanoTime();
			System.out.println(end-star);
			
			
			star = System.nanoTime();
			for(int i = 0 ; i < 100000 ; i = i + 1) {
				al.get(2);
			}
			end = System.nanoTime();
			
			System.out.println(end-star);
			
			star = System.nanoTime();
			for(int i = 0 ; i < 100000 ; i = i + 1) {
				ll.get(2);
			}
			end = System.nanoTime();
			
			System.out.println(end-star);
	}

}
