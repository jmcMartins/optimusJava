package iftm.poo.aula01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Programa29 {

	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Zebra");
		lista1.add("Avestruz");
		lista1.add("Cachorro");
		lista1.add("Papagaio");
		
		System.out.println("-- Lista 1 Sem Ordenação --");
		for (int i = 0; i < lista1.size(); i++) {
			System.out.println("Dado: " + lista1.get(i));
		}
		
		//Ordenando a lista 1
		Collections.sort(lista1); // FUNCIONA APENAS COM VARIÁVEIS DO MESMO TIPO
				
		System.out.println("-- Lista 1 Com Ordenação --");
		for (int i = 0; i < lista1.size(); i++) {
			System.out.println("Dado: " + lista1.get(i));
		}
		
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		lista2.add(690);
		lista2.add(22);
		lista2.add(2);
		lista2.add(1);
		lista2.add(45);
		
		System.out.println("-- Lista 2 Sem Ordenação --");
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println("Dado: " + lista2.get(i));
		}
		
		//Ordenando a lista 2
		Collections.sort(lista2);
		
		System.out.println("-- Lista 2 Com Ordenação --");
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println("Dado: " + lista2.get(i));
		}
		
		System.out.println("O maior número da lista 2 é " + Collections.max(lista2));
		
		System.out.println("O menor número da lista 2 é " + Collections.min(lista2));
		
		for (int i = 0; i < lista2.size(); i++) {
			if(lista2.get(i) % 2 != 0){
				System.out.println("Removi o número " + lista2.get(i));
				lista2.remove(i);
			}
		}
		
		System.out.println("-- Lista 2 Com Ordenação --");
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println("Dado: " + lista2.get(i));
		}
		
	}

}
