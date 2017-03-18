package iftm.poo.prova2.ex02;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;

	public ContaPoupanca(){
		
	}
	public ContaPoupanca(String cliente, int num_conta, float saldo,int diaRendimento){
		super(cliente,num_conta,saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(float taxa){
		float novoSaldo;
		novoSaldo = this.getSaldo() + ( (this.getSaldo()/100) * taxa );
		this.setSaldo(novoSaldo);
	}
	
	@Override
	public void sacar(float sacar) {
		if(this.getSaldo() >= sacar){
			this.setSaldo(this.getSaldo() - sacar);
		}else{
			System.out.println("Você não possui saldo suficiente para o saque. ");
		}
	}

	@Override
	public void depositar(float valor) {
		if ( valor >= 0){
		this.setSaldo(this.getSaldo() + valor);
		}else{
			System.out.println("Impossivel depositar valor negativo. ");
		}
	}
	@Override
	public String toString() {
		return "Cliente: "+this.getCliente()+"\nNum Conta: "+this.getNum_conta()+"\nSaldo: "+this.getSaldo()+"\nDia Rendimento: "+this.getDiaRendimento();
	}
	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
}
