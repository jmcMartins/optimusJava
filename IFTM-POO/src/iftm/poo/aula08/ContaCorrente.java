package iftm.poo.aula08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ContaCorrente extends Conta{
	private double limite;
	
	public ContaCorrente(){}
	
	public ContaCorrente(double saldo, double limite,int numero){
		super(numero,saldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public ContaCorrente(double limite){
		this.limite = limite;
	}

	public void imprimeExtratoDetalhado() {
		System.out.println("---Extrato detalhado de Conta Corrente---");
		System.out.println();
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formataDataTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		System.out.println("Data: "+agora.format(formataDataTime));
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Limite: "+this.getLimite());
		
	}
	public String mensagem(int i, String s) {
		String msg = "Conta Corrente..."+i+" "+s;
		return msg;
	}
}