package iftm.poo.aula01;

import java.util.Vector;

public class Programa28 {

	public static void main(String[] args) {
		Vector lista = new Vector();     // ** ACEITA QUALQUER TIPO DE VARIÁVEL
		
		// Vector<String> lista = new Vector<String>();     **INFORMA O TIP0 DE VARIÁVEL QUE VAI COLOCAR
		
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
