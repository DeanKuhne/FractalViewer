package code;

import static org.junit.Assert.*;

import org.junit.Test;

public class BurningShipTest {

	@Test
	public void test() {
		BurningShip A = new BurningShip();
		assertEquals(0 , A.escTimeBurningShip(), 0.001);
	}

	private void assertEquals(int i, int[][] escTimeBurningShip, double d) {
		// TODO Auto-generated method stub
		
	}

}
