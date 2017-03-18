package iftm.poo.aula02;

import java.util.Scanner;

public class ProgramaDaLampadaDiemesleno {

	public static void main(String[] args) {
		LampadaDiemesleno lamp1 = new LampadaDiemesleno();
		Scanner teclado = new Scanner(System.in);
		
		lamp1.setCor("Branca");
		lamp1.setMarca("Philips");
		lamp1.setFrequencia(60);
		lamp1.setVoltagem(110);
		
		System.out.println("Marca: " + lamp1.getMarca());
		System.out.println("Cor: " + lamp1.getCor());
		System.out.println("Frequência: " + lamp1.getFrequencia());
		System.out.println("Voltagem: " + lamp1.getVoltagem());
		
		if(lamp1.isStatus())
			System.out.println("A lâmpada está acesa.");
		else
			System.out.println("A lâmpada está apagada");
		
		lamp1.acende(true);
		
		if(lamp1.isStatus())
			System.out.println("A lâmpada está acesa.");
		else
			System.out.println("A lâmpada está apagada");
		
		int opcao = 3;
		System.out.println("Digite 1 para acender ou para apagar e 0 para sair");
		while(opcao != 0){
			opcao = teclado.nextInt();
			
			if(opcao == 1){
				if(lamp1.isStatus() != true)
					lamp1.acende(true);			
				else
					lamp1.acende(false);
			}else
				System.out.println("Opção Inválida");
			
		}
		
		
		
		
		teclado.close();
	}

}
