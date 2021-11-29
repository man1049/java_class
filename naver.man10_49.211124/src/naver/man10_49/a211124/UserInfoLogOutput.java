package naver.man10_49.a211124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public class UserInfoLogOutput {
	private static BufferedReader br = null;
	private static PrintWriter pwr = null;
	private static LocalTime ltime = LocalTime.now();
	private static LocalDate ldate = LocalDate.now();
	private static String now_date = Integer.toString(ldate.getYear()) +Integer.toString(ldate.getMonthValue())+Integer.toString(ldate.getDayOfMonth());
	private static String now_time = Integer.toString(ltime.getHour());
	private static String log_read_string = " ";
	
	public void ExceptionOutputCreateFile() {
		try {
			br = new BufferedReader(new FileReader("./"+now_date+"_log.txt"));
			
		} catch (Exception e2) {
			try {
				pwr = new PrintWriter("./"+now_date+"_log.txt")/*new FileOutputStream()*/;
			} catch (Exception e1) {}
			pwr.println(now_date+"log");
			pwr.flush();
			pwr.close();
		}
	}
	
	public void ExceptionOutput(Exception e) {
		//Exception시 로그파일만들기
		try {
			StringBuilder sb = new StringBuilder();
			br = new BufferedReader(new FileReader("./"+now_date+"_log.txt"));
			while(br.ready()) {
				sb.append(br.readLine()+"\n");
			}
			
			log_read_string = sb.toString();
			//System.out.println(log_read_string);
			br.close();
		} catch (Exception e1) {/*System.out.println("불러오기경로오류");*/}

		try {
			pwr = new PrintWriter("./"+now_date+"_log.txt");
			pwr.println(now_date+" / "+ltime.getHour()+":"+ltime.getMinute()+":"+ltime.getSecond()+":"+" / "+e+log_read_string);
			pwr.flush();
			pwr.close();
		} catch (Exception e1) {/*System.out.println("저장경로오류"); System.out.println(e1.getLocalizedMessage());*/}
	}



}
