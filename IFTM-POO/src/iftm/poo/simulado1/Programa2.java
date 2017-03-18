package iftm.poo.simulado1;

import java.util.Scanner;

public class Programa2 {
	public static int randInt(int min, int max){
		java.util.Random rand = new java.util.Random();
		int randomNum = rand.nextInt( (max - min) + 1) + min;
		return randomNum;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int escolha = 0, pc;
		int a=1;
		while(a != 0){
		System.out.println("Escolha:\n0 - Pedra\n1 - Papel\n2 - Tesoura");
		escolha = teclado.nextInt();
		if(escolha >=0 && escolha <= 2){
			a = 0;
			}else
				System.out.println("Escolha invalida. Tente novamente!");
		}
		pc = randInt(0, 2);
		switch(escolha){
		case 0:
			System.out.println("Você escolheu Pedra.");
			break;	
		case 1: 
			System.out.println("Você escolheu Pael.");
			break;	
		case 2:
			System.out.println("Você escolheu Tesoura.");
			break;	
		}
		switch(pc){
		case 0:
			System.out.println("PC escolheu Pedra.");
			break;	
		case 1: 
			System.out.println("PC escolheu Pael.");
			break;	
		case 2:
			System.out.println("PC escolheu Tesoura.");
			break;	
		}
		System.out.println();
		if(escolha == 0 && pc == 0 || escolha == 0 && pc == 0){
			System.out.println("Empate!!");
		}else
		if(escolha == 1 && pc == 1 || escolha == 1 && pc == 1){
			System.out.println("Empate!!");
		}else
		if(escolha == 2 && pc == 2 || escolha == 2 && pc == 2){
			System.out.println("Empate!!");
		}
		
		if(escolha == 0 && pc == 2 || escolha == 2 && pc == 0){
			System.out.println("Pedra Ganhou!!");
		}
		if(escolha == 1 && pc == 0 || escolha == 0 && pc == 1){
			System.out.println("Papel Ganhou!!");
		}
		if(escolha == 2 && pc == 1 || escolha == 1 && pc == 2){
			System.out.println("Tesoura Ganhou!!");
		}
		teclado.close();
	}
}
