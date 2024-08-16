package view;

import controller.ContaDigitosController;

public class Principal {

	public static void main(String[] args) {
		ContaDigitosController contadigcontr = new ContaDigitosController();
		int n = 123456;
		int resultado = contadigcontr.contaDigitos(n);
		System.out.println(resultado);

	}

}
