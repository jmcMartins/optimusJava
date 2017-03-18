package iftm.poo.prova1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade=0,identificador=0;
		String nome;
		String email;
		float altura = 0f, peso = 0f;
		String sexo;
		
		System.out.println("Digite seu identificador: ");
		identificador = Integer.parseInt( teclado.nextLine() );
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite sua idade: ");
		idade = Integer.parseInt( teclado.nextLine() );
		System.out.println("Digite seu e-mail: ");
		email = teclado.nextLine();
		System.out.println("Digite seu peso: ");
		peso = teclado.nextFloat();
		System.out.println("Digite sua altura: ");
		altura = teclado.nextFloat();
		System.out.println("Digite seu sexo h/m: ");
		sexo = teclado.nextLine();
		
		float imc = 0f;
		imc = peso / (altura*altura);
		
		if(sexo == "m" || sexo == "M"){
			System.out.print("Sra. "+nome+" você está ");
			if(imc < 19.1){
				System.out.println("abaixo do peso.");
			}else if(imc >= 19.1 && imc < 25.8){
				System.out.println("no peso normal.");
			}else if(imc >= 25.8 && imc < 27.3){
				System.out.println("aarginalmente acima do peso.");
			}else if(imc >= 27.3 && imc < 32.3){
				System.out.println("acima do peso ideal.");
			}else if(imc >=32.3){
				System.out.println("obeso.");
			}
			
		}else{
			System.out.print("Sr. "+nome+" você está ");
			if(imc < 20.7){
				System.out.println("abaixo do peso.");
			}else if(imc >= 20.7 && imc < 26.4){
				System.out.println("no peso normal.");
			}else if(imc >= 26.4 && imc < 27.8){
				System.out.println("marginalmente acima do peso.");
			}else if(imc >= 27.8 && imc < 31.1){
				System.out.println("acima do peso ideal.");
			}else if(imc >=31.1){
				System.out.println("obeso.");
			}
			
		}
		teclado.close();
	}

}
