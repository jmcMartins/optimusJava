package iftm.poo.aula06;

public class Secretaria extends Funcionario {
	int ramal;

	public Secretaria(){}
	
	public Secretaria(String nome, double salario, int ramal){
		super(nome,salario);
		this.ramal = ramal;
	}
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
}
