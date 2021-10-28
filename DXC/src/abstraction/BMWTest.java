package abstraction;

import org.junit.Test;

import junit.framework.TestCase;

public class BMWTest extends TestCase {
	
	@Test
	public void testAdd() {
		
		int expected = 40;
		int actual = BmwFlyingCar.add(30, 10);
		assertEquals(expected, actual);
		
	}
}

	
