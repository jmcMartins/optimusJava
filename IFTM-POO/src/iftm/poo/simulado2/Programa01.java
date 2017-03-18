package iftm.poo.simulado2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op = 0,ops = 0;
		boolean verdade = true;
		
		Retangulo r = new Retangulo();
		Circulo c = new Circulo();
		Quadrado q = new Quadrado();
		
		while(verdade){
			
			try{
				System.out.println("Qual e a forma do seu objeto? ");
				System.out.println("1 - Retangulo.\n2 - Circulo.\n3 - Quadrado.");
				op = Integer.parseInt(teclado.nextLine());
			}catch(NumberFormatException e){
				System.out.println();
			}
			
			if(op == 1){
				try{
					System.out.println("Digite o lado do Retangulo: ");
					float lado = Float.parseFloat(teclado.nextLine());
					System.out.println("Digite a Altura do Retangulo: ");
					float altura = Float.parseFloat(teclado.nextLine());
					r.setLado(lado);
					r.setAltura(altura);
				}catch(NumberFormatException e){
					System.out.println("Dados incorretos. ");
				}
		
				System.out.println("Area: "+r.calcularArea() );
				System.out.println("Perimetro: "+r.calcularPerimetro());
				
			}else if(op == 2){
				try{
					System.out.println("Digite o raio do Circulo: ");
					float raio = Float.parseFloat(teclado.nextLine());
					c.setRaio(raio);
				}catch(NumberFormatException e){
					System.out.println("Dados incorretos. ");
				}
		
				System.out.println("Area: "+c.calcularArea() );
				System.out.println("Perimetro: "+c.calcularPerimetro());
				
				
			}else if(op == 3){
				
				try{
					System.out.println("Digite o lado do Quadrado: ");
					float lado = Float.parseFloat(teclado.nextLine());
					r.setLado(lado);
					r.setAltura(lado);
				}catch(NumberFormatException e){
					System.out.println("Dados incorretos. ");
				}
		
				System.out.println("Area: "+r.calcularArea() );
				System.out.println("Perimetro: "+r.calcularPerimetro());
				
			}else{
				System.out.println("Você digitou algo diferente doque eu perguntei.");	
			}
			boolean a = true;
			while(a){
			System.out.println();
			try{
				System.out.println("Deseja continuar?\n1 - Sim\n2 - Não.");
				op = Integer.parseInt(teclado.nextLine());
				if(op == 2){
					verdade = false;
					a = false;
					System.out.println("Até Logo...");
				}else if(op == 1){
					a = false;
				}
			}catch(NumberFormatException e){
				System.out.println("Dados invalidos.");
			}
			
			}
			
		System.out.println();
		}
		teclado.close();
	}

}
