package iftm.poo.aula01;

import java.util.Scanner;

public class Programa30 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		/*Int para não dar o erro tem quer ser
		
		System.out.println("Informe sua idade: ");
		int idade = Integer.parseInt(teclado.nextLine());  */

		
		System.out.println("Informe seu nome: ");
		String nome = teclado.nextLine();            // next pega só o primeiro nome
		                                             // nextLine Pega toda a string
		System.out.println("Informe sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("-- Dados --");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		teclado.close();

	}

}
