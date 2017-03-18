package iftm.poo.aula11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		FileOutputStream arquivo = new FileOutputStream("src/iftm/poo/aula11/saida.txt", true); //Coloca true ele so adc o conteudo, sem o true ele sobrescreve
		PrintStream variavel = new PrintStream(arquivo);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a "+(i+1)+"º Mensagem: ");
			String mensagem = teclado.nextLine();
			
			variavel.println(mensagem);
		}
		variavel.close();
		teclado.close();
	}

}
