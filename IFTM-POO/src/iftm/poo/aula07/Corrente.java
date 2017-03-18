package iftm.poo.aula07;

public class Corrente extends Conta{
	double limite;

	public Corrente(){}
	
	public Corrente(double limite){
		this.limite = limite;
	}
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
