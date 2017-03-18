package iftm.poo.aula01;

public class Programa11 {

	public static void main(String[] args) {
		String s = "Programação Orientada a Objetos";
		
		boolean resultado1 = s.contains("Objetos");
		boolean resultado2 = s.contains("objetos");
		
		
		System.out.println("String s = " + s);
		System.out.println("Na string s contêm a palavra 'Objetos' " + resultado1);
		System.out.println("Na string s contêm a palavra 'objetos' " + resultado2);
	}

}
