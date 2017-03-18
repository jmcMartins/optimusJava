package iftm.poo.prova2.ex01;

public abstract class Empregado extends Pessoa {
	
	private double salario;
	private String matricula;
	
	public Empregado(){
		
	}
	public Empregado(String nome, int idade, String sexo, double salario, String matricula){
		super(nome,idade,sexo);
		this.salario = salario;
		this.matricula = matricula;
	}
	
	public abstract float valorInss();
	
	public abstract String toString();
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
