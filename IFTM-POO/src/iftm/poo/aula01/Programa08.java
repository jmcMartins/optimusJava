package iftm.poo.aula01;

public class Programa08 {

	public static void exibeMensagem() {
		System.out.println("Uma mensagem do meu método.");
	}
	
	public static int exibeNumero(int numeral) {
		numeral-=660;
		return numeral;
	}
	
	public static int[] exibeNumero(int vetor[]) {
		return vetor;
	}
	
	public static void main(String[] args) {
		exibeMensagem();
		
		int vetor[] = new int[3];
		for(int cont1 = 0; cont1 < vetor.length; cont1++ ){
			vetor[cont1]=cont1 + 1;
		}
		
		
		int numberOfDaBesta = 666;
		int numero = exibeNumero(numberOfDaBesta);
		System.out.println("O número informado foi: " + numero);
	}

}
