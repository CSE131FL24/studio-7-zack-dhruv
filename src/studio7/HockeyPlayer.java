package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private String shootingHand;
	private int goals;
	private int assists;
	public int games;
	public HockeyPlayer(String name, int number, String hand) {
		this.name = name;
		this.number = number;
		this.shootingHand = hand;
		this.goals = 0;
		this.assists = 0;
		this.games = 0;
	}
	
	public void recordStats(int goals, int assists) {
		this.goals+= goals;
		this.assists+=assists;
		this.games+=1;
	}
	
	public int getPoints() {
		return this.assists + this.goals;
	}
	
	public double getAverageAssists() {
		if(this.games == 0) {
			return 0;
		}
		return this.assists/this.games;
	}
	public double getAverageGoals() {
		if(this.games == 0) {
			return 0;
		}
		return this.goals/this.games;
	}
}
