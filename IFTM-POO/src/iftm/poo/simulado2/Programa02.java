package iftm.poo.simulado2;

public class Programa02 {

	public static void main(String[] args) {
		Fornecedor f = new Fornecedor("Bisnaguinha","Rua 666","(99) 9999-9999",30000,18000);
		Empregado e = new Empregado("DeadPoll","Rua Losange","(32) 3232-3232",1,5000);
		
		System.out.println(f);
		f.obterSaldo();
		
		System.out.println("-------------------------------");
		
		System.out.println(e);
		e.calcularSalario();
	
	}

}
