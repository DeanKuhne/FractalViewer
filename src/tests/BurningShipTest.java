package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.BurningShip;

public class BurningShipTest {

	@Test
	public void test() {
		BurningShip A = new BurningShip();
		assertEquals(255, A.escTimeBurningShip(-1.7443359374999874, -0.017451171875000338), 0.01);
	}
}
