package iftm.poo.lista3;

public class Moto {
	String marca;
	String modelo;
	String cor;
	int marcha;
	boolean ligada;
	
	public Moto(){}
	public Moto(String marca,String modelo,String cor, int marcha,boolean ligada){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
		this.ligada = ligada;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public void subirMarcha(){
		this.marcha++;
	}
	public void descerMarcha(){
		if(this.getMarcha() > 0){
			this.marcha--;
		}else{
			System.out.println("Já está no neutro.");
		}
	}
	
	public void imprimirDados(){
		System.out.println("Marca: "+this.getMarca());
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Cor: "+this.getCor());
		if(ligada){
		System.out.println("Moto está ligada.");
		}else{
			System.out.println("Moto está desligada.");
		}
	}
	public void imprimirMarcha(){
		if(this.getMarcha() > 0){
			System.out.println("Marcha atual: "+this.getMarcha());
			}else if(this.getMarcha() == 0){
				System.out.println("Marcha atual: Neutro.");
			}else{
				System.out.println("Exite macha negativa? Ta de ré?!");
			}
	}
	
}
