package iftm.poo.aula03;

import java.util.ArrayList;

public class Banco {
	private String nome;
	private ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Agencia> getAgencias() {
		return agencias;
	}
	public void setAgencias(ArrayList<Agencia> agencias) {
		this.agencias = agencias;
	}
	
	public void addAgencia(Agencia agencia){
		this.agencias.add(agencia);
	}
	
}
