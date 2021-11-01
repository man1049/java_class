package a211101;

public class Main2 {

	public static void main(String[] args) {
		Games.ent = "락스타게임즈";
		
		Games games[] = new Games[5];
		
		for (int i=0 ; i < games.length ; i = i + 1) {
			games[i] = new Games();
		}
		
		
		games[0].g_name = "레드데드리뎀션";
		games[1].g_name = "GTA V";
		games[2].g_name = "GTA 산안드레아스";
		games[3].g_name = "GTA 바이스시티";
		games[4].g_name = "GTA II";
		games[0].price = 67000;
		games[1].price = 55000;
		games[2].price = 21000;
		games[3].price = 7000;
		games[4].price = 5000;
		games[0].score = 97;
		games[1].score = 89;
		games[2].score = 77;
		games[3].score = 67;
		games[4].score = 50;
		
		
		System.out.println(Games.ent);
		
		for(int i = 0 ; i <= games.length-1 ; i = i + 1) {
			System.out.println(games[i].g_name+"\t\t"+games[i].price+"\t\t"+games[i].score);
		}
	}
}
