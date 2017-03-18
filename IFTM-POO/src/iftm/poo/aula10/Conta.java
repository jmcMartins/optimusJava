package iftm.poo.aula10;

import java.sql.SQLException;

public class Conta {
	private double saldo;

	
	public Conta(){
		
	}
	public Conta(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int depositar(double valor) throws IllegalArgumentException, SQLException{
		if(valor < 0){
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		}else{
			this.setSaldo(this.getSaldo()+valor);
			return 0; //sucesso
		}
	}
}
