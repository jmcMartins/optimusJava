package iftm.poo.lista1;

import java.util.Scanner;
import java.util.Vector;

public class Programa9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Vector nome = new Vector();
		Vector idade = new Vector();
		Vector peso = new Vector();
		
		while(! nome.contains("fim") ){
			System.out.println("Digite seu nome: ");
			nome.add(teclado.nextLine());
			if(! nome.contains("fim")){
			System.out.println("Digite sua idade: ");
			idade.add(Integer.parseInt(teclado.nextLine()) );
			System.out.println("Digite seu peso: ");
			peso.add(Integer.parseInt(teclado.nextLine()) );
			}
		}	
		System.out.println("");
		for (int i = 0; i < nome.size()-1; i++) {
			System.out.println("Nome: "+nome.get(i));
			System.out.println("Idade: "+idade.get(i));
			System.out.println("Peso: "+peso.get(i));
		}
		teclado.close();
	}

}
