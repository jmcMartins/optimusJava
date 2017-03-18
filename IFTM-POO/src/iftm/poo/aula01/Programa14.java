package iftm.poo.aula01;

public class Programa14 {

	public static void main(String[] args) {
		String s = "Matamos o tempo, o tempo nos enterra.";
		
		s = s.replaceAll("o tempo", "um coveiro");
		
		System.out.println(s);
		
		s = s.replace("Matamos", "Beijamos");
		System.out.println(s);

	}

}
