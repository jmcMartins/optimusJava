package iftm.poo.aula05;

public class Conta {
	
	private double saldo;

	public Conta() {
	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		this.descontarTarifa(0.0);
	}
	
	public void sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		this.descontarTarifa(0.5);
	}
	
	public void descontarTarifa(double taxa) {
		this.setSaldo(this.getSaldo() - taxa);
	}
}