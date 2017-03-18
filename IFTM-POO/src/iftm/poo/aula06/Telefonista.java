package iftm.poo.aula06;

public class Telefonista extends Funcionario {
	int estacaoDeTrabalho;

	public Telefonista(){}
	
	public Telefonista(String nome, double salario, int estacaoDeTrabalho){
		super(nome,salario);
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
		
	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
}
