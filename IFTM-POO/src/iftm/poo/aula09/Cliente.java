package iftm.poo.aula09;

public class Cliente {
	
	private String nome;
	private String telefone;
	private int codigo;
	private static int cont;

	public Cliente(){
		Cliente.cont++;
		this.codigo = Cliente.cont;
	}
	
	public Cliente(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
		Cliente.cont++;
		this.codigo = Cliente.cont;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Cliente.cont = cont;
	}
	
}
