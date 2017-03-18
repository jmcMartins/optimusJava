package iftm.poo.aula09;

public class Empresa extends Cliente implements Acesso{
	
	public Empresa() {}
	
	public Empresa(String nome, String telefone) {
		super(nome,telefone);
	}
	
	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("A empresa " + this.getNome() + " acaba de efetuar login no sistema.");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("A empresa " + this.getNome() + " acaba de efetuar logout no sistema.");
	}
}
