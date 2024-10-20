package controller;

import ControllerLista.Lista;

public class ControllerListaEncadeada {
	
	Lista<Integer> a = new Lista<Integer>();
	Lista<Integer> b = new Lista<Integer>();
	Lista<Integer> i = new Lista<Integer>();
	Lista<Integer> u = new Lista<Integer>();
	
	public ControllerListaEncadeada() throws Exception {
		a.addLast(3);
		a.addLast(5);
		a.addLast(8);
		a.addLast(12);
		a.addLast(9);
		a.addLast(7);
		a.addLast(16);
		
		b.addLast(9);
		b.addLast(6);
		b.addLast(2);
		b.addLast(3);
		b.addLast(7);

	}
	
	public void intersec() throws Exception {
		
		for(int x = 0; x < a.size(); x++) {
			for(int y = 0; y < b.size(); y++) {
				if(a.get(x) == b.get(y)) {
					i.addLast(a.get(x));
				}
			}
		}
		
		for(int x = 0; x < i.size(); x++) {
			System.out.println(i.get(x));
		}
		
	}
	
	public void uniao()throws Exception {
		boolean repete = false;
		boolean insereB = false;
		for(int x = 0; x < a.size(); x++) {
			for(int y = 0; y < b.size(); y++) {
				if(insereB == false) {
					u.addLast(b.get(y));
				}if(a.get(x) == b.get(y)) {
					repete = true;
				}
			}
			if(repete == false) {
				u.addLast(a.get(x));
			}
			insereB = true;
			repete = false;
		}
		for(int x = 0; x < u.size(); x++) {
			System.out.println(u.get(x));
		}
	}
	
}
