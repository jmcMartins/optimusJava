package iftm.poo.lista4;

public class Peixe extends Animal{
	private String tipoHabitat;
	
	public Peixe(){
		
	}
	public Peixe(String tipoHabitat){
		this.tipoHabitat = tipoHabitat;
	}

	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}

	public String toString() {
		return "Nome: " + this.getNome() + "\nPeso: " + this.getPeso() +"\nTipo Habitat: " + this.getTipoHabitat();
	}
	
}
