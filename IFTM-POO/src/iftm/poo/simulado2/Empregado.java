package iftm.poo.simulado2;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto = 10f;
	
	public Empregado(){
		
	}
	public Empregado(String nome, String end, String fone,int codigoSetor, float salarioBase){
		super(nome,end,fone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}
	
	public void calcularSalario(){
		double salario =  this.getSalarioBase() - ( this.getSalarioBase() * ( this.getImposto() / 100 ) );
		System.out.print("Seu salario e de: "+salario+" Reais.");
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	@Override
	public String toString() {
		return "ID Setor: "+this.getCodigoSetor()+"\nNome: "+this.getNome()+"\nEnd: "+this.getEndereco()+"\nFone: "+this.getTelefone()+"\n";
	}
	
}
