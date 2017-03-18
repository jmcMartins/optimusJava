package iftm.poo.aula03;

import java.util.ArrayList;

public class Agencia {
	private String nome;
	private int numero;
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public ArrayList<Conta> getContas() {
		return contas;
	}
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	
	public void addConta(Conta conta){
		this.contas.add(conta);
	}
	
}
