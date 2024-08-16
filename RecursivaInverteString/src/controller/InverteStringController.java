package controller;

public class InverteStringController {

	public InverteStringController() {
		super();
	}
    public String inverteString(String palavra, int posicao) {
    	//condição de parada
    	if (posicao == 0) {
    		return " ";
    	} else {
    		String ultimaLetra = palavra.substring(posicao - 1, posicao);
    		posicao = posicao - 1;
    		return ultimaLetra + inverteString(palavra, posicao);
    	}
    }
}
