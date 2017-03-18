package iftm.poo.aula06;

import java.time.LocalDate;

import iftm.poo.aula03.Cliente;
import iftm.poo.aula04.Funcionario;

public class Emprestimo extends Servico{
	private double valor;
	private double taxa;
	
	public Emprestimo(){}
	
	public Emprestimo(Cliente contratante, Funcionario responsavel, LocalDate dataDeContratacao, double valor, double taxa){
		super(contratante,responsavel,dataDeContratacao);
		this.valor = valor;
		this.taxa = taxa;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double calculaTaxa(){
		return super.calculaTaxa() + this.getValor() * 0.2;
	}
	
}
