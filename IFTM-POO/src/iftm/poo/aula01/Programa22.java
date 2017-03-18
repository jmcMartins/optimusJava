package iftm.poo.aula01;

public class Programa22 {

	public static void main(String[] args) {
		String a = new String("IFTM");
		String b = new String("IFTM");
		
		System.out.println(a.equals(b)); //exibe: true
		System.out.println(a == b); // exibe: false
		
		String c = "IFTM";
		String d = "IFTM";
		
		System.out.println(c.equals(d));  //exibe: true
		System.out.println(c == d); // exibe: true

	}

}
