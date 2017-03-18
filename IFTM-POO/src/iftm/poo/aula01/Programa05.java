package iftm.poo.aula01;

public class Programa05 {

	public static void main(String[] args) {
		
		int valor = 5;
		while(valor < 5){
			System.out.println("Estou imprimindo...pelo while");
			valor++;
		}
		
		int outro = 5;
		do{
			System.out.println("Imprimindo pelo do-while");
			outro++;
		}while(outro <= 5);
		
		int val = 5;
		if(val < 5){
			System.out.println("Menor que 5");
		}else if(val == 5){
			System.out.println("Igual a 5");
		}else{
			System.out.println("Maior que 5");
		}

	}

}
