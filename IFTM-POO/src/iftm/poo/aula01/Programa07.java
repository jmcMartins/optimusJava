package iftm.poo.aula01;

public class Programa07 {

	public static void main(String[] args) {
		int numeros[][] = new int[10][5]; //declarando e inicializando
		
		//populando de forma automática
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Tamanho da array na posição: [i] = [" + i + "]" + numeros[i].length );
				numeros[i][j] = i * j + 3;
			}
			
		}
		
		//Percorrendo os campos e imprimindo o valor
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("O valor da array na posição [" + i + "][" + j + "] é " + numeros[i][j]);
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("O valor da array na posição [" + i + "][" + j + "] é " + numeros[i][j]);
			}
		}


	}

}
