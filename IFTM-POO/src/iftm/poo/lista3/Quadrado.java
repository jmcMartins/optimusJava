package iftm.poo.lista3;

public class Quadrado {
	double area;
	double lado;
	double perimetro;
	
	public Quadrado(){}
	
	public Quadrado(double lado){
		this.lado = lado;
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
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public void calcularArea(){
		this.area = this.getLado() * this.getLado();
	}
	public void calcularPerimetro(){
		this.perimetro = this.getLado() * 4;
	}
	public void imprimirDados(){
		System.out.println("Lado: "+this.getLado());
		System.out.println("Area: "+this.getArea());
		System.out.println("Perimetro: "+this.getPerimetro());
	}
}
