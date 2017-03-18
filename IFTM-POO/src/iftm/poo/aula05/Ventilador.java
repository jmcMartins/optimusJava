package iftm.poo.aula05;

public class Ventilador {
	
	private boolean ligado = false;
	private String marca;
	private String modelo;
	
	public Ventilador(){}
	
	public Ventilador(boolean ligado, String marca, String modelo){
		this.ligado = ligado;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
