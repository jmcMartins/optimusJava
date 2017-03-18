package iftm.poo.aula07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class GeradorDeExtrato {
	
	public static void imprimirExtrato(Conta c){
		DateTimeFormatter formatoDataTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		LocalDateTime dataAtual = LocalDateTime.now();
		System.out.println("Data: "+dataAtual.format(formatoDataTime));
		System.out.println("Saldo: "+c.getSaldo());
	}
}
