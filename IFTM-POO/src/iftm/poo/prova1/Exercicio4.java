package iftm.poo.prova1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numero = new ArrayList<Integer>();
		int condicao = 1,z=0;
	
		while(condicao != 0){
			System.out.print("Digite o "+(z+1)+"º número: ");
			numero.add(teclado.nextInt());
			if(numero.get(0) <= 0){
				System.out.println("Você começou errado não acha?! Flw!");
				System.exit(0);
			}
			if(numero.get(z) <= 0){
				condicao = 0;
			}
			z++;
		}
		System.out.println();		
		int par=0,impar=0;
		for (int i = 0; i < numero.size()-1; i++) {
			if(numero.get(i) % 2 == 0){
				par++;
			}else{
				impar++;
			}
		}
		System.out.println("Contém "+par+"º número(s) par. É "+impar+"º número(s) impar.");
		int soma=0;
		for (int i = 0; i < numero.size()-1; i++) {
			soma = soma + numero.get(i);
		}
		System.out.println("A soma dos número é: "+soma);
		
		float media=0;
		media = soma / (numero.size()-1);
		System.out.println("A media dos número é: "+media);
		
		int menorNumero=0,maiorNumero=0;
		for (int j = 0; j < numero.size()-1; j++) {
			if(numero.get(j) > maiorNumero){
				maiorNumero=numero.get(j);
			}
		}
		menorNumero = numero.get(0);
		for (int j = 0; j < numero.size()-1; j++) {
			if(numero.get(j) < menorNumero){
				menorNumero=numero.get(j);
			}
		}
		System.out.println("O maior número é: "+maiorNumero+"\nE o menor número é: "+menorNumero);
		
		teclado.close();
	}

}
