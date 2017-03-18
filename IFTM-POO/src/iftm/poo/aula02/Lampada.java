package iftm.poo.aula02;

import java.time.format.DateTimeFormatter;

public class Lampada {

	private boolean status = false;
	private String marca;
	private String cor;
	private int voltagem;
	private int frequencia;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	public void acendeLampada(){
		
	}
	
	public void imprimeInfos(){
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Voltagem: " + this.getVoltagem());
		System.out.println("Frequencia: " + this.getFrequencia());
		System.out.println();
	}
	
}
