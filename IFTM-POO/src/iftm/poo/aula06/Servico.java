package iftm.poo.aula06;

import java.time.LocalDate;

import iftm.poo.aula03.Cliente;
import iftm.poo.aula04.Funcionario;

public class Servico {
	private Cliente contratante;
	private Funcionario responsavel;
	private LocalDate dataDeContratacao;
	
	public Servico(){}
	
	public Servico(Cliente contratante, Funcionario responsavel, LocalDate dataDeContratacao){
		this.contratante = contratante;
		this.responsavel = responsavel;
		this.dataDeContratacao = dataDeContratacao;
	}
	public Cliente getContratante() {
		return contratante;
	}
	public void setContratante(Cliente contratante) {
		this.contratante = contratante;
	}
	public Funcionario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}
	public LocalDate getDataDeContratacao() {
		return dataDeContratacao;
	}
	public void setDataDeContratacao(LocalDate dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}
	public double calculaTaxa(){
		return 5;
	}
	
}
