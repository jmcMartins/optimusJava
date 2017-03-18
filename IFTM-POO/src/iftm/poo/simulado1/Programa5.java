package iftm.poo.simulado1;

import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int z=1;
		while(z != 0){
			double peso=0,peso1=0;
			int escolha=0;
			System.out.print("Digite seu peso na Terra: ");
			System.out.println();
			peso = teclado.nextDouble();
			int a=1;
			while(a != 0){
				System.out.println("Agora digite em que planeta quer saber seu peso.\n1 - Mercúrio\n2 - Vênus\n3 - Marte\n4 - Júpter"
						+ "\n5 - Saturno\n6 - Urano\n7 - Netuno");
				escolha = teclado.nextInt();
				if(escolha >= 1 && escolha <=7){
					a = 0;
				}else{
					System.out.println("Opção invalidade. Tente novamente");
					System.out.println();
				}
			}
			switch(escolha){
			case 1:
				peso1 = peso*0.38;
				break;
			case 2:
				peso1 = peso*0.91;
				break;
			case 3:
				peso1 = peso*0.38;
				break;
			case 4:
				peso1 = peso*2.34;
				break;
			case 5:
				peso1 = peso*1.06;
				break;
			case 6:
				peso1 = peso*0.92;
				break;
			case 7:
				peso1 = peso*1.19;
				break;
			}
			System.out.println("Seu peso no Planeta escolhido é: "+peso1+"Kg.");
			int esc;
			System.out.println("\nDesejá calcular em outro planeta?\n1 para Sim, ou qualquer número para sair.");
			esc = teclado.nextInt();
			if(esc != 1){
				z = 0;
			}
		}
		teclado.close();
	}
}
