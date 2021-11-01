package naver.tkdalswoals.a211029;
import java.util.Scanner;

public class ArrayDataUpdate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] id_array = new String[3];
		int id_array_length = id_array.length;
		
		for(int i = 0 ; i < id_array_length ; i = i + 1 ) {
			System.out.print("이름 입력 : ");
			id_array[i] = scan.nextLine();			
		}
		
		for(int i = 0 ; i < id_array_length ; i = i + 1) {
			System.out.println(id_array[i]);
		}
		scan.close();
	}
}