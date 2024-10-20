package view;

import controller.ControllerListaEncadeada;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		
		ControllerListaEncadeada listaEnc = new ControllerListaEncadeada();
		
		listaEnc.intersec();
		listaEnc.uniao();
	}
	
}
