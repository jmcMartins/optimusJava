package iftm.poo.lista1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList nome = new ArrayList();
		ArrayList<Integer> idade = new ArrayList<Integer>();
		
		for(int i=0; i < 3; i++){
			System.out.println("Digite o "+ (i+1)+"º Nome!");
			nome.add(teclado.next());
			System.out.println("Digite a idade da "+(i+1)+"º Pessoa");
			idade.add(teclado.nextInt());
		}
		int maior,menor;
		
		maior = Collections.max(idade);
		menor = Collections.min(idade);
		
		for (int i = 0; i < 3; i++) {
			if(idade.get(i) == maior){
				System.out.println("A pessoa mais velha é: "+nome.get(i));
			}
			if(idade.get(i) == menor){
				System.out.println("A pessoa mais nova é: "+nome.get(i));
			}
		}
		teclado.close();
	}
}
