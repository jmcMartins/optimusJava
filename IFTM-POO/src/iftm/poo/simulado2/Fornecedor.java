package iftm.poo.simulado2;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(){
		
	}
	public Fornecedor(String nome, String end, String fone,double valorCredito,double valorDivida){
		super(nome,end,fone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo(){
		
		double saldo = this.getValorCredito() - this.getValorDivida();
		System.out.println("Seu saldo e de: "+saldo+" Reais.");
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	@Override
	public String toString() {
		return "Nome: "+this.getNome()+"\nEnd: "+this.getEndereco()+"\nFone: "+this.getTelefone()+"\n";
	}
	

}
