package iftm.poo.aula04;

public class Funcionario {
	
	private String nome;
	private double salario;
	private static double valeRefeicao = 15;
	private int id;
	private static int contador;	

	public Funcionario() {
		Funcionario.contador++;
		this.id = Funcionario.contador;
	}
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		
		Funcionario.contador++;
		this.id = Funcionario.contador;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getValeRefeicao() {
		return valeRefeicao;
	}
	
	public void setValeRefeicao(double valeRefeicao) {
		Funcionario.valeRefeicao = valeRefeicao;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Funcionario.contador = contador;
	}
	
	
	public static void reajustarValeRefeicao(double taxa) {
		Funcionario.valeRefeicao += Funcionario.valeRefeicao * taxa;
	}
}
