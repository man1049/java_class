package a211101;

public class GameRanksMain {

	public static void main(String[] args) {
		GameRanks[] gr1 = new GameRanks[5];
		for(int i = 0 ; i < 5 ; i = i + 1) {
			gr1[i] = new GameRanks();
		}
		for(int i = 0 ; i < 5 ; i = i + 1) {
			gr1[i].setRank(i+1);
			gr1[i].setPrice((i+1)*10000);
			gr1[i].setScore((i+1)*10);
		}
		gr1[0].setGame_name("레드데드리뎀션");
		gr1[1].setGame_name("GTA V");
		gr1[2].setGame_name("GTA IV");
		gr1[3].setGame_name("GTA II");
		gr1[4].setGame_name("GTA 산안드레아스");
		/*
		for(int i = 0 ; i < gr.length ; i = i + 1) {
			System.out.print(gr1[i].getRank()+"\t");
			
		}
		System.out.println("");
		for(int i = 0 ; i < gr.length ; i = i + 1) {
			System.out.print(gr1[i].getGame_name()+"\t");
			
		}
		System.out.println("");
		for(int i = 0 ; i < gr.length ; i = i + 1) {
			System.out.print(gr1[i].getPrice()+"\t");
			
		}
		System.out.println("");
		for(int i = 0 ; i < gr.length ; i = i + 1) {
			System.out.print(gr1[i].getScore()+"\t");
			
		}
		System.out.println("");
		*/
		/*
		for(GameRanks gr : gr1) {
			System.out.println(gr);
		}
		*/
		/*
		System.out.println(gr1[0]);
		System.out.println(gr1[1]);
		System.out.println(gr1[2]);
		System.out.println(gr1[3]);
		System.out.println(gr1[4]);
		*/
	}

}
