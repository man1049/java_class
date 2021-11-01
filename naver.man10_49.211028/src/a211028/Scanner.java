package a211028;

public class Scanner {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		String[] info = new String[3];
		System.out.print("이름을 입력하세요 : ");
		info[0] = input.nextLine();
		System.out.print("나이를 입력하세요 : ");
		info[1] = input.nextLine();
		System.out.print("점수를 입력하세요 : ");
		info[2] = input.nextLine();
		
		System.out.println("");
		System.out.println("");
		System.out.println("입력된 정보");
		System.out.println("이름 : "+info[0]);
		System.out.println("나이 : "+Integer.parseInt(info[1]));
		System.out.println("점수 : "+Integer.parseInt(info[2]));
		
	}

}
