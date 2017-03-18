package iftm.poo.lista2;

public class ControleRemoto {
	Televisao t = new Televisao();
	
	private int controleVolume;
	private int controleCanal;
	
	public void ControleRemoto(){}
	
	public int getControleVolume() {
		return controleVolume;
	}
	public void setControleVolume(int controleVolume) {
		this.controleVolume = controleVolume;
	}
	public int getControleCanal() {
		return controleCanal;
	}
	public void setControleCanal(int controleCanal) {
		this.controleCanal = controleCanal;
	}
	
	public void aumentarVolume(int com){
		if(this.getControleVolume() < 10){
		this.controleVolume++;
		t.setVolume(controleVolume);
		}else{
			System.out.println("Volume Maximo.");
		}
	}
	public void diminuirVolume(int com){
		if(this.getControleVolume() > 0){
		this.controleVolume--;
		t.setVolume(controleVolume);
		}else{
			System.out.println("Volume minimo.");
		}
	}
	public void subirCanal(int com){
		if(t.getCanal() < 10){
				this.controleCanal = t.getCanal();
				this.controleCanal++;
				t.setCanal(controleCanal);
		}else{
			System.out.println("Canal maximo. Canal: 10");
		}
	}
	public void descerCanal(int com){
		if(t.getCanal() > 1){
			this.controleCanal = t.getCanal();
			this.controleCanal--;
			t.setCanal(controleCanal);
		}else{
			System.out.println("Canal minimo. Canal: 1");
		}
	}
	public void pularCanal(int com){
		if(com > 0 && com <= 10){
			t.setCanal(com);
		}else{
			System.out.println("Canal não encontrado.\nTente uma opção de 1 a 10.");
		}
	}
}
