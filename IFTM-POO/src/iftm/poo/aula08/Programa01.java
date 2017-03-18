package iftm.poo.aula08;

public class Programa01 {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca(12);
		ContaCorrente cc = new ContaCorrente(1000);
		cp.setSaldo(5000);
		cc.setSaldo(3000);
		cc.setLimite(1000);
		
		cp.imprimeExtratoDetalhado();
		System.out.println();
		cc.imprimeExtratoDetalhado();
	}
}