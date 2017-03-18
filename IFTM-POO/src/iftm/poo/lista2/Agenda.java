package iftm.poo.lista2;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public ArrayList<Pessoa> getPessoa() {
		return pessoas;
	}

	public void setPessoa(ArrayList<Pessoa> pessoa) {
		this.pessoas = pessoa;
	}
	
	public Agenda(){
	}
	
	public void armazenaPessoa(String nome, int idade, float altura){
		Pessoa p = new Pessoa(nome, idade, altura);
		pessoas.add(p);
	}
	public void removePessoa(String nome){
		boolean encontrou = false;
		for (int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getNome() == nome){
				pessoas.remove(i);
				encontrou = true;
			}
		}
		if(encontrou){
			System.out.println("Pessoa removida com sucesso.");
		}else{
			System.out.println("Pessoa não encontrada.");
		}	
	}
	
	public int buscaPessoa(String nome){
		int retorno = -1;
		for (int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getNome() == nome){
				retorno = i;
			}
		}
		return retorno;
	}
	
	public void imprimeAgenda(){
		if(pessoas.size()>=0){
			for (int i = 0; i < pessoas.size(); i++) {
				System.out.println((i+1)+"º Pessoa");
				System.out.println("Nome: "+pessoas.get(i).getNome());
				System.out.println("Idade: "+pessoas.get(i).getIdade());
				System.out.println("Altura: "+pessoas.get(i).getAltura());
				System.out.println();
			}
		}else{
			System.out.println("Não exite nenhuma pessoa na agenda.");
		}
	}
	
	public void imprimePessoa(int index){
		if(pessoas.size()>0){
			Pessoa p = null;
			if(pessoas.get(index) != null){
				p = pessoas.get(index);
				System.out.println(index+"º Pessoa");
				System.out.println("Nome: "+p.getNome());
				System.out.println("Idade: "+p.getIdade());
				System.out.println("Altura: "+p.getAltura());
				System.out.println();
			}else{
				System.out.println("Pessoa não encontrada.");
			}
			
		}else{
			System.out.println("Não exite nenhuma pessoa na agenda.");
		}
	}
	
	
}
