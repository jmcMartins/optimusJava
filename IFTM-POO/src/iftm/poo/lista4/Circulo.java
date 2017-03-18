package iftm.poo.lista4;
import java.lang.Math;

public class Circulo implements FormaGeometrica{
	double raio;
	double area;
	double comprimento;
	double pi = 3.14;
	
	public Circulo(){}
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public void calculaArea(){
		this.area = pi*this.getRaio()*this.getRaio();
	}
	public void calculaComprimento(){
		this.comprimento = 2*pi*this.getRaio();
	}
	
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public String toString() {
		return "Area: "+ Math.floor(this.getArea()) + "\nComprimento: " + Math.floor(this.getComprimento());
	}
}

