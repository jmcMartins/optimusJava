package iftm.poo.lista3;

public class Circulo {
	double raio;
	double area;
	double perimetro;
	double pi = 3.14;
	
	public Circulo(){}
	
	public Circulo(double raio){
		this.raio = raio;
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
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public void calculaArea(){
		this.area = pi*this.getRaio()*this.getRaio();
	}
	public void calculaPerimetro(){
		this.perimetro = 2*pi*this.getRaio();
	}
	
	public void imprimirDados(){
		System.out.println("Raio: "+this.getRaio());
		System.out.println("Area: "+this.getArea());
		System.out.println("Perimetro: "+this.getPerimetro());
	}
	
}
