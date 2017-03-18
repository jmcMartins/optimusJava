package iftm.poo.aula08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ContaPoupanca extends Conta{
	private int diaAniversarioConta;
	
	public ContaPoupanca(){}
	
	public ContaPoupanca(int diaAniversarioConta){
		this.diaAniversarioConta = diaAniversarioConta;
	}
	
	
	public int getDiaAniversarioConta() {
		return diaAniversarioConta;
	}

	public void setDiaAniversarioConta(int diaAniversarioConta) {
		this.diaAniversarioConta = diaAniversarioConta;
	}

	public void imprimeExtratoDetalhado() {
		System.out.println("---Extrato detalhado de Conta Poupança---");
		System.out.println();
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formataDataTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		System.out.println("Data: "+agora.format(formataDataTime));
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Aniversario Conta: "+this.getDiaAniversarioConta());	
	}
	public String mensagem(int i, String s) {
		String msg = "Conta Poupança..."+i+" "+s;
		return msg;
	}
}