package iftm.poo.simulado2;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int verdade=0,op = 0,a = 0, b = 0;

		System.out.println("Oque deseja fazer?");
		System.out.println("1 - Soma\n"
				+ "2 - Subtração.\n"
				+ "3 - Multiplicação.\n"
				+ "4 - Divisão.");
		System.out.print(": ");
		
		try{
			op = Integer.parseInt(teclado.nextLine());
			try{
				System.out.print("Num1: ");
				a = Integer.parseInt(teclado.nextLine());
				System.out.print("Num2: ");
				b = Integer.parseInt(teclado.nextLine());
				System.out.println();
			}catch(NumberFormatException e){
				verdade = 1;
				System.out.println();
			}
		}catch(NumberFormatException e){
			System.out.println();
		}
		
		if(op == 1 && verdade == 0){
			Soma soma = new Soma();
			System.out.println("Resul: "+ soma.calcula(a, b));
			
		}else if(op == 2 && verdade == 0){
			Subtracao sub = new Subtracao();
			System.out.println("Resul: "+ sub.calcula(a, b));
			
		}else if(op == 3 && verdade == 0){
			Multiplicacao mul = new Multiplicacao();
			System.out.println("Resul: "+ mul.calcula(a, b));
			
		}else if(op == 4 && verdade == 0){
			Divisao div = new Divisao();
			double resul = div.calcula(a, b);
			if(resul != -1){
				System.out.println("Resul: "+ resul);
			}else{
				System.out.println("E impossivel dividir um número por 0. ");
			}
			
		}else{
			System.out.println("Você digitou algo diferente que eu pedi.");
		}
		teclado.close();
	}

}
