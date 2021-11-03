package gameinfo;

public class Game {
	
	private String game_com;
	private String game_name;
	private String game_date;
	private String game_jangrr;
	private int game_price;
	private double game_score;
	private boolean admin;
	private boolean admin_login;
	
	
	
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getGame_com() {
		return game_com;
	}
	public void setGame_com(String game_com) {
		this.game_com = game_com;
	}
	public String getGame_name() {
		return game_name;
	}
	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}
	public String getGame_date() {
		return game_date;
	}
	public void setGame_date(String game_date) {
		this.game_date = game_date;
	}
	public String getGame_jangrr() {
		return game_jangrr;
	}
	public void setGame_jangrr(String game_jangrr) {
		this.game_jangrr = game_jangrr;
	}
	public int getGame_price() {
		return game_price;
	}
	public void setGame_price(int game_price) {
		this.game_price = game_price;
	}
	public double getGame_score() {
		return game_score;
	}
	public void setGame_score(double game_score) {
		this.game_score = game_score;
	}
	public boolean isAdmin_login() {
		return admin_login;
	}
	public void setAdmin_login(boolean admin_login) {
		this.admin_login = admin_login;
	}
	@Override
	public String toString() {
		return "Game [game_com=" + game_com + ", game_name=" + game_name + ", game_date=" + game_date + ", game_jangrr="
				+ game_jangrr + ", game_price=" + game_price + ", game_score=" + game_score + ", admin=" + admin
				+ ", admin_login=" + admin_login + "]";
	}

	
	
	
	
}
