package iftm.poo.lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		int i=0;
		while( ! frutas.contains("zero") ){
			i++;
			System.out.println("Digite a "+i+"º Fruta: ");
			frutas.add(teclado.nextLine());
		}
		for (int j = 0; j < frutas.size()-1; j++) {
			System.out.println(frutas.get(j));
		}
		teclado.close();
	}
}