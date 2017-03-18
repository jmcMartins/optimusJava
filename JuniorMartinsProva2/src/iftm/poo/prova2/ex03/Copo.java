package iftm.poo.prova2.ex03;

public class Copo {
	
	private int capacidadeMaxima;
	private int capacidadeAtual;
	private String cor;
	private String material;
	
	public Copo(){
		
	}
	public Copo(int capacidadeMaxima,int capacidadeAtual, String cor, String material){
		this.capacidadeMaxima = capacidadeMaxima;
		if(capacidadeAtual <= capacidadeMaxima){
			if(capacidadeAtual < 0){
				System.out.println("\nNão exite capacidate atual negativa. O povo vai ser considerado seco com 0ml.");
				this.capacidadeAtual = 0;
			}else{
				this.capacidadeAtual = capacidadeAtual;
			}
		}else{
			System.out.println("\n O copo derramou por tentar encher mais que ele cabe e vai ser considerado cheio no programa.");
			this.capacidadeAtual = capacidadeMaxima;
		}
		this.cor = cor;
		this.material = material;
		
	}
	
	public void encher(){
	
		if(this.getCapacidadeAtual() < this.getCapacidadeMaxima()){
			this.setCapacidadeAtual( this.getCapacidadeAtual() + 1 );
		}else{
			System.out.println(" [Esborrou] ");
		}
	}
	
	public void esvaziar(){
		
		if(this.getCapacidadeAtual() > 0){
			this.setCapacidadeAtual(this.getCapacidadeAtual() - 1);
		}else{
			System.out.println(" [Seco] ");
		}
	}
	
	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}
	public void setCapacidadeAtual(int capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void getInformacoes(){
		System.out.println("O copo "+this.getCor()+" de "+this.getMaterial()+" armazena até "+this.getCapacidadeMaxima()+" ml e atualmente contém "+this.getCapacidadeAtual()+" ml de liquido.");
	}
	
}
