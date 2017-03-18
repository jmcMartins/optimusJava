package iftm.poo.aula06;

public class Gerente extends Funcionario{
	String usuario;
	String senha;
	
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
	
	public void alteraSalario(double novoSalario){
		this.setSalario(novoSalario);
		System.out.println("Salario alterado com sucesso.");
		System.out.println("Você gerente recebe agora R$ "+this.getSalario()+".");
	}
	public void alterarSenha(String nova){
		System.out.println("Senha alterada com sucesso.");
		this.senha = nova;
	}
	public void alteraSalario(Funcionario Funcionario, double novoSalario){
		Funcionario.setSalario(novoSalario);
		System.out.println("Salario alterado com sucesso.");
		System.out.println(Funcionario.getNome()+" Você recebe agora R$ "+Funcionario.getSalario()+".");
	}
}
