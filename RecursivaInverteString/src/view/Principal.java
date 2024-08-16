package view;

import controller.InverteStringController;

public class Principal {

	public static void main(String[] args) {
		InverteStringController invstrcontr = new InverteStringController();
		String entrada = "corinthians";
		int tamanho = entrada.length();
		String resultado = invstrcontr.inverteString(entrada, tamanho);
		System.out.println(resultado);

	}

}
