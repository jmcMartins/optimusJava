package iftm.poo.aula02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Qual é o seu nome?");
		String nome = teclado.nextLine();
		
		System.out.println("Qual é a sua data de nascimento?");
		String strNascimento = teclado.nextLine();
		LocalDate nascimento = LocalDate.parse(strNascimento, formatador);
		
		System.out.println("Informe seu RG");
		String rg = teclado.nextLine();
		
		System.out.println("Informe seu CPF: ");
		int cpf = Integer.parseInt(teclado.nextLine());
		
		Pessoa p = new Pessoa();
		p.setNome(nome);
		p.setNascimento(nascimento);
		p.setRg(rg);
		p.setCpf(cpf);
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("Nascimento: " + p.getNascimento().format(formatador));
		System.out.println("RG: " + p.getRg());
		System.out.println("CPF: " + p.getCpf());
		
		System.out.println("Qual é a mensagem? ");
		String msg = teclado.nextLine();
		p.cumprimenta(msg);
		System.out.println("O/A " + p.getNome() + "tem " + p.retornaIdade() + "anos.");
		
		teclado.close();
	}

}
