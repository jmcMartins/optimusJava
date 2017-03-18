package iftm.poo.lista1;

import java.util.LinkedList;
import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa 2");
		
		int num = 1, cont = 0;

		LinkedList par = new LinkedList();
		LinkedList impar = new LinkedList();
		
		System.out.println("Digite o número");
		num = teclado.nextInt();
		if(num==0){
			System.out.println("VocÊ começou com o número 0 !");
			System.exit(0);
		}
		while(num > 0){
			cont++;
			if(num%2==0){
				par.add(num);
			}else{
				impar.add(num);
			}
		System.out.println("Digite o número ");
		num = teclado.nextInt();
		}

		System.out.println("Foram digitados " + cont + " Números");
		
		System.out.println(par.size()+" Pares!");
		for(int i = 0; i < par.size(); i++){
			System.out.print(par.get(i));
			System.out.print(", ");
		}
		System.out.println();
		System.out.println(impar.size()+" Impares!");
		for(int j = 0; j < impar.size(); j++){
			System.out.print(impar.get(j));
			System.out.print(", ");
		}
	teclado.close();
	}
}
