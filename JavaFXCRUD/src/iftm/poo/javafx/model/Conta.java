package iftm.poo.javafx.model;

import java.time.LocalDate;

public class Conta {

	private int id;
	private double valor;
	private String concessionaria;
	private String descricao;
	private LocalDate dataVencimento;
	
	public Conta(){
		
	}
	
	public Conta(int id, double valor, String concessionaria, String descricao, LocalDate dataVencimento){
		this.id = id;
		this.valor = valor;
		this.concessionaria = concessionaria;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getConcessionaria() {
		return concessionaria;
	}
	public void setConcessionaria(String concessionaria) {
		this.concessionaria = concessionaria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}
