package iftm.poo.lista2;

public class Elevador {
	private int andarAtual=0;
	private int totalAndares=0;
	private int capacidadeElevador=0;
	private int quantPessoas=0;
	
	public Elevador(){}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	public int getQuantPessoas() {
		return quantPessoas;
	}
	public void setQuantPessoas(int quantPessoas) {
		this.quantPessoas = quantPessoas;
	}
	
	public void inicializaElevaor(int capacidade, int totalAndares){
		
		this.capacidadeElevador = capacidade;
		this.totalAndares = totalAndares;
	}
	
	public void entraElevador(int entrou){ 
		
		if(entrou <= this.getCapacidadeElevador()){
			this.quantPessoas = this.quantPessoas+entrou;
		}else{
			System.out.println("Não exite espaço para essa quantidade de pessoas.");
		}
	}
	
	public void saiElevador(int quant){
		if(this.getQuantPessoas() > 0 && quant <= this.getQuantPessoas()){
			this.quantPessoas = this.quantPessoas-quant;
		}else{
			System.out.println("Não existe pessoas para sair.\nOu esta saindo mais pessoas que existem.");
		}
	}
	
	public void subeAndar(int quant){
		if(quant <= this.getTotalAndares() && this.getAndarAtual() <= this.getTotalAndares()){
			this.andarAtual = this.andarAtual + quant;
		}else{
			System.out.println("Você já está no ultimo andar.\nOu quer subir mais que devia");
		}
	}
	
	public void deceAndar(int quant){
		if(this.getAndarAtual() > 0 && quant <= this.getAndarAtual()){
			this.andarAtual = this.andarAtual - quant;
		}else{
			System.out.println("Você já está no terrio.\nOu quer descer mais que devia.");
		}
	}
	
	public void imprimeDados(){
		System.out.println("Total de Andades: "+this.getTotalAndares());
		System.out.println("Andar Atual: "+this.getAndarAtual());
		
		System.out.println("Capacidade do Elevador: "+this.getCapacidadeElevador());
		System.out.println("Total Pessoas: "+this.getQuantPessoas());
		System.out.println();

	}
}
