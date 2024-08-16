package view;

import controller.BinarioController;

public class Principal {

	public static void main(String[] args) {
		BinarioController bincontr = new BinarioController();
		int n = 23;
		String resultado = bincontr.conversaoBinario(n);
		System.out.println(n + resultado);
	}

}
