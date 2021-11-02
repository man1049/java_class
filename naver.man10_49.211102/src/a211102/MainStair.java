package a211102;

public class MainStair {

	public static void main(String[] args) {
		
		Stair[] stair = new Stair[3];
		
		for(int i = 0 ; i <= 2 ; i = i + 1) {
			stair[i] = new Stair();
		}

		for(int i = 0 ; i <= 2 ; i = i + 1) {
			stair[i].setS_num(i+1);
		}
		
		stair[0].setS_name("108계단　　");
		stair[1].setS_name("천국의계단");
		stair[2].setS_name("우리집계단");
		
		stair[0].setS_count(108);
		stair[1].setS_count(1009);
		stair[2].setS_count(30);
		
		for(int i = 0; i < stair.length ; i = i + 1) {
		System.out.println(stair[i].toString());
		}
		
		Stair stair2 = new Stair(1,"109계단",109);
		System.out.println(stair2.getS_name());
	}

}
