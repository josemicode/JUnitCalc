package calc2;

public class Calculadora2 {
	
	private int answer;
	
	public Calculadora2() {
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

}
