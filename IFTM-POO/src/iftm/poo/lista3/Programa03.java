package iftm.poo.lista3;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		
		System.out.println("Digite o lado do Quadrado: ");
		double lado1 = teclado.nextDouble();
		System.out.println("Digite o lado do Quadrado: ");
		double lado2 = teclado.nextDouble();

		q1.setLado(lado1);
		q2.setLado(lado2);

		q1.calcularArea();
		q1.calcularPerimetro();
		q1.imprimirDados();
		System.out.println();
		q2.calcularArea();
		q2.calcularPerimetro();
		q2.imprimirDados();
		
		teclado.close();
	}
}