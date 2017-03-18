package iftm.poo.lista4;

import java.util.Scanner;

public class ProgramaCachorroPeixe {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Peixe peixe = new Peixe();
		Cachorro cachorro = new Cachorro();
		int op = 0;
		
		try{
			System.out.println("Desejá cadastrar qual animal?\n1 - Cachorro.\n2 - Peixe");
			op = Integer.parseInt(teclado.nextLine());
		}catch(NumberFormatException e){
			System.out.println();
		}
		if(op == 1){
			try{
				System.out.println("\n--- Cadastro Cachorro ---");
				System.out.print("Nome: ");
				cachorro.setNome(teclado.nextLine());
				System.out.print("Peso: ");
				cachorro.setPeso(Double.parseDouble(teclado.nextLine()));
				System.out.print("Raça: ");
				cachorro.setRaca(teclado.nextLine());
				System.out.println();
			}catch(NumberFormatException e){
				System.out.println("Algum dado está desacordo com o pedido. Até Logo!!");
			}
		}else if(op == 2){
			try{
					System.out.println("\n--- Cadastro Peixe ---");
					System.out.print("Nome: ");
					peixe.setNome(teclado.nextLine());
					System.out.print("Peso: ");
					peixe.setPeso(Double.parseDouble(teclado.nextLine()));
					System.out.print("Habitat: ");
					peixe.setTipoHabitat(teclado.nextLine());
					System.out.println();
				}catch(NumberFormatException e){
					System.out.println("Algum dado está desacordo com o pedido. Até Logo!!");
				}
		}else{
			System.out.print("Você digitou algo diferente que eu pedi. Até Logo!!");
		}
		if(op > 0 && op < 3){
			if(op == 1){
				System.out.println("--- Dados Cachorro ---");
				System.out.println(cachorro);
			}else if(op == 2){
				System.out.println("--- Dados Peixe ---");
				System.out.println(peixe);
			}
		}
		teclado.close();
	}

}
