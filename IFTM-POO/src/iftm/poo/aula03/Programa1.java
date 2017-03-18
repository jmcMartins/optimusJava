package iftm.poo.aula03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Programa1 {

	public static void main(String[] args) {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Diemesleno");
		
		CartaoDeCredito cdc = new CartaoDeCredito();
		cdc.setNumero(666);
		cdc.setDataDeValidade(LocalDate.of(2020, 03, 10));
		cdc.setCliente(cliente1);
		
		System.out.println(cdc.getCliente().getNome());
		System.out.println("Numero do cartao: " + cdc.getNumero());
		System.out.println("Data de Validade: " + cdc.getDataDeValidade().format(formatador));
		
	}

}