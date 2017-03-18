package iftm.poo.simulado1;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float a,b,c;
		System.out.println("Digite os 3 Parametros do Triângulo: ");
		a = teclado.nextFloat();
		b = teclado.nextFloat();
		c = teclado.nextFloat();
		
		if(a == b && b == c){
			System.out.println("Triângulo Equilátero!!");
		}else if(a != b && b != c && a != c){
			System.out.println("Triângulo Escaleno!!");
		}else{
			System.out.println("Triângulo Isósceles!!");
		}
		teclado.close();
	}
}
