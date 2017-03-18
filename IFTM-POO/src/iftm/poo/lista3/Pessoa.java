package iftm.poo.lista3;

public class Pessoa {
	
	String nome;
	String endereco;
	String telefone;
	
	public Pessoa(){}
	
	public Pessoa(String nome, String endereco, String telefone){
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprimirDados(){
		System.out.println("Nome: "+this.getNome());
		System.out.println("Endereço: "+this.getEndereco());
		System.out.println("Telefone: "+this.getTelefone());
	}
	
}
