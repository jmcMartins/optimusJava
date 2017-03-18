package iftm.poo.aula02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private String rg;
	private int cpf;
	private LocalDate nascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == "Margarido"){
			this.nome = nome;
		}else
			System.out.println("Esse nome não é Margarido");
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public void cumprimenta(String cumprimento){
		System.out.println(cumprimento);
	}
		
	public int retornaIdade(){
		LocalDate hoje = LocalDate.now();
		LocalDate nascimento = this.getNascimento();
		int idade = (hoje.getYear() - nascimento.getYear());
		
		return idade;
	}
	
	public void preencherInfos(String nome, String rg, int cpf, LocalDate nascimento){
		this.setNome(nome);
		this.setRg(rg);
		this.setCpf(cpf);
		this.setNascimento(nascimento);
	}
	
	public void imprimeInfos(){
		System.out.println("Nome: " + this.getNome());
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Nascimento: " + this.getNascimento().format(formatador));
		System.out.println("RG: " + this.getRg());
		System.out.println("CPF: " + this.getCpf());
		System.out.println();
	}
	
	
}
