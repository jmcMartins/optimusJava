package iftm.poo.lista4;

public class Bicicleta extends Veiculo{
	private double velocidade;
	private String nome;

	private Bicicleta(){
		
	}
	private Bicicleta(double vel, String nome){
		this.velocidade = vel;
		this.nome = nome;
	}
	
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public float acelerar(float velocidade) {
		
		return velocidade;
	}

	
	public void parar() {
		
	}
}
