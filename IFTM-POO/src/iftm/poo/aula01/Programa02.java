package iftm.poo.aula01;

public class Programa02 {

	public static void main(String[] args) {
		/*DECLARAÇÃO DE VARIAVEIS
		 * 
		 * variaveis do tipo FLOAT que forem inicializadas manualmente precisam ter um 'f' no final
		 * ex: float = 182.2f */
		
		int numeroDaConta;
		int idade = 34;
		double saldo;
		double limite = 344.5;
		boolean ativo = false;
		String cliente = "Diemesleno Souza Carvalho";
		int n1, n2, n3 = 4;
		
		numeroDaConta = 1;
		
		saldo = 4000.00;
		n1 = 3;
		n2 = 8;
		
		System.out.println("Cliente: " + cliente);
		System.out.println("Número da conta: " + numeroDaConta);
		System.out.println("Idade: " + idade);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println("Cliente ativo? " + ativo);
		System.out.println("N1 = " + n1 + "\nN2 = " + n2 + "\nN3 = " + n3);
		
		final double JUROS = 10.0; //Constante, só acrescentar 'final' antes da declaração e colocar o nome dela todo maiusculo;
		
		char a = 'a';
		char b = 54;
		String nome = "Margarido";
		String sobreNome = "Neto";
		
		System.out.println("Nome: " + nome + sobreNome);
		
		long besta = 666;
		int dilma = (int)besta;
		
		System.out.println(+dilma);
		
		/*Conversão entre variáveis não primitivas e primitivas */
		
		int val = 10;
		Integer x = Integer.valueOf(val);
		int y = x.intValue();
		
		String teste = "19";
		int boa = Integer.parseInt(teste);
		System.out.println(boa+1);
		
	}

}
