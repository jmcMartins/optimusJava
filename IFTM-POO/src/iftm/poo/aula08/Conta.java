package iftm.poo.aula08;

public abstract class Conta {
	private int numero;
	private double saldo;
	private static int  contador;
	
	public Conta(){
		Conta.contador++;
		this.numero = Conta.contador;
	}
	
	public Conta(int numero, double saldo){
		Conta.contador++;
		this.saldo = saldo;
		this.numero = numero;
	}

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void imprimeExtratoDetalhado();
	
	public abstract String mensagem(int i,String s);
	
}
