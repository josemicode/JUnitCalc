package calc3;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calc2.Calculadora2;

public class CalculadoraTesting3 {
	
	private Calculadora2 cal;
	
	@Before
	public void before() {
		System.out.println("before()");
		cal = new Calculadora2();
	}
	
	@After
	public void after() {
		System.out.println("after()");
	}
	
	@Test
	public void testSuma() {
		System.out.println("testSuma()");
		int res = cal.sumar(1, 2);
		int sol = 3;
		assertEquals(sol, res);
	}
	
	@Test
	public void testResta() {
		System.out.println("testResta()");
		int res = cal.restar(1, 2);
		int sol = -1;
		assertEquals(sol, res);
	}

}
