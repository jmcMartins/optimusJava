package iftm.poo.aula09;

import java.time.LocalDate;

public class Funcionario {
	
	private String nome;
	private LocalDate dataContratacao;
	private double salario;
	
	public Funcionario(){}
	
	public Funcionario(String nome, LocalDate data, double salario){
		this.nome = nome;
		this.dataContratacao = data;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
