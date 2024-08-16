package controller;

public class ContaDigitosController {

	public ContaDigitosController() {
		super();
	} 
	public int contaDigitos(int n) {
	//condição de parada
	if(n / 10 < 1) {
		return 1;
	} else {
	   n = n / 10;
	   return 1 + contaDigitos(n); // chamada da função recursiva
	   
	}

	}
}