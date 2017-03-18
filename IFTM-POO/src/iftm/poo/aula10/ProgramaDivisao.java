package iftm.poo.aula10;

import java.util.Scanner;

public class ProgramaDivisao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Divisao d = new Divisao();
		
		System.out.println("Digite um numero: ");
		int a = teclado.nextInt();
		System.out.println("Digite outro numero: ");
		int b = teclado.nextInt();
		System.out.println("Fazendo divisao...");
		
		d.calculaMedia(a, b);
		
		teclado.close();
	}

}
