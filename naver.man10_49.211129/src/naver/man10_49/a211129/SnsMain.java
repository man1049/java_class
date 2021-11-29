package naver.man10_49.a211129;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SnsMain {

	public static void main(String[] args) {
		SnsDAO snsdao = SnsDAOImpl.sharedInstance();
		UserInfoDTO uidto = new UserInfoDTO();
		
		String uiid = "man10_49";
		String uipw = "tt1324";
		String uinn = "김백산";
		String uiem = "man10_49@naver.com";
		String uipt = "user_default.png";
		String uiip = null;
		try {
			uiip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LocalDate now = LocalDate.now();
		Calendar gc = new GregorianCalendar(now.getYear(),now.getMonthValue(),now.getDayOfMonth());
		Date uidate = new Date(gc.getTimeInMillis());
		
		/*
		//회원가입
		uiid = snsdao.idcheck(uiid);
		uinn = snsdao.nncheck(uinn);
		uiem = snsdao.emcheck(uiem);
		
		uidto.setUiid(uiid);
		uidto.setUipw(uipw);
		uidto.setUinn(uinn);
		uidto.setUiem(uiem);
		uidto.setUipt(uipt);
		uidto.setUiip(uiip);
		uidto.setUidate(uidate);
		snsdao.join(uidto);
		*/
		/*
		//로그인
		
		boolean login = snsdao.login(uiid, uipw);
		
		if (login == false) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
		*/
		/*
		//정보 조회
		uidto = snsdao.getMe(uinn);
		
		System.out.println(uidto.toString());
		*/
		/*
		//정보 수정
		uidto = snsdao.getMe(uinn);
		
		uidto.setUipw("tt1049");
		uidto.setUinn("태백산");
		
		snsdao.infomodi(uidto);
		*/
		
		
		
	
	
	
	
	
	}

}
