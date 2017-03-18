package iftm.poo.lista2;

public class Televisao {
	private int canal=1;
	private int volume=0;
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void consultarVolume(){
		System.out.println("Volume: "+this.getVolume());
	}
	public void consultarCanal(){
		System.out.println("Canal: "+this.getCanal());
	}
	
}
