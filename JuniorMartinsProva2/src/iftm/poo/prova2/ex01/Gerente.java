package iftm.poo.prova2.ex01;

public class Gerente extends Empregado{
	
	private String nomeGerencia;
	
	public Gerente(){
		
	}
	public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia){
		super(nome,idade,sexo,salario,matricula);
		this.nomeGerencia = nomeGerencia;
	}
	
	@Override
	public float valorInss() {
		
		float inss = (float) (this.getSalario() * 0.11f);
		return inss;
	}

	@Override
	public String toString() {
	
		return "Nome: "+this.getNome()+"\nIdade: "+this.getIdade()+"\nMatricula: "+this.getMatricula()+"\nNome da Gerencia: "+this.getNomeGerencia()+"\nValor INSS: "+this.valorInss();
	}
	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
}
