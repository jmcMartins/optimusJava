package iftm.poo.simulado2;

public class Divisao implements OperacaoMatematica{
	
	public Divisao(){
		
	}

	@Override
	public int calcula(int a, int b) {
		if(b != 0){
			a = a/b;
			return a;
		}else{
			return -1;
		}
	}
	
}
