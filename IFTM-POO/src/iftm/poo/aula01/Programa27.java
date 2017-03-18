package iftm.poo.aula01;

import java.util.LinkedList;

public class Programa27 {

	public static void main(String[] args) {
		LinkedList lista = new LinkedList();     // ** ACEITA QUALQUER TIPO DE VARIÁVEL
		
		// ALinkedList<String> lista = new LinkedList<String>();     **INFORMA O TIP0 DE VARIÁVEL QUE VAI COLOCAR
		
		lista.add("Margarido");
		lista.add("ADS");
		lista.add("IFTM");
		lista.add(666);
		lista.add(23.4f);
		lista.add('B');
		lista.add(true);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Dado na posição " + i + ": " + lista.get(i));
		}
	}

}
