package iftm.poo.prova2.ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Titulo: ");
		String titulo = teclado.nextLine();
		System.out.println("Autor: ");
		String autor = teclado.nextLine();
		System.out.println("Nº Paginas: ");
		int np = Integer.parseInt(teclado.nextLine());
		System.out.println("Ano Edição: ");
		int ano = Integer.parseInt(teclado.nextLine());
		
		LivroBiblioteca lb = new LivroBiblioteca(titulo,autor,np,ano);
		
		lb.apresentaDescricao();
		
		lb.empresta();
		
		lb.apresentaDescricao();
		
		lb.devolve();
		
		lb.apresentaDescricao();
		
		lb.localiza();
		
		lb.apresentaDescricao();
		
		teclado.close();
	}

}
