package iftm.poo.aula05;

import java.text.NumberFormat;

public class Programa02 {

	public static void main(String[] args) {
		NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
		
		Conta c = new Conta(2500);
		System.out.println("Saldo Inicial: " + formatoMoeda.format(c.getSaldo()));
		
		c.depositar(7000);
		System.out.println("Saldo para deposito: " + formatoMoeda.format(c.getSaldo()));
		
		c.sacar(500);
		System.out.println("Saldo para saque: " + formatoMoeda.format(c.getSaldo()));
		
		c.descontarTarifa(35);
		System.out.println("Saldo Após Ataque/Falha: " + formatoMoeda.format(c.getSaldo()));
	}

}