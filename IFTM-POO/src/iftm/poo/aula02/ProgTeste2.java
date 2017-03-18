package iftm.poo.aula02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgTeste2 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		String nome = "Margarido";
		String rg = "1821820";
		int cpf = 12345;
		LocalDate nascimento = LocalDate.of(1989, 06, 15);
		
		p1.preencherInfos(nome, rg, cpf, nascimento);
		p1.imprimeInfos();
		
		Pessoa p2 = new Pessoa();
		
		nome = "De@d Pool";
		rg = "23523432";
		cpf = 18218;
		nascimento = LocalDate.of(1979, 03, 29);
		
		p2.preencherInfos(nome, rg, cpf, nascimento);
		
		p2.imprimeInfos();
		

	}

}

/*		this.setMarca(marca);
		this.setCor(cor);
		this.setVoltagem(voltagem);
		this.setFrequencia(frequencia);   */