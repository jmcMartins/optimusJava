package iftm.poo.aula01;

public class Programa06 {

	public static void main(String[] args) {
		
		int numeros[]; //Declaração
		numeros = new int[10]; //Inicialização
		
		int outrosNumeros[] = new int[10]; //Declaração e inicialização
		
		int maisNumeros[] = {1, 3, 5, 7, 9, 11}; //Declaração, inicialização
		
		//Colocando dados em cada posição de forma automática
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = i + 3;
		}
		
		//Lendo os dados em cada posição
		for(int i = 0; i < numeros.length; i++){
			System.out.println("O valor do array na posição " + i + " é " + numeros[i]);
		}

	}

}
