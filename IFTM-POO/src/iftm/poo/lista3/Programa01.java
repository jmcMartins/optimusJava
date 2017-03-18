package iftm.poo.lista3;

public class Programa01 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Júnior Martins");
		p1.setEndereco("Rua 5 n 450");
		p1.setTelefone("996562348");
		System.out.println();
		p2.setNome("Dead Poll");
		p2.setEndereco("Rua 66 n 666");
		p2.setTelefone("66666666");
		
		p1.imprimirDados();
		p2.imprimirDados();

	}

}
