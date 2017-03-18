package iftm.poo.aula03;



public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void depositar(double valor){
		if(valor > 0){
			double novoSaldo = this.getSaldo() + valor;
			this.setSaldo(novoSaldo);
			System.out.println("Depósito efetuado com sucesso.");
		}else
			System.out.println("Informe um valor válido.");			 
	}
	
	public void sacar(double valor){
		if(valor > 0){
			if(this.getSaldo() >= valor){
				double novoSaldo = this.getSaldo() - valor;
				this.setSaldo(novoSaldo);
				System.out.println("Saque efetuado com sucesso.");
			}else
				System.out.println("Saldo insuficiente.");
		}else
			System.out.println("Informe um valor válido.");			 
	}
	
	public void alterarLimite(double valor){
		this.setLimite(valor);
		System.out.println("Limite alterado com sucesso.");
	}
	
	public void gerarExtrato(int numero){
		if( this.getNumero() == numero){
			System.out.println("Saldo = "+this.getSaldo());
			System.out.println("Limite = "+this.getLimite());
		}else{
			System.out.println("Dados não encontrados!");
		}
	}
	
	public boolean gerarExtrato(int numero, String Cliente){
		if( this.getNumero() == numero){
			System.out.println("Nome = "+Cliente);
			System.out.println("Saldo = "+this.getSaldo());
			System.out.println("Limite = "+this.getLimite());
			return true;
		}else{
			System.out.println("Dados não encontrados!");
			return false;
		}
	}
	
	public void efetuarTransferencia(Conta conta, float valor){
		if(this.getSaldo() >= valor){
			conta.setSaldo(conta.getSaldo() + valor);
			System.out.println("Transferencia Realizado com sucesso.");
			this.setSaldo(this.getSaldo() - valor);
		}else{
			System.out.println("Você não possui saldo suficiente.");
		}
	}
	
}
