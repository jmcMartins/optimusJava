package iftm.poo.prova2.ex02;

public abstract class ContaBancaria {

	private String cliente;
	private int num_conta;
	private float saldo;
	
	public ContaBancaria(){
		
	}
	public ContaBancaria(String cliente, int num_conta, float saldo){
		this.cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}
	
	public abstract String toString();
	
	public abstract void sacar(float sacar);
	
	public abstract void depositar(float valor);
		
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNum_conta() {
		return num_conta;
	}
	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
