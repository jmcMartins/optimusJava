package iftm.poo.lista1;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int continuar=1,escolha = 0;
		String[][] tabuleiro = new String[3][3];
		String play1 = new String();
		String play2 = new String();
		
		while(continuar != 0 ){
			System.out.println("---- BEM VINDO ----");
			System.out.println("Vamos começar. Você quer 1 - X ou 2 - O ?");
			escolha = teclado.nextInt();
			if(escolha == 1){
				play1 = "X";
				play2 = "O";
				continuar = 0;
			}else if(escolha == 2){
				play1 = "O";
				play2 = "X";
				continuar = 0;
			}else{
				System.out.println("Opção errada!");
				continuar = 1;
			}
		}
		
		System.out.println("Vamos começar. Essa são as opçõens disponiveis: ");
		System.out.println("0 1 2");
		System.out.println("3 4 5");
		System.out.println("6 7 8");
		System.out.println("----------");
		
		continuar = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro[i][j] = "-";
			}
		}
		while(continuar != 0){
			int continu = 1;
			int escolha1=0,escolha2=0;
			while(continu != 0){
			int tem = 1;
			while(tem != 0){
				System.out.println();
				
				int a=0;
				while(a == 0){
					System.out.println("\nJogador 1!\nEscolha uma das opção disponivel para jogar: ");
					escolha1 = teclado.nextInt();
					if(escolha1 < 0 || escolha1 > 8){
						System.out.println("\nOpção Incorreta!! Tente Novamente.");
						a = 0;
					}else
						a++;
				}
				switch(escolha1){
				
				case 0:
					if(tabuleiro[0][0] == play1 || tabuleiro[0][0] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[0][0] = play1;
					tem = 0;
					}
					break;
					
				case 1:
					if(tabuleiro[0][1] == play1 || tabuleiro[0][1] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[0][1] = play1;
					tem = 0;
					}
					break;
					
				case 2:
					if(tabuleiro[0][2] == play1 || tabuleiro[0][2] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[0][2] = play1;
					tem = 0;
					}
					break;
					
				case 3:
					if(tabuleiro[1][0] == play1 || tabuleiro[1][0] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[1][0] = play1;
					tem = 0;
					}
					break;
					
				case 4:
					if(tabuleiro[1][1] == play1 || tabuleiro[1][1] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[1][1] = play1;
					tem = 0;
					}
					break;
					
				case 5:
					if(tabuleiro[1][2] == play1 || tabuleiro[1][2] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[1][2] = play1;
					tem = 0;
					}
					break;
					
				case 6:
					if(tabuleiro[2][0] == play1 || tabuleiro[2][0] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[2][0] = play1;
					tem = 0;
					}
					break;
					
				case 7:
					if(tabuleiro[2][1] == play1 || tabuleiro[2][1] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[2][1] = play1;
					tem = 0;
					}
					break;
					
				case 8:
					if(tabuleiro[2][2] == play1 || tabuleiro[2][2] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[2][2] = play1;
					tem = 0;
					}
					break;
				}
				
				
				if(tabuleiro[0][0] == play1 && tabuleiro[0][1] == play1 && tabuleiro[0][2] == play1){
					System.out.println("O jogador 1 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[1][0] == play1 && tabuleiro[1][1] == play1 && tabuleiro[1][2] == play1){
					System.out.println("O jogador 1 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[2][0] == play1 && tabuleiro[2][1] == play1 && tabuleiro[2][2] == play1){
					System.out.println("O jogador 1 Ganhou!! Parabens!!");
					continu = 0;
				}
				
				if(tabuleiro[0][0] == play1 && tabuleiro[1][0] == play1 && tabuleiro[2][0] == play1){
					System.out.println("O jogador 1 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][1] == play1 && tabuleiro[1][1] == play1 && tabuleiro[2][1] == play1){
					System.out.println("O jogador 1 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][2] == play1 && tabuleiro[1][2] == play1 && tabuleiro[2][2] == play1){
					System.out.println("O jogador 1 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][0] == play1 && tabuleiro[1][1] == play1 && tabuleiro[2][2] == play1){
					System.out.println("O jogador 1 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][2] == play1 && tabuleiro[1][1] == play1 && tabuleiro[2][0] == play1){
					System.out.println("O jogador 1 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][0] != "-" && tabuleiro[0][1] != "-" && tabuleiro[0][2] != "-"&&tabuleiro[1][0]!="-"&&
						tabuleiro[1][1] != "-"&&tabuleiro[1][2]!="-"&&tabuleiro[2][0]!="-"&&tabuleiro[2][1]!="="&&
						tabuleiro[2][2]!="-"){
					System.out.println("\nDeu velha!! ");
					continu = 0;
				}
				for (int i = 0; i < tabuleiro.length; i++) {
					for (int j = 0; j < tabuleiro.length; j++) {
						System.out.print(tabuleiro[i][j]+" ");
					}
					System.out.println();
				}
			}
			if(continu != 0){
			tem = 1;
			while(tem != 0){
				System.out.println();
				
				int a=0;
				while(a == 0){
					System.out.println("\nJogador 2!\nEscolha uma das opção disponivel para jogar: ");
					escolha2 = teclado.nextInt();
					if(escolha2 < 0 || escolha2 > 8){
						System.out.println("Opção Incorreta!! Tente Novamente.");
						a = 0;
					}else
						a++;
				}
				switch(escolha2){
				
				case 0:
					if(tabuleiro[0][0] == play1 || tabuleiro[0][0] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[0][0] = play2;
					tem = 0;
					}
					break;
					
				case 1:
					if(tabuleiro[0][1] == play1 || tabuleiro[0][1] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[0][1] = play2;
					tem = 0;
					}
					break;
					
				case 2:
					if(tabuleiro[0][2] == play1 || tabuleiro[0][2] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[0][2] = play2;
					tem = 0;
					}
					break;
					
				case 3:
					if(tabuleiro[1][0] == play1 || tabuleiro[1][0] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[1][0] = play2;
					tem = 0;
					}
					break;
					
				case 4:
					if(tabuleiro[1][1] == play1 || tabuleiro[1][1] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[1][1] = play2;
					tem = 0;
					}
					break;
					
				case 5:
					if(tabuleiro[1][2] == play1 || tabuleiro[1][2] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[1][2] = play2;
					tem = 0;
					}
					break;
					
				case 6:
					if(tabuleiro[2][0] == play1 || tabuleiro[2][0] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[2][0] = play2;
					tem = 0;
					}
					break;
					
				case 7:
					if(tabuleiro[2][1] == play1 || tabuleiro[2][1] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[2][1] = play2;
					tem = 0;
					}
					break;
					
				case 8:
					if(tabuleiro[2][2] == play1 || tabuleiro[2][2] == play2){
						System.out.println("Essa posição já está preenchida! ");
						tem = 1;
					}else{
					tabuleiro[2][2] = play2;
					tem = 0;
					}
					break;
					
				}
				
				
				if(tabuleiro[0][0] == play2 && tabuleiro[0][1] == play2 && tabuleiro[0][2] == play2){
					System.out.println("O jogador 2 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[1][0] == play2 && tabuleiro[1][1] == play2 && tabuleiro[1][2] == play2){
					System.out.println("O jogador 2 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[2][0] == play2 && tabuleiro[2][1] == play2 && tabuleiro[2][2] == play2){
					System.out.println("O jogador 2 Ganhou!! Parabens!!");
					continu = 0;
				}
				
				if(tabuleiro[0][0] == play2 && tabuleiro[1][0] == play2 && tabuleiro[2][0] == play2){
					System.out.println("O jogador 2 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][1] == play2 && tabuleiro[1][1] == play2 && tabuleiro[2][1] == play2){
					System.out.println("O jogador 2 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][2] == play2 && tabuleiro[1][2] == play2 && tabuleiro[2][2] == play2){
					System.out.println("O jogador 2 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][0] == play2 && tabuleiro[1][1] == play2 && tabuleiro[2][2] == play2){
					System.out.println("O jogador 2 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][2] == play2 && tabuleiro[1][1] == play2 && tabuleiro[2][0] == play2){
					System.out.println("O jogador 2 Ganhou!! Parabens!!");
					continu = 0;
				}
				if(tabuleiro[0][0] != "-" && tabuleiro[0][1] != "-" && tabuleiro[0][2] != "-"&&tabuleiro[1][0]!="-"&&
						tabuleiro[1][1] != "-"&&tabuleiro[1][2]!="-"&&tabuleiro[2][0]!="-"&&tabuleiro[2][1]!="="&&
						tabuleiro[2][2]!="-"){
					System.out.println("\nDeu velha!! ");
					continu = 0;
				}
				for (int i = 0; i < tabuleiro.length; i++) {
					for (int j = 0; j < tabuleiro.length; j++) {
						System.out.print(tabuleiro[i][j]+" ");
					}
					System.out.println(" ");
				}
			}
			}
		}
		continuar = 0;
	  }
	teclado.close();
	}
}
