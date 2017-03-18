package iftm.poo.aula09;

public class ContaPoupanca implements Conta{
	
	private double saldo;
	
	public ContaPoupanca(){}
	
	public ContaPoupanca(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		if(this.saldo > valor){
			this.saldo -= valor;
		}
	}

}
