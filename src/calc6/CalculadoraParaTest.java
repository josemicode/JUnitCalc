package calc6;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calc4.Calculadora4;

@RunWith(value = Parameterized.class)
public class CalculadoraParaTest {
	
	@Parameters
	public static Iterable<Object[]> getData(){
		List<Object[]> objs = new ArrayList<>();
		objs.add(new Object[] {2,3,5});
		objs.add(new Object[] {2,2,4});
		objs.add(new Object[] {3,3,6});
		return objs;
	}
	
	private int n1, n2, sol;

	public CalculadoraParaTest(int n1, int n2, int sol) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.sol = sol;
	}
	
	@Test
	public void testSuma() {
		Calculadora4 cal = new Calculadora4();
		int res = cal.sumar(n1, n2);
		assertEquals(sol, res);
	}
}
