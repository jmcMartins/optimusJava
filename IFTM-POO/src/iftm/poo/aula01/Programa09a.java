package iftm.poo.aula01;

public class Programa09a {
	
	public static void imprimeMensagens(String ... mensagens){
		String msg ="";
		for (int i = 0; i < mensagens.length; i++){
			msg += " " + mensagens[i];
		}
		System.out.println("Mensagem = " + msg);
	}

	public static void main(String[] args){
		String nome = "Margarido";
		
		imprimeMensagens();
		imprimeMensagens("Um", "Dois");
		imprimeMensagens("A", "B", "C");
		imprimeMensagens("99", "BBC", "IFTM", "ADS");
		imprimeMensagens("Olá " + nome + " tudo bem?");
	}

}
