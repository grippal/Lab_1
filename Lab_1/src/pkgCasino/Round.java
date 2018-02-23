package pkgCasino;

import java.util.LinkedList;

public class Round {
	
	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	private String result;
	
		
	public Round() {
		Roll r = new Roll();
		rolls.add(r);
		
		while (isPoint() && !checkPoint() && !rolls.getLast().isSeven()) {
			Roll r2 = new Roll();
			rolls.add(r2);
		}
		
		if (rolls.getFirst().isNatural()) {
			result = "Natural, you lose!";
			eGameResult = eGameResult.NATURAL;
		}
		else if (rolls.getFirst().isCraps()) {
			result = "Craps!";
			eGameResult = eGameResult.CRAPS;
		}
		else if (RollCount() > 1 && rolls.getLast().getScore() == 7) {
			result = "Seven-Out, you lose!";
			eGameResult = eGameResult.SEVEN_OUT;
		}
		else if (checkPoint()) {
			result = "Point, you win!";
			eGameResult = eGameResult.POINT;
		}
		
		System.out.println(result);
		
	}
	
	
	private Roll ComeOutRoll() {
		ComeOutScore = rolls.getFirst().getScore();
		return rolls.getFirst();
	}
	
	private boolean isComeOut() {
		return rolls.size() == 1;
	}
	
	private boolean isNatural() {
		return ComeOutRoll().isNatural();
	}
	
	private boolean isCraps() {
		return ComeOutRoll().isCraps();
	}
	
	private boolean isPoint() {
		return ComeOutRoll().isPoint();
	}
	
	private boolean checkPoint() {
		if (RollCount() > 1 && rolls.getFirst().getScore() == rolls.getLast().getScore()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private int getComeOutScore() {
		return ComeOutScore;
	}
	
	private int RollCount() {
		return rolls.size(); 
	}
	
	private Roll getLast() {
		return rolls.getLast();
	}
	
	
	public static void main(String[] args) {
		Round run = new Round();
		System.out.println(run.getComeOutScore());
		System.out.println(run.getLast().getScore());
		System.out.println(run.RollCount());
	}
}

