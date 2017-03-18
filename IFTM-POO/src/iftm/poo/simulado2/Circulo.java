package iftm.poo.simulado2;
import java.lang.Math;

public class Circulo extends Forma {

	private float raio;
	
	public Circulo(){
		
	}
	public Circulo(float raio){
		this.raio = raio;
	}
	
	@Override
	public float calcularArea() {

		return (float) (Math.PI * ( this.getRaio()*this.getRaio() ));
	}

	@Override
	public float calcularPerimetro() {
	
		return (float) (2*Math.PI*this.getRaio());
	}
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

}
