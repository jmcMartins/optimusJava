package iftm.poo.aula08;

public class Gerente extends Funcionario {
	private String usuario;
	private String senha;
	
	public Gerente(){}
	
	public Gerente(String usuario, String senha){
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;	}

	public void imprimeDados() {
		System.out.println("---Dados Gerente---");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Usuario: "+this.getUsuario());
		System.out.println("Senha: "+this.getSenha());
	}
}
