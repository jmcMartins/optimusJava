package iftm.poo.aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua idade : ");
		try{
			int idade = teclado.nextInt();
			System.out.println("Sua idade: "+idade);
		}catch(InputMismatchException e){
			System.out.println("Informe somente numeros.");
		}
		teclado.close();
	}

}
