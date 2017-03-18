package iftm.poo.simulado2;

public class Multiplicacao implements OperacaoMatematica{
	
	public Multiplicacao(){
		
	}
	@Override
	public int calcula(int a, int b) {
		a = a*b;
		return a;
	}
	
}
