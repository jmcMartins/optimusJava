package iftm.poo.prova1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		ArrayList<Float> tempo = new ArrayList<Float>();
		Scanner teclado = new Scanner(System.in);
		int condicao = 1,f=0;
		
		System.out.println("Digite o tempo de todas voltas. Se desejar sair digite um nº negativo ou 0!");
		while(condicao != 0){
			System.out.print("Digite o tempo registrado na "+(f+1)+"º volta: ");
			tempo.add(teclado.nextFloat());
			System.out.println();
			if(tempo.get(0) <= 0){
				System.out.println("Você começou errado não acha?! Flw!");
				System.exit(0);
			}
			if(tempo.get(f) <= 0){
				condicao = 0;
			}
			f++;
		}
		float melhorTempo = tempo.get(0);
		for (int i = 0; i < tempo.size()-1; i++) {
			if(tempo.get(i) <  melhorTempo){
				melhorTempo = tempo.get(i);
			}
		}
		System.out.println("O melhor tempo foi: "+melhorTempo);
		System.out.print("O melhor tempo aconteceu na(s) volta(s): ");
		for (int i = 0; i < tempo.size()-1; i++) {
			if(melhorTempo == tempo.get(i) ){
				System.out.print((i+1)+" ");
			}
		}
		System.out.println();
		
		float media=0;
		for (int i = 0; i < tempo.size()-1; i++) {
			media = media + tempo.get(i);
		}
		media = media / (tempo.size()-1);
		System.out.println("O tempo médio das voltas é: "+media);
		
		teclado.close();
	}

}
