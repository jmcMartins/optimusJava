package iftm.poo.aula07;

public class Poupanca extends Conta{
	int diaDoAniversario;

	public Poupanca(){}
	
	public Poupanca(int diaDoAniversario){
		this.diaDoAniversario = diaDoAniversario;
	}
	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}
}
