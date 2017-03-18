package iftm.poo.aula01;

public class Programa12 {

	public static void main(String[] args) {
		String s = "Programação Orientada a Objetos com Java";
		
		boolean res1 = s.endsWith("Java");
		boolean res2 = s.endsWith("Objetos");
		
		
		System.out.println("String s = " + s);
		System.out.println("Na string s contêm a palavra 'Java' " + res1);
		System.out.println("Na string s contêm a palavra 'Objetos' " + res2);

	}

}
