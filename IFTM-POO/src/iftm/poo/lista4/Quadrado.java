package iftm.poo.lista4;

public class Quadrado implements FormaGeometrica{
	double area;
	double lado;
	double comprimento;
	
	public Quadrado(){}
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	public void calcularArea(){
		this.area = this.getLado() * this.getLado();
	}
	public void calcularComprimento(){
		this.comprimento = this.getLado() * 4;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setPerimetro(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public String toString() {
		return "Area: "+this.getArea() + "\nComprimento: " + this.getComprimento();
	}

}