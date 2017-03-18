package iftm.poo.aula09;

import java.time.LocalDate;

public class Programa1 {

	public static void main(String[] args) {
		
		Seguranca seg = new Seguranca("Miguel", LocalDate.of(2016, 04, 27), 3000);
		
		Gerente ger = new Gerente("Chefe", LocalDate.of(2016, 04, 27), 6000);
		
		Cliente cli = new Cliente("Badeco", "11111111");
	}

}
