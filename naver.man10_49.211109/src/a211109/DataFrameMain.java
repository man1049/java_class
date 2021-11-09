package a211109;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DataFrameMain {

	public static void main(String[] args) {
		List<Team> list = new ArrayList<>();
		
		Team team = new Team();
		team.setTeamname("FC서울");
		team.setWin(19);
		team.setDefeat(5);
		team.setTie(9);
		team.getPlayers().add("김백산");
		team.getPlayers().add("손흥민");
		team.getPlayers().add("루카쿠");
		
		list.add(team);
		
		team = new Team();
		team.setTeamname("FC인천");
		team.setWin(19);
		team.setDefeat(9);
		team.setTie(5);
		team.getPlayers().add("장백산");
		team.getPlayers().add("이청룡");
		team.getPlayers().add("로벤");
		
		list.add(team);
		
		team = new Team();
		team.setTeamname("전남FC");
		team.setWin(14);
		team.setDefeat(10);
		team.setTie(9);
		team.getPlayers().add("태백산");
		team.getPlayers().add("이강인");
		team.getPlayers().add("펠라이니");
		
		list.add(team);
		
		team = new Team();
		team.setTeamname("리버풀");
		team.setWin(15);
		team.setDefeat(13);
		team.setTie(5);
		team.getPlayers().add("소백산");
		team.getPlayers().add("데용");
		team.getPlayers().add("이브라히모비치");
		
		list.add(team);

		for(Team tm : list) {
			System.out.print(tm.getTeamname()+"\t");
			System.out.print(tm.getCount()+"전\t");
			System.out.print(tm.getWin()+"승\t");
			System.out.print(tm.getTie()+"무\t");
			System.out.print(tm.getDefeat()+"패\t");
			System.out.print(tm.getPoints()+"점\t");
			for(String player : tm.getPlayers()) {
				System.out.print(player+" ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.이름 오름차순 2.승점 내림차순 3.종료");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				list.sort(new Comparator<Team>() {

					@Override
					public int compare(Team o1, Team o2) {
						return o1.getTeamname().compareTo(o2.getTeamname());
					}
					
				});
			}else if(menu == 2) {
				list.sort(new Comparator<Team>() {

					@Override
					public int compare(Team o1, Team o2) {
						//return o1.getPoints() - o2.getPoints();
						//만일 point가 실수라면
						double po = o1.getPoints() - o2.getPoints()*-1;
						if(po > 0) {
							return 1;
						}else if(po == 0) {
							return 0;
						}else {
							return -1;
						}
					}
					
				});
				
			}else if(menu == 3) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못된 메뉴선택");
			}
			
			//전체 데이터 출력
			for(Team t : list) {
				System.out.println(t.getTeamname() + "\t" + t.getPoints());
			}
			
			
		}
		
	}

}
