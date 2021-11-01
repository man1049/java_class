package a211101;

public class GameRanks {
	private int rank = 0;
	private String game_name;
	private int price = 0;
	private int score = 0;
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	public String getGame_name() {
		return game_name;
	}
	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "순위 : " + rank + "\t 게임이름 : " + game_name + "\t 가격 : " + price + "\t 메타점수 : " + score;
	}
	
	
}
