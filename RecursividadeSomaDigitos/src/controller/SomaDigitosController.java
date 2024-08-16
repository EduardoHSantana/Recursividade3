package controller;

public class SomaDigitosController {

	public SomaDigitosController() {
		super();
	}
    public int somaDigitos(int n) {
    	//condição de parada
    	if(n / 10 < 1) {
    		return n;
    	} else {
    		int resto = n % 10;
    		n = n / 10;
    		return resto + somaDigitos(n);     //chamada da recursiva
    	}
    }
}
