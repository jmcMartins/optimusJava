package iftm.poo.lista4;

public class Cachorro extends Animal {
	private String raca;
	
	public Cachorro(){
		
	}
	public Cachorro(String raca){
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String toString() {
		return "Nome: " + this.getNome() + "\nPeso: " + this.getPeso() +"\nRaça: " + this.getRaca();
	}

}
