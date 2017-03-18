package iftm.poo.aula03;

import java.time.LocalDate;

public class CartaoDeCredito {
	
	private int numero;
	private LocalDate dataDeValidade;
	private Cliente cliente;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(LocalDate dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
