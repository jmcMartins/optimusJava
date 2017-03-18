package iftm.poo.aula11;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream arquivo = new FileInputStream("src/iftm/poo/aula11/saida.txt");
		Scanner leitor = new Scanner(arquivo);
		
		while(leitor.hasNextLine()){
			String linha = leitor.nextLine();
			System.out.println(linha);
		}
		leitor.close();
	}

}
