package view;

import controller.FibonacciController;

public class Principal {

	public static void main(String[] args) {
		FibonacciController fibcontr = new FibonacciController();
		int n = 9;
		int resultado = fibcontr.fibonacci(n);
		System.out.println(resultado);
		

	}

}
