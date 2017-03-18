package iftm.poo.lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);	
	ArrayList nomes = new ArrayList();

	for(int i = 0; i < 5; i++){
		System.out.println("Digite o "+ (i+1) +"º Nome");
		nomes.add(teclado.nextLine());
	}
	for(int j = 5; j > 0; j--){
		System.out.println(nomes.get(j-1));
	}
	}
}
