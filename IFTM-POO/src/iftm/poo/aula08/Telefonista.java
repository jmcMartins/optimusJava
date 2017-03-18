package iftm.poo.aula08;

public class Telefonista extends Funcionario{
	int ramal;

	public Telefonista(){}
	
	public Telefonista(int ramal){
		this.ramal = ramal;
	}
		
	
	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public void imprimeDados() {
		System.out.println("---Dados Telefonista---");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Ramal: "+this.getRamal());
	}
}
