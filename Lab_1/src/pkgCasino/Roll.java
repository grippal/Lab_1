package pkgCasino;

public class Roll {

	private Die die1;
	private Die die2;
	
	
	public Roll() {
		die1 = new Die();
		die2 = new Die();
	}
	
	public int getScore() {
		return (die1.getDieValue() + die2.getDieValue());
		}
	
	public boolean isSeven() {
		return (getScore() == 7);
	}
	
	public boolean isNatural() {
		return (isSeven() || getScore() == 11);
		
	}
	
	public boolean isCraps() {
		return (getScore() == 2 || getScore() == 3 || getScore() == 12);
	}
	
	public boolean isPoint() {
		return (getScore() == 4 || getScore() == 5 || getScore() == 6 || getScore() == 8 || getScore() == 9 || getScore() == 10);
	}
}
