
public class First {

	public static void main(String[] args) {
		int dob_ori = 2100000000;
		int dob = dob_ori;
		int[] tru3 = new int[32] ;
		int i = 0;
		boolean loop = true;

		while(loop) {
			if (dob != 0) {
				tru3[i] = dob%2;
				dob = dob/2;
				++i;
			}
			
			if (dob == 0) {
				while(loop) {
					tru3[i] = 8;
					if (i == 31) {loop = false;}
					if (i != 31) {++i;}
				}
			}
			try {/*Thread.sleep(50);*/}	catch(Exception e){System.out.print("에러");}
		}
		
		i = 32;
		loop = true;
		
		System.out.print(dob_ori + "의 2진수 : ");
		
		while(loop) 
		{
			--i;
			if(i == -1) {break;}
			if(tru3[i] != 8) 
			{
				
				System.out.print(tru3[i]);
					if (i/8 > 0 && i%8 == 0) {System.out.print(" ");}
			}
		}
		try {		}
		catch (Exception e) {		}
	}

}
