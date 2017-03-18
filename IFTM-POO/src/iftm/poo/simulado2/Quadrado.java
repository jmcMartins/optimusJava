package iftm.poo.simulado2;

public class Quadrado extends Retangulo{
	
	private float lado;
	private float altura;
	
	public Quadrado(){
		
	}
	public Quadrado(float lado, float altura){

		this.lado = lado;
		this.altura = altura;
	}
	
	@Override
	public float calcularArea() {
		
		return this.getLado()*this.getLado();
	}
	
	@Override
	public float calcularPerimetro() {
		return 4 * this.getLado();
	}
	
	
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

}
