package calc4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTesting4 {
	
	private Calculadora4 cal;
	
	@Before
	public void before() {
		System.out.println("before()");
		cal = new Calculadora4();
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

	@Test
	public void testDivision() {
		System.out.println("testDivision()");
		int res = cal.division(8, 4);
		int sol = 2;
		assertEquals(sol, res);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionExcep() {
		System.out.println("divisionExcep()");
		cal.division(5, 0);
	}
	
	@Test(timeout = 2500)
	public void testTimeout() {
		cal.timeout();
	}
}
