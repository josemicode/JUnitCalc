package calc7;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import calc5.CalculadoraTesting5;
import calc6.CalculadoraParaTest;

@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraParaTest.class,
	CalculadoraTesting5.class
})
public class TestSuite {

}
