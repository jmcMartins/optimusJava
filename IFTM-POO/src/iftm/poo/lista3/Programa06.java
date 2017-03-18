package iftm.poo.lista3;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Digite o Comprimento: ");
		double comp1 = teclado.nextDouble();
		System.out.println("Digite a largura: ");
		double larg1 = teclado.nextDouble();
		
		System.out.println("Digite o Comprimento: ");
		double comp2 = teclado.nextDouble();
		System.out.println("Digite a largura: ");
		double larg2 = teclado.nextDouble();
		
		Retangulo r1 = new Retangulo(comp1,larg1);
		Retangulo r2 = new Retangulo(comp2,larg2);
		
		r1.calcularArea();
		r1.calcularPerimetro();
		r2.calcularArea();
		r2.calcularPerimetro();
		
		r1.imprimirDados();
		System.out.println();
		r2.imprimirDados();
		
		teclado.close();
	}	

}