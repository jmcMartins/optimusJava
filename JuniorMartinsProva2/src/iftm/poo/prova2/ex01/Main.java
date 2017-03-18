package iftm.poo.prova2.ex01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try{
			System.out.println();
			System.out.println("--- Cadastro Cliente ---");
			System.out.print("Nome: ");
			String nomeCliente = teclado.nextLine();
			System.out.print("Idade: ");
			int idadeCliente = Integer.parseInt(teclado.nextLine());
			System.out.print("Sexo: ");
			String sexoCliente = teclado.nextLine();
			System.out.print("Valor Divida: ");
			double dividaCliente = Double.parseDouble(teclado.nextLine());
			System.out.println("Ano nascimento: ");
			int anoNasc = Integer.parseInt(teclado.nextLine());
			
			Cliente cliente = new Cliente(nomeCliente,idadeCliente, sexoCliente,dividaCliente,anoNasc);
			System.out.println(cliente);
		}catch(NumberFormatException e){
			System.out.println("Dados invalidos. Até logo.");
		}
		
		try{
			System.out.println();
			System.out.println("--- Cadastro Gerente ---");
			System.out.print("Nome: ");
			String nomeGerente = teclado.nextLine();
			System.out.print("Idade: ");
			int idadeGerente = Integer.parseInt(teclado.nextLine());
			System.out.print("Sexo: ");
			String sexoGerente = teclado.nextLine();
			System.out.print("Salario: ");
			double salarioGerente = Double.parseDouble(teclado.nextLine());
			System.out.print("Matricula: ");
			String matriculaGerente = teclado.nextLine();
			System.out.print("Nome Gerencia: ");
			String nomeGerencia = teclado.nextLine();
			
			Gerente gerente = new Gerente(nomeGerente,idadeGerente,sexoGerente,salarioGerente,matriculaGerente,nomeGerencia);
			System.out.println(gerente);
		}catch(NumberFormatException e){
			System.out.println("Dados invalidos. Até logo.");
		}
		
		try{
			System.out.println();
			System.out.println("--- Cadastro Vendedor ---");
			System.out.print("Nome: ");
			String nomeVendedor = teclado.nextLine();
			System.out.print("Idade: ");
			int idadeVendedor = Integer.parseInt(teclado.nextLine());
			System.out.print("Sexo: ");
			String sexoVendedor = teclado.nextLine();
			System.out.print("Salario: ");
			double salarioVendedor = Double.parseDouble(teclado.nextLine());
			System.out.print("Matricula: ");
			String matriculaVendedor = teclado.nextLine();
			System.out.println("Valor das Vendas: ");
			double valorVendas = Double.parseDouble(teclado.nextLine());
			System.out.print("Quantidade de Vendas: ");
			int qntVendas = Integer.parseInt(teclado.nextLine());
			
			Vendedor vendedor = new Vendedor(nomeVendedor,idadeVendedor,sexoVendedor,salarioVendedor,matriculaVendedor,valorVendas,qntVendas);
			System.out.println(vendedor);
		}catch(NumberFormatException e){
			System.out.println("Dados invalidos. Até logo.");
		}
		teclado.close();
	}

}
