package interfacepolymorphism;

public class MobileBrowser implements BrowserParent {
	public void nextPage() {
		System.out.println("아래로 스크롤");
	}
}
