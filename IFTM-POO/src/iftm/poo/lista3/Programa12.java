package iftm.poo.lista3;

import java.util.Scanner;

public class Programa12 {
	
	//Responde até a 17.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean ligada = false;
		System.out.println("Digite o modelo da moto: ");
		String modelo = teclado.nextLine();
		System.out.println("Digite a marca da moto: ");
		String marca = teclado.nextLine();
		System.out.println("Digite a cor da moto: ");
		String cor = teclado.nextLine();
		System.out.println("Ligar moto? 1 - Sim. 2- Não.");
		int ops = Integer.parseInt(teclado.nextLine());
		if(ops == 1){
			ligada = true;
		}else if(ops == 2){
			ligada = false;
		}else{
			System.out.println("Opção invalida.");
		}
		System.out.println("Digite a marcha que a moto está: ");
		int marcha = Integer.parseInt(teclado.nextLine());
		Moto m = new Moto(marca,modelo,cor,marcha,ligada);
		m.imprimirDados();
		System.out.println();
		
		boolean verd = true;
		while(verd){
			m.imprimirMarcha();
			System.out.println("Deseja?\n1 - Subir marchar\n2 - Descer marcha");
			System.out.println("3 - Desligar a moto.");
			int op = teclado.nextInt();
			if(op == 1){
				m.subirMarcha();
			}else if(op == 2){
				m.descerMarcha();
			}else if(op == 3){
				verd = false;
				m.ligada = false;
			}else{
				System.out.println("Opção incorreta.");
			}
		}
		m.imprimirDados();
		teclado.close();
	}

}