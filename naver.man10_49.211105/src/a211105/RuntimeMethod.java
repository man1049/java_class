package a211105;

import java.io.IOException;
import java.lang.Runtime;
import java.lang.Process;

public class RuntimeMethod {

	public static void main(String[] args) {
		
		
		try {
			for(int i = 0 ; i < 10 ; i++) {
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
