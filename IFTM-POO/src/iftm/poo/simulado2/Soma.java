package iftm.poo.simulado2;

public class Soma implements OperacaoMatematica {
	
	public Soma(){
		
	}

	@Override
	public int calcula(int a, int b) {
		a = a+b;
		return a;
	}
	
}
