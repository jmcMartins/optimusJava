package iftm.poo.aula01;

public class Programa09 {

	public static void main(String[] args) {
		calculaSomatorio("Nada");
		calculaSomatorio("Um", 3.4);
		calculaSomatorio("Dois", 4.9, 7);
		calculaSomatorio("Três", 6.6, 89, 435);
		calculaSomatorio("Vários", 6.6, 89, 435, 8, 56, 99);
	}
	
	public static void calculaSomatorio(String descricao, double ... valores){  
		double soma = 0;
		for (int i = 0; i < valores.length; i++){
			soma += valores[i];
		}
		System.out.println("A soma de " + descricao + " é: " + soma);
	}

}
