package naver.man10_49.autospamfree;


public class AutoSpamUpdateCheck {

	AutoSpamUpdateCheck(){
	AutoSpamUpdateCheckDAO asucdao = AutoSpamUpdateCheckDAOImpl.sharedInstance();
	asucdao.updatecheck("1");
	}
	
}
