package iftm.poo.aula07;

import iftm.poo.aula06.Funcionario;

public class Telefonista extends Funcionario {
	int ramal;

	public Telefonista(){}
	
	public Telefonista(int estacaoDeTrabalho){
		this.ramal = estacaoDeTrabalho;
	}
		
	public int getEstacaoDeTrabalho() {
		return ramal;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.ramal = estacaoDeTrabalho;
	}
}
