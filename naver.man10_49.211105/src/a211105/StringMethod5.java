package a211105;

public class StringMethod5 {

	public static void main(String[] args) {
		
		//현재 시간
		long start = System.nanoTime();

		//작업 수행
		for(long i = 0 ; i < 10000000000L; i++) {}

		//뒤의 시간에서 앞의 시간을 빼면 작업을 수행하는데 걸린 시간
		long end = System.nanoTime();
		System.out.println("i++ 걸린 시간 " + (end-start));
		//현재 시간

		start = System.nanoTime();

		//작업 수행
		for(long i = 0 ; i < 10000000000L; i = i + 1) {}

		//뒤의 시간에서 앞의 시간을 빼면 작업을 수행하는데 걸린 시간
		end = System.nanoTime();
		System.out.println("i=i+1 걸린 시간 " + (end-start));


	}

}
