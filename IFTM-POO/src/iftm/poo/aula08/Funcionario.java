package iftm.poo.aula08;

public abstract class Funcionario {
	private int codigo;
	String nome;
	
	private static int contador;
	
	public Funcionario(){
		Funcionario.contador++;
		this.codigo = Funcionario.contador;
	}
	public Funcionario(int id){
		this.codigo = id;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void imprimeDados();
}
