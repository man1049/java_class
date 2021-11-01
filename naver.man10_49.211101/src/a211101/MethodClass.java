package a211101;

public class MethodClass {
	public void h_java(int count) {
		for(int i = 0 ; i < count ; i = i + 1) {
		System.out.println("Hello Java");
		}
		System.out.println("");
		}
	public static int h_java2(int count) {
		int number = 0;
		for(int i = 0 ; i < count ; i = i + 1) {
		System.out.println("Hello Java");
		number = number + 1;
		}
		System.out.println("");
		return number;
	}
	public int h_java3(int count , int count_2) {
		System.out.println(count+count_2);
		return count+count_2;
	}
}
