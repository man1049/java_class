package interfacepolymorphism;

public interface BrowserParent {
	final int LEFT_CLICK = 0;
	final int RIGHT_CLICK = 1;
	final int WHEEL_CLICK = 2;
	public abstract void nextPage();
}
