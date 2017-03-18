package iftm.poo.lista1;

import java.util.Scanner;

public class Programa7 {
	
	public static int exibeResultado(float salario) {
		if(salario < 0){
			salario = 0;
		}
		if(salario <= 1000 && salario > 0){
			salario = 1;
		}
		if(salario > 1000 && salario <= 4000){
			salario = 2;
		}
		if(salario > 4000 && salario <= 6000){
			salario = 3;
		}
		if(salario > 6000){
			salario = 4;
		}
		return (int) salario;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu saldo medio: ");
		float salario;
		salario = teclado.nextFloat();
		int caso;
		caso = exibeResultado(salario);
	
		switch(caso){
		
		case 1:
			System.out.println("Você não tem direito a nenhum crédito!");
			break;
		case 2:
			float a = salario*0.2f;
			System.out.println("Você tem direito a "+a+" Reais de crédito!");
			break;
		case 3:
			float b = salario*0.3f;
			System.out.println("Você tem direito a "+b+" Reais de crédito!");
			break;
		case 4:
			float c = salario*0.4f;
			System.out.println("Você tem direito a "+c+" Reais de crédito!");
			break;
		default:
			System.out.println("Você está com saldo negativo e ainda quer crédito?!");
			break;
		}
		teclado.close();
	}
}