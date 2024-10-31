package studio7;

public class Die {
	private int sides;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int RollDie() {
		return (int)(Math.random()*(this.sides)+1);
	}
}
