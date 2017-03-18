package iftm.poo.aula10;

public class Divisao {
	private int media = 0;

	public Divisao(){
		
	}
	public Divisao(int media){
		this.media = media;
	}
	
	
	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}
	
	public void calculaMedia(int a, int b){
		try{
			int media = a/b;
			this.setMedia(media);
			System.out.println("Media: "+this.getMedia());
		}catch(ArithmeticException e){
			System.out.println("Voce  dividiu por zero.");
		}
		
	}
}
