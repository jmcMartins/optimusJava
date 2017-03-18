package iftm.poo.prova2.ex02;

public class ContaEspecial extends ContaBancaria{

	private float limite;

	public ContaEspecial(){
		
	}
	public ContaEspecial(String cliente, int num_conta, float saldo, float limite){
		super(cliente,num_conta,saldo);
		this.limite = limite;
	}
	
	
	@Override
	public void sacar(float sacar) {
		if( (this.getSaldo() + this.getLimite()) >= sacar){
			this.setSaldo(this.getSaldo() - sacar);
		}else{
			System.out.println("Você não possui saldo suficiente para o saque. ");
		}
	}
	@Override
	public String toString() {
		return "Cliente: "+this.getCliente()+"\nNum Conta: "+this.getNum_conta()+"\nSaldo: "+this.getSaldo()+"\nLimite: "+this.getLimite();
	}
	
	public void depositar(float valor) {
		if ( valor >= 0){
			this.setSaldo(this.getSaldo() + valor);
			}else{
				System.out.println("Impossivel depositar valor negativo. ");
			}
	}
	
	public float getLimite() {
		return limite;
	}
	
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
}
