package iftm.poo.simulado2;

public class Subtracao implements OperacaoMatematica{

	public Subtracao(){
		
	}

	@Override
	public int calcula(int a, int b) {
		a = a-b;
		return a;
	}
	
}
