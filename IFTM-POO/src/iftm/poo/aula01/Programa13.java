package iftm.poo.aula01;
public class Programa13{
	
	public static void main(String[] args){
		String s = "Programação Orientada a Objetos com java";
		
		boolean res1 = s.startsWith("Programação");
		boolean res = s.startsWith("Orientada");
		
		System.out.println("String s = " + s);
		System.out.println("A string s começa com a palavra 'Programação'" + res1);
		System.out.println("A string s começa com a palavra 'Orientada'" + res);
	}
}