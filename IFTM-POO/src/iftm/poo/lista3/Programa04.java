package iftm.poo.lista3;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o lado do Quadrado: ");
		double lado1 = teclado.nextDouble();
		System.out.println("Digite o lado do Quadrado: ");
		double lado2 = teclado.nextDouble();
		
		Quadrado q1 = new Quadrado(lado1);
		q1.calcularArea();
		q1.calcularPerimetro();
		q1.imprimirDados();
		System.out.println();
		Quadrado q2 = new Quadrado(lado2);
		q2.calcularArea();
		q2.calcularPerimetro();
		q2.imprimirDados();
		
		teclado.close();
	}
}