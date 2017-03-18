package iftm.poo.lista3;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o raio do Circulo: ");
		double raio1 = teclado.nextDouble();
		System.out.println("Digite o raio do Circulo: ");
		double raio2 = teclado.nextDouble();
		
		Circulo c1 = new Circulo(raio1);
		Circulo c2 = new Circulo(raio2);
		
		c1.calculaPerimetro();
		c1.calculaArea();
		c2.calculaPerimetro();
		c2.calculaArea();
		
		c1.imprimirDados();
		c2.imprimirDados();
		teclado.close();
	}
}