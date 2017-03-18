package iftm.poo.lista1;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	float salario = 0;

	System.out.println("Digite quantas horas você trabalho no mês: ");
	salario = teclado.nextFloat();
	
	salario = salario*10.25f;
	System.out.println("Você vai receber: "+salario+" Reais.");
	
	teclado.close();
	}

}
