package interfacepolymorphism;

public class PCBrowser implements BrowserParent {
	public void nextPage(){
		System.out.println("다음 페이지 번호 클릭");
	}
}
