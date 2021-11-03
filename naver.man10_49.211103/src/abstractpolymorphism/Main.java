package abstractpolymorphism;

public class Main {

	public static void main(String[] args) {
		BrowserParent bp = new MobileBrowser();
		bp.nextPage();
		bp = new PCBrowser();
		bp.nextPage();

	}

}
