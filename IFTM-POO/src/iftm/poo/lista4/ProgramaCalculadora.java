package iftm.poo.lista4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaCalculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CalculadoraCientifica cf = new CalculadoraCientifica();
		int op = 0;
		
		System.out.println("Oque deseja fazer?");
		System.out.println("1 - Soma\n"
				+ "2 - Subtração.\n"
				+ "3 - Multiplicação.\n"
				+ "4 - Divisão.\n"
				+ "5 - Raiz Quadrada.\n"
				+ "6 - Potencia. ");
		
		try{
			op = teclado.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Você digitou algo diferente que eu pedi.\nAté Logo!!");
			System.exit(0);
		}
		if(op < 1 || op > 6){
			System.out.println("Opção invalida.\nAté Logo!!");
			System.exit(0);
		}
		
		double num1 = 0, num2 = 0, raiz = 0, pot = 0, base = 0;
		if(op == 5){
			try{
				System.out.println("Raiz: ");
				raiz = teclado.nextDouble();
			}catch(InputMismatchException e){
				System.out.println("Você digitou algo errado.\nAté Logo!!");
				System.exit(0);
			}
		}else if(op == 6){
			try{
				System.out.print("Base: ");
				base = teclado.nextDouble();
				System.out.print("Potencia: ");
				pot = teclado.nextDouble();
				System.out.println();
			}catch(InputMismatchException e){
				System.out.println("Você digitou algo errado.\nAté Logo!!");
				System.exit(0);
			}
		}else{
			try{
				System.out.print("Num 1: ");
				num1 = teclado.nextDouble();
				System.out.print("Num 2: ");
				num2 = teclado.nextDouble();
				System.out.println();
			}catch(InputMismatchException e){
				System.out.println("Você digitou algo errado.\nAté Logo!!");
				System.exit(0);
			}
		}
		switch(op){
			case 1:
				cf.somar(num1, num2);
				break;
			case 2:
				cf.subtrair(num1, num2);
				break;
			case 3:
				cf.multiplicar(num1, num2);
				break;
			case 4:
				cf.dividir(num1, num2);
				break;
			case 5:
				cf.raizQuadrada(raiz);
				break;
			case 6:
				cf.potencia(base, pot);
				break;
		}
		teclado.close();
	}
}
