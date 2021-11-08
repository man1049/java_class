package naver.man10_49.Practice;

public class Practice_5 {

	public static void main(String[] args) {
		int result = 0;
		String s = "one4oneseven5eight";
		String[] num_str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String num_res = "";

		for(int i = 0 ; i < 10 ; i = i + 1) {
			System.out.println(s);
			for(int j = 0 ; j < 10 ; j = j + 1) {
				if(s.charAt(0) >= '0' && s.charAt(0) <= '9')
				{
					num_res = num_res + s.charAt(0);
					s = s.substring(1);
					break;
				}
				if(s.matches("(.*)"+num_str[j]+"(.*)")){
					num_res = num_res + ((j)+"");
					s = s.substring(num_str[j].length());
					break;
				}
				/*
				
				else if(s.matches("(.*)"+(j)+"(.*)")){
					num_res = num_res + ((j)+"");
					s = s.substring(1);

					break;
				}
				*/
					
				}
		}
			
			
		//result = Integer.valueOf(num_res);
		System.out.print(num_res);
		

}
}
