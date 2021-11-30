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
		
		int res = -1;
		
		String uiid = "man10_48";
		String uipw = "tt1049";
		String uinn = "소백산";
		String uiem = "man10_48@naver.com";
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
		//중복체크
		boolean idcheck = snsdao.idcheck(uiid);
		boolean nncheck = snsdao.nncheck(uinn);
		boolean emcheck = snsdao.emcheck(uiem);
		
		
		if(idcheck) {
			System.out.println("id중복");
		}else {
			System.out.println("id사용가능");
		}
		
		if(nncheck) {
			System.out.println("닉네임중복");
		}else {
			System.out.println("닉네임사용가능");
		}
		
		if(emcheck) {
			System.out.println("이메일중복");
		}else {
			System.out.println("이메일사용가능");
		}
		*/
		
		/*
		//회원가입
		
		if(idcheck == true) {
			System.out.println("아이디중복을 확인해주세요");
		}else if(nncheck == true){
			System.out.println("닉네임중복을 확인해주세요");
		}else if(emcheck == true){
			System.out.println("이메일중복을 확인해주세요");
		}else{
			uidto.setUiid(uiid);
			uidto.setUipw(uipw);
			uidto.setUinn(uinn);
			uidto.setUiem(uiem);
			uidto.setUipt(uipt);
			uidto.setUiip(uiip);
			uidto.setUidate(uidate);
			res = snsdao.join(uidto);
			if(res == 1) {
				System.out.println("가입성공");
			}else {
				System.out.println("가입실패");
			}
		}
		*/
		
		/*
		//로그인
		
		boolean login = snsdao.login(uiid, uipw);
		
		if (login) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		*/
		
		/*
		//정보 조회
		uidto = snsdao.getInfo(uinn);
		if(uidto.getUinum() == 0) {
		System.out.println("정보가 없습니다.");
		}else {
			System.out.println(uidto.toString());
		}
		*/
		
		
		//정보 수정
		uidto = snsdao.getInfo(uinn);
		
		uidto.setUipw("tt1049");
		uidto.setUinn("태백산");
		
		res = snsdao.infomodi(uidto);
		if(res == 1) {
			System.out.println("정보수정 성공");
		}else {
			System.out.println("정보수정 실패");
		}
		
		
		/*
		//정보 삭제
		res = snsdao.infodel(uiid, uipw);
		if(res == 1) {
			System.out.println("정보삭제 성공");
		}else {
			System.out.println("정보삭제 실패");
		}
		*/
		
		
	
	
	
		snsdao.closeconnect();
	
	}

}
