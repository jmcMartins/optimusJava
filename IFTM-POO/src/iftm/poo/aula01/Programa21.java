package iftm.poo.aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Programa21 {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); // (formato ISO-8601 )
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje.format(formatador)); //(formato especificado
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatador2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(agora.format(formatador2)); // 08/02/16 10:02
	}

}
