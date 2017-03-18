package iftm.poo.lista3;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		String nome1 =teclado.nextLine();
		System.out.println("Digite seu endereço: ");
		String end1 = teclado.nextLine();
		System.out.println("Digite seu telefone: ");
		String num1 = teclado.nextLine();
		
		System.out.println("Digite seu nome: ");
		String nome2 =teclado.nextLine();
		System.out.println("Digite seu endereço: ");
		String end2 = teclado.nextLine();
		System.out.println("Digite seu telefone: ");
		String num2 = teclado.nextLine();
		
		Pessoa p1 = new Pessoa(nome1,end1,num1);
		Pessoa p2 = new Pessoa(nome2,end2,num2);
		
		p1.imprimirDados();
		p2.imprimirDados();
	
		
		teclado.close();
	}

}
