package iftm.poo.lista1;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float total=0, custo=0, impos1=0,impos2=0;
		
		System.out.println("Digite o valor de fabrica do carro: ");
		custo = teclado.nextFloat();
		
		impos1 = custo*0.28f;
		impos2 = custo*0.45f;
		total = impos1+impos2+custo;
		System.out.println("O preço final do carro e de: "+total);
		teclado.close();
	}

}
