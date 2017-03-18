package iftm.poo.aula09;

import java.time.LocalDate;

public class Gerente extends Funcionario implements Acesso{
	
	public Gerente() {}
	
	public Gerente(String nome, LocalDate data, double salario) {
		super(nome,data,salario);
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
