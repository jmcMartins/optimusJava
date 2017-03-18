package iftm.poo.aula02;

import java.util.Scanner;

public class ProgramaDaLampada {

	public static void main(String[] args) {
		Lampada lamp1 = new Lampada();
		boolean sair = true;

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marca: ");
		String marca = teclado.nextLine();
		System.out.println("Digte a cor: ");
		String cor = teclado.nextLine();
		System.out.println("Digite a voltagem: ");
		int voltagem = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite a frequencia: ");
		int frequencia = Integer.parseInt(teclado.nextLine());	
		lamp1.setMarca(marca);
		lamp1.setCor(cor);
		lamp1.setVoltagem(voltagem);
		lamp1.setFrequencia(frequencia);
		
		lamp1.imprimeInfos();
		
		while(sair){
			System.out.println("0 - Sair \n1-Acende luz \n2 - Apaga luz");
			
		}
		
		teclado.close();
	}

}
