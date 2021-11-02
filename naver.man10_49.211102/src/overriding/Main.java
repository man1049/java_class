package overriding;

public class Main {

	public static void main(String[] args) {
		Super spr = new Super();
		spr = new Sub();
		Sub sub = new Sub();
		
		sub.count();
	}
}