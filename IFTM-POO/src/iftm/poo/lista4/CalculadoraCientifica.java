package iftm.poo.lista4;
import  java.lang.Math;

public class CalculadoraCientifica extends Calculadora{
	private double raiz;
	private double pot;
	
	public CalculadoraCientifica(){
	}
	
	public CalculadoraCientifica(double raiz, double pot){
		this.raiz = raiz;
		this.pot = pot;
	}
	
	public double getRaiz() {
		return raiz;
	}

	public void setRaiz(double raiz) {
		this.raiz = raiz;
	}

	public double getPot() {
		return pot;
	}

	public void setPot(double pot) {
		this.pot = pot;
	}
	
	public void raizQuadrada(double raiz){
		this.raiz = Math.sqrt(raiz);
		System.out.println("Resul: "+this.getRaiz());
	}
	
	public void potencia(double base, double pot){
		this.pot = Math.pow(base, pot);
		System.out.println("Resul: "+this.getPot());
	}

	public void somar(double num1, double num2) {
		num1 = num1 + num2;
		this.setSoma(num1);
		System.out.println("Resul: "+this.getSoma());
	}

	public void dividir(double num1, double num2) {
		num1 = num1 / num2;
		this.setDiv(num1);
		if(num2 != 0){
			System.out.println("Resul: "+this.getDiv());
		}else{
			System.out.println("Não e possivel dividir por zero. ");
		}
	}

	public void multiplicar(double num1, double num2) {
		num1 = num1 * num2;
		this.setMul(num1);
		System.out.println("Resul: "+this.getMul());
	}

	public void subtrair(double num1, double num2) {
		num1 = num1 - num2;
		this.setSub(num1);
		System.out.println("Resul: "+this.getSub());
	}

}
