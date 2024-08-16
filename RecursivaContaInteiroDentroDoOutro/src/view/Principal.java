package view;

import controller.ContaINumeros;

public class Principal {

	public static void main(String[] args) {
		ContaINumeros contnumcontr = new ContaINumeros();
		int maior = 523578;
		int menor = 5;
		int resultado = contnumcontr.contaNumeros(maior, menor);
		System.out.println(resultado);

	}

}
