package controller;

public class FibonacciController {

	public FibonacciController() {
		super();
	}
	public int fibonacci(int n) {
		//condição de parada
		if(n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2); //chamada da recursiva
		}
	}

}
