package iftm.poo.simulado1;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float p1=0,p2=0,p3=0,m1=0,m2=0;
		System.out.println("Digite sua primeira nota: ");
		p1 = teclado.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		p2 = teclado.nextFloat();
		
		m1 = (p1+p2)/2;
		if(m1 >= 5.0f && p1 >=3.0f && p2 >= 3.0f){
			System.out.println("Parabéns você foi aprovado!\nMedia:"+m1);
		}else{
			System.out.println("Digite a nota da sua 3 prova: ");
			p3 = teclado.nextFloat();
				if(p1 >= p2){
					m2 = (p1+p3)/2;
				}else{
					m2 = (p2+p3)/2;
				}
				if(m2 >= 5f){
					System.out.println("Parabéns você foi aprovado!\nMedia:"+m2);
				}else{
					System.out.println("Você foi reprovado!");
				}
		}
		
		teclado.close();
	}
}