package a211101;

public class Main4 {

	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 694;
		
		ParamType.ValSwap(n1, n2);
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		int[] n = {5,99};
		
		ParamType.refSwap(n);
		System.out.println("n[0] : "+n[0]);
		System.out.println("n[1] : "+n[1]);

	}

}
