package iftm.poo.lista2;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Elevador E = new Elevador();
		boolean verdade = true;
		
		
		System.out.println("Digite a capacidade do Elevador:");
		int capacidade = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o total de andades do prédio");
		int totalAndares = Integer.parseInt(teclado.nextLine());
		E.inicializaElevaor(capacidade, totalAndares);
		
		System.out.println("---Bem vindo ao elevador do Center Plaza---");
		boolean sair = true;
		while(sair){
			verdade = true;
			System.out.println("Digite quantas pessoas entrarão no elevador: ");
			int entrou;
			entrou = Integer.parseInt(teclado.nextLine());
			E.entraElevador(entrou);

			System.out.println("Você quer 1/2?\n1: Subir andar.\n2: Descer andar.");
			while(verdade){
				int op = Integer.parseInt(teclado.nextLine());
				if(op == 1){
					System.out.println("Digite quantos andar quer subir: ");
					int subir = Integer.parseInt(teclado.nextLine());
					E.subeAndar(subir);
					verdade = false;
				}else if(op == 2){
					System.out.println("Digite quantos andar quer descer: ");
					int descer = Integer.parseInt(teclado.nextLine());
					E.deceAndar(descer);
					verdade = false;
				}else{
					System.out.println("Opção Errada!!");
					verdade = true;
				}
			}
			
			System.out.println("Digite quantas pessoas sairam do Elevador: ");
			int saiu = Integer.parseInt(teclado.nextLine());
			E.saiElevador(saiu); 
			
			E.imprimeDados();
			
			String sai = new String();
			System.out.println("Desejá sair do Elevador nesse andar?? s/n");
			sai = teclado.nextLine();
			if(sai.equals("s") || sai.equals("S")){
				sair = false;
			}else{
				sair = true;
			}
		}
		teclado.close();
	}
}
