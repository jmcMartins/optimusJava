package iftm.poo.lista4;

public abstract class Veiculo {
	private double velocidade;
	
	public Veiculo(){
		
	}
	public Veiculo(double vel){
		this.velocidade = vel;
	}

	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public abstract float acelerar(float velocidade);
	public abstract void parar();

}
