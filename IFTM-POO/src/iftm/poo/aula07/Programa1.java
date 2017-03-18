package iftm.poo.aula07;

public class Programa1 {

	public static void main(String[] args) {
		
		Poupanca p1 = new Poupanca();
		Corrente c1 = new Corrente();
		Poupanca p2 = new Poupanca();
		Corrente c2 = new Corrente();
		
		p1.setDiaDoAniversario(01);
		p2.setDiaDoAniversario(28);
	
		c1.setLimite(8000);
		c2.setLimite(80000);
		
		p1.setSaldo(5000);
		p2.setSaldo(3000);
		c1.setSaldo(10000);
		c2.setSaldo(500);
		
		System.out.println("---Poupanca---");
		System.out.println("Data do Aniversario: "+p1.getDiaDoAniversario() );
		GeradorDeExtrato.imprimirExtrato(p1);
		System.out.println();
		System.out.println("Data do Aniversario: "+p2.getDiaDoAniversario() );
		GeradorDeExtrato.imprimirExtrato(p2);
		System.out.println();
		System.out.println("---Conta Corrente---");
		GeradorDeExtrato.imprimirExtrato(c1);
		System.out.println();
		GeradorDeExtrato.imprimirExtrato(c2);
		
	}

}
