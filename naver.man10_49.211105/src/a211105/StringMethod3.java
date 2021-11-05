package a211105;

public class StringMethod3 {

	public static void main(String[] args) {
		String filename1 = "String.5253.75732.134.png";
		String filename2 = "String";
		
		//확장자 찾기
		//split을 이용해서 할 수 있고
		//indexOf(lastIndexOf) 와 substring 을 이용 할 수도 있습니다.
		
		//split 은 패턴을 찾아서 분할해 배열로 리턴
		//패턴이 없으면 배열을 리턴하는데 분할하지않고 원본 그대로 1개만 리턴
		String [] result = filename2.split("\\.");
		
		if(result.length > 1) {
			//result.length가 1보다 클 시 result.length-1 을 출력
			System.out.println(result[result.length-1]);
		}else {
			System.out.println("확장자 없음");
		}

	}

}
