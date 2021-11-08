package a211108;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//Set은 중복된 데이터를 저장하지 않음
		//TreeSet은 순차적으로 접근하면 데이터를 크기 순서대로 리턴
		TreeSet<String> songs = new TreeSet<>();
		
		songs.add("김백산");
		songs.add("김백산");
		songs.add("김백선");
		songs.add("김백신");
		
		for(String song : songs) {
			System.out.println(song);
		}
	}

}
