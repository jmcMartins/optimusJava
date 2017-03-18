package iftm.poo.aula06;

public class Veiculo {
	private String marca;
	private String modelo;
	private double precoDeFabrica;
	
	public Veiculo(){}
	
	public Veiculo(String marca, String modelo, double precoDeFabrica){
		this.marca = marca;
		this.modelo = modelo;
		this.precoDeFabrica = precoDeFabrica;
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
	public double getPrecoDeFabrica() {
		return precoDeFabrica;
	}
	public void setPrecoDeFabrica(double precoDeFabrica) {
		this.precoDeFabrica = precoDeFabrica;
	}
	
}
