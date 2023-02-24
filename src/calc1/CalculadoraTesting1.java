package calc1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTesting1 {
	
	@Test
	public void testSuma() {
		int res = Calculadora1.sumar(1, 2);
		int sol = 3;
		assertEquals(sol, res);
	}
	
	@Test
	public void testResta() {
		int res = Calculadora1.restar(6, 2);
		int sol = 4;
		assertEquals(sol, res);
	}

}
