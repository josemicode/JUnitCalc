package calc4;

public class Calculadora4 {
	
	private int answer;
	
	public Calculadora4() {
		answer = 0;
	}
	
	public int sumar(int n1, int n2) {
		answer = n1 + n2;
		return (answer);
	}
	
	public int restar(int n1, int n2) {
		answer = n1 - n2;
		return (answer);
	}
	
	public int answer() {
		return answer;
	}
	
	public int division(int n1, int n2) {
		answer = n1/n2;
		return (answer);
	}
	
	public void timeout() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
