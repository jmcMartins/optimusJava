package iftm.poo.lista1;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		
		float b,B,area,h;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa 1");
		
		System.out.println("Digite a Altura: ");
		h = teclado.nextFloat();
		System.out.println("Digite a Base Menor: ");
		b = teclado.nextFloat();
		System.out.println("Digite a Base Maior: ");
		B = teclado.nextFloat();
		
		area = (h * (b + B)) / 2;
		System.out.println("A área eh: " + area);
		teclado.close();
	}

}
