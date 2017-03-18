package iftm.poo.lista3;

import java.util.Scanner;

public class Programa05 {

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
		
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		
		r1.setComprimento(comp1);
		r1.setLargura(larg1);
		r2.setComprimento(comp2);
		r2.setLargura(larg2);
		
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
