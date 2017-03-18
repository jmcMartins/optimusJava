package iftm.poo.lista4;

public class Automovel extends Veiculo{
	private double km;
	private double velocidade;
	private String modelo;
	private String marca;
	private String nivelOleo;

	public Automovel(String modelo, String marca, double vel,String ole, double km){
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
		this.velocidade = vel;
		this.nivelOleo = ole;
	}
	public Automovel(){	
		
	}
	
	public void mudarOleo(float litros){
		
	}
	
	public float acelerar(float velocidade) {
		
		return velocidade;
	}
	public void parar() {
		
	}
	
	public String getNivelOleo() {
		return nivelOleo;
	}
	
	public void setNivelOleo(String nivelOleo) {
		this.nivelOleo = nivelOleo;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}
