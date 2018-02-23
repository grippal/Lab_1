package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCasino.Die;
import pkgCasino.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			
			if (r.getScore() < 2 || r.getScore() > 12) {
				System.out.println("There is a problem!");
			}
		}

	}

}
