package iftm.poo.lista2;

import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean verdade = true;
		boolean condicao = true;
		ControleRemoto cr = new ControleRemoto();
		System.out.println("(0) Sair       Escolher Canal (1)");
		System.out.println("        (2) Volume +             ");
		System.out.println("(5) Canal -         (4) Canal +  ");
		System.out.println("        (3) Volume -             \n");
		System.out.println("(6) Mostrar volume\n"
				+          "(7) Mostrar Canal ");
		System.out.println("---------------------------------");
		System.out.println("O que deseja fazer?");
		while(verdade){	
		System.out.print(": ");
		int com = teclado.nextInt();
		
			switch(com){

			case 0:
				verdade = false;
				break;
			case 1:
				System.out.print("Digite o canal: ");
				int escolher = teclado.nextInt();
				cr.pularCanal(escolher);
				break;
			case 2:
				cr.aumentarVolume(com);
				break;
			case 3:
				cr.diminuirVolume(com);
				break;
			case 4:
				cr.subirCanal(com);
				break;

			case 5:
				cr.descerCanal(com);
				break;
			case 6:
				cr.t.consultarVolume();
				break;
			case 7:
				cr.t.consultarCanal();
				break;
			default:
				System.out.println("Tecla invalida. Tente novamente.");
				break;
			}
			
		}

		teclado.close();
	}
}