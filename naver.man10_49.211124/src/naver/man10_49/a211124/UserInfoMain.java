package naver.man10_49.a211124;

import java.sql.Date;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class UserInfoMain {
	


	public static void main(String[] args) {
		//UserInfoDAO 인스턴스 생성
		UserInfoDAO userinfoDAO = UserInfoDAOImpl.sharedInstance();
		/*
		//데이터 호출
		List<UserInfoDTO> list = userinfoDAO.getList();
		for(UserInfoDTO uidto : list) {
			System.out.println(uidto);
		}
		*/
		//데이터 1개 가져오기
		/*
		UserInfoDTO ui= userinfoDAO.getUserInfo(1);
		if(ui == null) {
			System.out.println("데이터가 없음");
		}else {
			System.out.println(ui);
		}
		*/
		
		//데이터 1개 삽입하기
		
		UserInfoDTO uidto = new UserInfoDTO();
		Calendar cal = new GregorianCalendar(1976,2,11);
		Date date = new Date(cal.getTimeInMillis());
		
		uidto.setUidate(date);
		uidto.setUiaddress("전남 목포");
		uidto.setUiname("백항구");
		uidto.setUinickname("목포는항구다");

		userinfoDAO.insertUserInfo(uidto);
		
		/*
		UserInfoDTO ui = userinfoDAO.getUserInfo(2);
		 
		if(ui == null) {
			System.out.println("데이터가 없음");
		}else {
			ui.setUinickname("야구빠따");
			userinfoDAO.updateUserInfo(ui);
		}
		*/

		//삭제
		//userinfoDAO.deleteUserInfo(7);

		
	}

}
