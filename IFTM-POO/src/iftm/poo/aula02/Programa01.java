package iftm.poo.aula02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Programa01 {

	public static void main(String[] args) {
		//Instanciando um objeto do tipo Pessoa
		Pessoa pessoa1 = new Pessoa();
		
		//Colocando dados nos atributos do objeto 'pessoa1' instanciado
		pessoa1.setNome("Margarido Neto");
		pessoa1.setNascimento(LocalDate.of(1989, 03, 29));//ano, mês, dia
		pessoa1.setRg("01043528 SSP/MS");
		pessoa1.setCpf(1234567890);//tipo int n�o aceita ate 10 dígitos
		
		System.out.println("Nome: " + pessoa1.getNome());
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Nascimento: " + pessoa1.getNascimento().format(formatador));
		System.out.println("RG: " + pessoa1.getRg());
		System.out.println("CPF: " + pessoa1.getCpf());
		
		pessoa1.cumprimenta("Bom dia!");
		int idade = pessoa1.retornaIdade();
		System.out.println("O " + pessoa1.getNome() + " tem " + idade + " anos");
		
		System.out.println();
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("De@d Pool");
		pessoa2.setNascimento(LocalDate.of(1979, 03, 29));//ano, mês, dia
		pessoa2.setRg("182182182 SSP/MS");
		pessoa2.setCpf(182182182);//tipo int só aceita ate 10 dígitos
		
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Nascimento: " + pessoa2.getNascimento().format(formatador));
		System.out.println("RG: " + pessoa2.getRg());
		System.out.println("CPF: " + pessoa2.getCpf());
		
		pessoa2.cumprimenta("Boa Tarde!");
		int idade2 = pessoa2.retornaIdade();
		System.out.println("O " + pessoa2.getNome() + " tem " + idade2 + " anos");
	}
	
	

}
