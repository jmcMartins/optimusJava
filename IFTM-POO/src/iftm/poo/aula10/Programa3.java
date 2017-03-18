package iftm.poo.aula10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa3 {
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public static void main(String[] args) {

		recebeDados();
		imprimeDados();
		
		teclado.close();
	}
	
	public static void recebeDados(){
		System.out.println("Digite 5 numeros: ");
		for (int i = 0; i < 5; i++) {
			verificaDados();
		}
	}
	
	
	public static void verificaDados(){
		boolean verdade = true;
		while(verdade){
			try{
				numeros.add(teclado.nextInt());
				verdade = false;
		}catch(InputMismatchException e){
				System.out.println("Dado invalido. Tente novamente: ");
				System.out.println("Digite um número valido.");
			}
		}
	}
	
	public static void imprimeDados(){
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println("Num: "+numeros.get(i));
		}
	}

}
