package iftm.poo.aula03;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome = new String();
		String cpf = new String();

		System.out.println("Digite seu ID: ");
		int id = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite seu CPF");
		cpf = teclado.nextLine();
		
		Cliente cliente1 = new Cliente(id,nome,cpf);
		
		System.out.println("----Dados do Cliente----");
		System.out.println("Número: "+cliente1.getId());
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("CPF: "+cliente1.getCpf());
		teclado.close();
	}

}
