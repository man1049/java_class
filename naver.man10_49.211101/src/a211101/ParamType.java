package a211101;

public class ParamType {
	public static void ValSwap(int a , int b) {
		int temp = 0 ;
		temp = a;
		a = b;
		b = temp;
	}
	public static void refSwap(int arp[]) {
		int temp = arp[0];
		arp[0] = arp[1];
		arp[1] = temp;
	}
}
