package controller;

public class ContaINumeros {

	public ContaINumeros() {
		super();
		}
    public int contaNumeros(int maior, int menor) {
    	//condição de parada
    	if (maior / menor < 1) {
    		return 0;
    	} else {
    		if (maior % 10 == menor) {
    			maior = maior / 10;
    			return 1 + contaNumeros(maior, menor);
    		} else {
    			maior = maior / 10;
    			return contaNumeros(maior, menor);
    		}
    	}
    }
}