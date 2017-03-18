package iftm.poo.aula07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ControleDePonto {
	DateTimeFormatter formatoDataTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	
	public void registrarEntrada(Funcionario f){
		LocalDateTime entrada = LocalDateTime.now();
		
		//System.out.println("Entrada: "+f.getCodigo());
		System.out.println("Data: "+entrada.format(formatoDataTime));
	}

	public void registrarSaida(Funcionario f){
		LocalDateTime saida = LocalDateTime.now();
		//System.out.println("Saida: "+f.getCodigo());
		System.out.println("Data: "+saida.format(formatoDataTime));
	}


}
