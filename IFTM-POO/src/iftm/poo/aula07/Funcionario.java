package iftm.poo.aula07;

public class Funcionario {
	private int codigo;
	private static int contador;
	
	public Funcionario(){
		Funcionario.contador++;
		this.codigo = Funcionario.contador;
	}
	public Funcionario(int id){
		this.codigo = id;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
