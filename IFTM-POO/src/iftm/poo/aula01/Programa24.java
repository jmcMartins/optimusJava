package iftm.poo.aula01;

import java.util.ArrayList;

public class Programa24 {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();     // ** ACEITA QUALQUER TIPO DE VARIÁVEL
		
		// ArrayList<String> lista = new ArrayList<String>();     **INFORMA O TIP0 DE VARIÁVEL QUE VAI COLOCAR
		
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
