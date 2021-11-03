package polymorphism_pt;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sc_res;
		Base_mnp bmp = null;
		
		System.out.print("PC입니까 Mobile 입니까? \n1.PC\t2.Mobile : ");
		sc_res = sc.nextInt();
		
		if (sc_res == 1) {
			bmp = new Pc();
		}
		if (sc_res == 2) {
			bmp = new Mobile();
		}else {
			bmp = new Pc();
		}
		
		bmp.browser();
		sc_res = 0;

	}

}
