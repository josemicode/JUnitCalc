package calc2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTesting2 {
	
	@Test
	public void testSuma() {
		Calculadora2 cal = new Calculadora2();
		int res = cal.sumar(1, 2);
		int sol = 3;
		assertEquals(sol, res);
	}
	
	@Test
	public void testResta() {
		Calculadora2 cal = new Calculadora2();
		int res = cal.restar(1, 2);
		int sol = -1;
		assertEquals(sol, res);
	}

}
