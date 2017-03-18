package iftm.poo.prova2.ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try{
			System.out.println("--- Dados do Copo ---");
			System.out.println("Capacidade Maxima: ");
			int capacidadeM = Integer.parseInt(teclado.nextLine());
			System.out.println("Capacidade Atual: ");
			int capacidadeA = Integer.parseInt(teclado.nextLine());
			System.out.println("Cor: ");
			String cor = teclado.nextLine().toLowerCase();
			System.out.println("Material: ");
			String material = teclado.nextLine().toLowerCase();
			Copo c = new Copo(capacidadeM,capacidadeA,cor,material);
			
			boolean cond = true;
			while(cond){
				try{
					System.out.println();
					System.out.println("Capacidade atual do copo = [ "+c.getCapacidadeAtual()+"ml ]");
					System.out.println("Oque deseja fazer: ");
					System.out.println("1 - Encher.\n2 - Esvaziar.\n3 - Pegar Informaçoens.\n4 - Sair");
					int op = Integer.parseInt(teclado.nextLine());
					
					if(op == 1 ){
						c.encher();
					}else if(op == 2){
						c.esvaziar();
					}else if(op == 3){
						c.getInformacoes();
					}else if(op == 4){
						cond = false;
					}else{
						System.out.println("Opção invalida. Tente novamente.");
					}
				}catch(NumberFormatException e){
					System.out.println("Dados invalidos.");
				}
			}

		}catch(NumberFormatException e){
			System.out.println("Dados invalidos.");
		}
		teclado.close();
	}

}
