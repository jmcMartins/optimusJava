package iftm.poo.prova2.ex02;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int op = 0;
		
		boolean condicao = true;
		while(condicao){
			try{
				System.out.println("--- Cadastrar contas ---");
				System.out.println("1 - Conta Poupança\n2 - Conta Especial\n3 - Sair");
				op = Integer.parseInt(teclado.nextLine());
			}catch(NumberFormatException e){
				System.out.println();
			}
			
			if(op == 1){
				try{
					System.out.println("Nome do Cliente: ");
					String nome = teclado.nextLine();
					System.out.println("Número da Conta: ");
					int numConta = Integer.parseInt(teclado.nextLine());
					System.out.println("Saldo: ");
					float saldo = Float.parseFloat(teclado.nextLine());
					System.out.println("Dia do Rendimento: ");
					int diaRendimento = Integer.parseInt(teclado.nextLine());
					ContaPoupanca cp = new ContaPoupanca(nome,numConta,saldo,diaRendimento);
					boolean verdade = true;
					while(verdade){
						try{
							System.out.println();
							System.out.println("Deseja: \n1 - Calcular novo saldo.\n2 - Ver dados\n3 - Sacar.\n4 - Depositar\n5 - Sair");
							int op2 = Integer.parseInt(teclado.nextLine());
							if(op2 == 1){
								
								System.out.println("Digite a taxa: ");
								float taxa = Float.parseFloat(teclado.nextLine());
								cp.calcularNovoSaldo(taxa);
							}else if(op2 == 2){
								
								System.out.println(cp);
							}else if(op2 == 3){
								
								System.out.println("Digite o valor para o saque: ");
								float saque = Float.parseFloat(teclado.nextLine());
								cp.sacar(saque);
							}else if(op2 == 4){
								
								System.out.println("Valor para deposito: ");
								float valor = Float.parseFloat(teclado.nextLine());
								cp.depositar(valor);
							}else if(op2 == 5){
								verdade = false;
							}else{
								System.out.println("Opcão invalida. ");
							}
						}catch(NumberFormatException e){
							System.out.println();
						}
					}
					
				}catch(NumberFormatException e){
					System.out.println("Você digitou algo erra, Tente novamente. ");
				}
				
			}else if(op == 2){
				
				try{
					System.out.println("Nome do Cliente: ");
					String nome = teclado.nextLine();
					System.out.println("Número da Conta: ");
					int numConta = Integer.parseInt(teclado.nextLine());
					System.out.println("Saldo: ");
					float saldo = Float.parseFloat(teclado.nextLine());
					System.out.println("Limite: ");
					float limite = Float.parseFloat(teclado.nextLine());
					ContaEspecial ce = new ContaEspecial(nome,numConta,saldo,limite);
					boolean verdade = true;
					while(verdade){
						try{
							System.out.println();
							System.out.println("Deseja: \n1 - Ver dados\n2 - Sacar.\n3 - Depositar\n4 - Sair");
							int op2 = Integer.parseInt(teclado.nextLine());
		
							if(op2 == 1){
								
								System.out.println(ce);
							}else if(op2 == 2){
								
								System.out.println("Digite o valor para o saque: ");
								float saque = Float.parseFloat(teclado.nextLine());
								ce.sacar(saque);
							}else if(op2 == 3){
								
								System.out.println("Valor para deposito: ");
								float valor = Float.parseFloat(teclado.nextLine());
								ce.depositar(valor);
							}else if(op2 == 4){
								verdade = false;
							}else{
								System.out.println("Opcão invalida. ");
							}
						}catch(NumberFormatException e){
							System.out.println();
						}
					}
					
				}catch(NumberFormatException e){
					System.out.println("Você digitou algo erra, Tente novamente. ");
				}
				
				
			}else if(op == 3){
				condicao = false;
			}else{
				System.out.println("Opção invalida. Tente Novamente.");
			}
			
			
			
			
		}
		teclado.close();
	}

}
