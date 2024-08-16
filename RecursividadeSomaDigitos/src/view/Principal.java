package view;

import controller.SomaDigitosController;

public class Principal {

	public static void main(String[] args) {
		SomaDigitosController somadigcontr = new SomaDigitosController();
		int n = 18749;
		int resultado = somadigcontr.somaDigitos(n);
		System.out.println(resultado);

	}

}
