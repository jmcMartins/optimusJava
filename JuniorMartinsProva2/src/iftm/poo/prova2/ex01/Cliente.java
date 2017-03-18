package iftm.poo.prova2.ex01;

public class Cliente extends Pessoa {
	
	private double valorDivida;
	private int anoNascim;

	public Cliente(){
		
	}
	public Cliente(String nome, int idade, String sexo, double valorD, int anoNascimento){
		super(nome,idade,sexo);
		this.valorDivida = valorD;
		this.anoNascim = anoNascimento;
	}
	
	@Override
	public String toString() {

		return "Nome: "+this.getNome()+"\nIdade: "+this.getIdade()+"\nSexo: "+this.getSexo()+"\nValor da Divida: "+this.getValorDivida()+"\nAno nascm.:"+this.getAnoNascim();
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getAnoNascim() {
		return anoNascim;
	}

	public void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}
}
