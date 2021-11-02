package polymorphism;

public class Main {

	public static void main(String[] args) {
		Attack attack = new Terran();
		attack.attack();
		
		attack = new Protoss();
		attack.attack();
		
		attack = new Zerg();
		attack.attack();
		

	}

}
