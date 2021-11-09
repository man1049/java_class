package a211109;
import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private String teamname;
	private int count;
	private int win;
	private int tie;
	private int defeat;
	private int points;
	private List<String> players;
	
	public Team() {
		players = new ArrayList<>();
	}
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getCount() {
		count = win+defeat+tie;
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getTie() {
		return tie;
	}
	public void setTie(int tie) {
		this.tie = tie;
	}
	public int getDefeat() {
		return defeat;
	}
	public void setDefeat(int defeat) {
		this.defeat = defeat;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	public int getPoints() {
		points = (win * 3 + tie * 1) - (defeat*2);
		return points;
	}
	
	
	@Override
	public String toString() {
		return "팀명 : " + teamname + "\t" + getCount() + " 전 " + win + " 승 " + tie + " 무 "
				+ defeat + " 패\t" + getPoints() + " 점\t선수명단 : " + players;
	}
	
	
	
	
	
	
}
