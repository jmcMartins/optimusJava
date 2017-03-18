package iftm.poo.prova2.ex04;

public interface ItemBiblioteca {
	
	public abstract boolean isEmprestado();
	
	public abstract void empresta();
	
	public abstract void devolve();
	
	public abstract String apresentaDescricao();
	
	public abstract String localiza();
	
	
}
