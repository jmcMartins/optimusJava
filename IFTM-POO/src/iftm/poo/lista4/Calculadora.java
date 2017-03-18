package iftm.poo.lista4;

public abstract class Calculadora {
	private double soma;
	private double div;
	private double sub;
	private double mul;
	
	public Calculadora(){
	}
	public Calculadora(double soma, double sub, double mul, double div){
		this.soma = soma;
		this.sub = sub;
		this.mul = mul;
		this.div = div;
	}
	
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
	}
	public double getDiv() {
		return div;
	}
	public void setDiv(double div) {
		this.div = div;
	}
	public double getSub() {
		return sub;
	}
	public void setSub(double sub) {
		this.sub = sub;
	}
	public double getMul() {
		return mul;
	}
	public void setMul(double mul) {
		this.mul = mul;
	}
	
	public abstract void somar(double num1, double num2);
	
	public abstract void dividir(double num1, double num2);
	
	public abstract void multiplicar(double num1, double num2);
	
	public abstract void subtrair(double num1, double num2);
}
