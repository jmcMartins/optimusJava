package iftm.poo.prova1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Float> nota = new ArrayList<Float>();
		
		int condicao = 1,i=0;
		while(condicao != 0){
			System.out.print("Digite a nota do "+(i+1)+"º aluno: ");
			nota.add(teclado.nextFloat());
			System.out.println();
			if(nota.get(0) < 0){
				System.out.println("Você começou errado não acha?! Flw!");
				System.exit(0);
			}
			if(nota.get(i) <= -1){
				condicao = 0;
			}
			i++;
		}
		
		int totalAlunos=0;
		totalAlunos = nota.size()-1;
		float media = 0;
		for (int j = 0; j < nota.size()-1; j++) {
			media = media+nota.get(j);
		}
		media = media/totalAlunos;
		System.out.println("A media aritimetica dos alunos é: "+media);
		
		int maiorq5=0;
		
		for (int j = 0; j < nota.size()-1; j++) {
			if( nota.get(j) > 5.0){
				maiorq5++;
			}
		}
		System.out.println("Tem "+maiorq5+" alunos com nota maior q 5.0 na sala!");
		System.out.println("A media da sala é: "+media);
		float maiorNota = 0;
		for (int j = 0; j < nota.size()-1; j++) {
			if(nota.get(j) > maiorNota){
				maiorNota=nota.get(j);
			}
		}
		System.out.println("A maior nota da sala é: "+maiorNota);
		
		float menorNota;
		menorNota = nota.get(0);
		for (int j = 0; j < nota.size()-1; j++) {
			if(nota.get(j) < menorNota){
				menorNota=nota.get(j);
			}
		}
		System.out.println("A menor nota da sala é: "+menorNota);
		
		if(maiorq5 == 0){
			System.out.println("Não há nenhum aluno com nota acima de 5.");
		}
		
		
		teclado.close();
	}

}
