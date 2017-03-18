package iftm.poo.prova2.ex01;

public class Vendedor extends Empregado {

	private double valorVendas;
	private int qntVendas;
	
	public Vendedor(){
		
	}
	public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double vv, int qv){
		super(nome,idade,sexo,salario,matricula);
		this.valorVendas = vv;
		this.qntVendas = qv;
		
	}
	
	@Override
	public float valorInss() {
		
		float inss = (float) (this.getSalario() * 0.11f);
		return inss;
	}
	@Override
	public String toString() {
		
		return "Nome: "+this.getNome()+"\nSalario: "+this.getSalario()+"\nValor das Vendas: "+this.getValorVendas()+"\nQnt Vendas: "+this.getQntVendas();
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getQntVendas() {
		return qntVendas;
	}
	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

}
