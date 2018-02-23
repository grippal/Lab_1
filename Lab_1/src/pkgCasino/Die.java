package pkgCasino;

public class Die {
	
	private int DieValue;
	
	
	public Die()
	{
		this.DieValue = (int)(Math.random() * 6 + 1);
	}
	
	public int getDieValue() {
		return DieValue;
	}
}
