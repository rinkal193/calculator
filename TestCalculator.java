package demoTest;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
	
	

	Calculator c1 = new Calculator();
	
	@Test
	public void testAdd() {
		
		int expectResult = 25;
		int actualResult = c1.add(15, 10);
		
		Assert.assertEquals(expectResult, actualResult);
		
	}
	
	@Test
	public void testSub() {
		
		int expectResult = 5;
		int actualResult = c1.sub(15, 10);
		
		Assert.assertEquals(expectResult, actualResult);
		
	}
	
	@Test
	public void testMul() {
		
		int expectResult = 150;
		int actualResult = c1.mul(15, 10);
		
		Assert.assertEquals(expectResult, actualResult);
		
	}
	
	@Test
	public void testDiv() {
		
		int expectResult = 3;
		int actualResult = c1.div(15, 5);
		
		Assert.assertEquals(expectResult, actualResult);
		
	}
	

}
