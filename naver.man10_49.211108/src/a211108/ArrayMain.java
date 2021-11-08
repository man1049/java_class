package a211108;
import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		//배열 생성
		String[] soccers = {"반페르시" , "로벤", "루카쿠"};
		
		//데이터 확인 - 디버깅
		//배열은 바로 toString을 호출하면 요소의 클래스 이름과 해시코드가 리턴
		System.out.print(soccers+"\n");
		//Arrays 클래스의 toString을 이용하면 배열의 각 요소의 toString호출
		System.out.println(Arrays.toString(soccers));
		
		//soccers 배열을 복사해서 새로운 배열을 생성
		//java.util.Arrays 클래스의 copyOf 라는 메서드를 이용 할 수 있음
		
		String[] pro = Arrays.copyOf(soccers, soccers.length);
		System.out.println(pro);
		System.out.println(Arrays.toString(pro));
		
		Arrays.sort(soccers);
		System.out.println(Arrays.toString(soccers));
		
	}

}
