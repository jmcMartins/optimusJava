package iftm.poo.lista3;

public class Retangulo {
	double comprimento;
	double largura;
	double area;
	double perimetro;
	
	public Retangulo(){}
	
	public Retangulo(double comprimento, double largura){
		this.comprimento = comprimento;
		this.largura = largura;		
	}
	
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
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
	
	public void calcularArea(){
		this.area = this.getComprimento() * this.getLargura();
	}
	public void calcularPerimetro(){
		this.perimetro = (2*this.getComprimento()) + (2*this.getLargura());
	}
	public void imprimirDados(){
		System.out.println("Comprimento: "+this.getComprimento());
		System.out.println("Largura: "+this.getLargura());
		System.out.println("Area: "+this.getArea());
		System.out.println("Perimetro: "+this.getPerimetro());
	}
	
	
}
