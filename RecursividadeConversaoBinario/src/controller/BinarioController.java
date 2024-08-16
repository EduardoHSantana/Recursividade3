package controller;

public class BinarioController {

	public BinarioController() {
		super();
	}
    public String conversaoBinario(int n) {
    	//condição de parada
    	if(n == 0 || n == 1) {
    		return String.valueOf(n);
    	} else {
    		int resto = (n % 2);
    		n = n / 2;
    		return conversaoBinario(n) + String.valueOf(resto); //chamada da recursiva
    	}
    }
}
