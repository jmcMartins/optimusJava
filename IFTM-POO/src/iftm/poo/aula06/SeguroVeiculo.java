package iftm.poo.aula06;

import java.time.LocalDate;

import iftm.poo.aula03.Cliente;
import iftm.poo.aula04.Funcionario;

public class SeguroVeiculo extends Servico {
	private Veiculo veiculo;
	private double valorDoSeguroDeVeiculos;
	private double franquia;
	
	public SeguroVeiculo(){}
	
	public SeguroVeiculo(Cliente contratante, Funcionario responsavel, LocalDate dataDeContratacao, Veiculo veiculo, double valorDoSeguroDeVeiculo, double franquia){
		super(contratante,responsavel,dataDeContratacao);
		this.veiculo = veiculo;
		this.valorDoSeguroDeVeiculos = valorDoSeguroDeVeiculo;
		this.franquia = franquia;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public double getValorDoSeguroDeVeiculos() {
		return valorDoSeguroDeVeiculos;
	}
	public void setValorDoSeguroDeVeiculos(double valorDoSeguroDeVeiculos) {
		this.valorDoSeguroDeVeiculos = valorDoSeguroDeVeiculos;
	}
	public double getFranquia() {
		return franquia;
	}
	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}
	public double calculaTaxas(){
		return super.calculaTaxa() + this.getVeiculo().getPrecoDeFabrica() * 0.05;
	}
}
