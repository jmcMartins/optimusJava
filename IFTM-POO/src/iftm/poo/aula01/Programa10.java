package iftm.poo.aula01;

public class Programa10 {

	public static void main(String[] args) {
		String nome="Margarido";
		
		System.out.println("Meu nome é " + nome);
		
		System.out.println("O tamanho da string é: " + nome.length());
		
		System.out.println(" ");
		
		for(int i = 0; i < nome.length(); i++){
			System.out.println(nome.charAt(i));
		}

	}

}
