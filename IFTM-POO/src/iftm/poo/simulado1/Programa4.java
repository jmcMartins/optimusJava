package iftm.poo.simulado1;

import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int min=0,max=0,a=1;
		while(a != 0){
			System.out.println("Digite o limite inferior: ");
			min = teclado.nextInt();
			System.out.println("Digite o limite superior: ");
			max = teclado.nextInt();
			if(min != max){
				a=0;
			}else{
				System.out.println("Os dois limites são iguais. Tente novamente!");
				System.out.println();
			}
		}
		System.out.print("Intervalo: ");
		for (int i = min; i <= max; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		int soma=0;
		for (int i = min; i <= max; i++) {
			soma = i + soma;
		}
		System.out.print("A soma dos números interiros dentro do intervalo é: "+soma+"\n");
		
		int quant=0;
		for (int i = min; i <= max; i++) {
			quant++;
		}
		System.out.print("A quantidade dos termos dentro do intervalo e de: "+quant+"\n");
		
		int impar=0;
		for (int i = min; i <= max; i++) {
			if( ! (i%2 == 0)){
				impar++;
			}
		}
		System.out.print("A quantidades de impares dentro do intervalo é de: "+impar+"\n");
		
		for (int i = min; i <= max; i++) {
			if(i%2 == 0){
				System.out.println("O número "+i+" e par.");
			}else{
				System.out.println("O número "+i+" e impar.");
			}
		}
		
		teclado.close();
	}
}
