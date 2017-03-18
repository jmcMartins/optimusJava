package iftm.poo.aula06;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Gerente gerente = new Gerente("usuario1","senha1");
		gerente.setNome("Júnior");
		gerente.setSalario(50000);
		gerente.setUsuario("IFTM");
		gerente.setSenha("Violeta");
		
		Telefonista telefonista1 = new Telefonista();
		Telefonista telefonista2 = new Telefonista();
		telefonista1.setEstacaoDeTrabalho(66);
		telefonista1.setNome("Donzela");
		telefonista1.setSalario(3000);
		telefonista2.setEstacaoDeTrabalho(69);
		telefonista2.setNome("Donzelita");
		telefonista2.setSalario(2000);
		
		Secretaria secretaria1 = new Secretaria();
		Secretaria secretaria2 = new Secretaria();
		secretaria1.setNome("Delva");
		secretaria1.setSalario(4500);
		secretaria1.setRamal(99);
		secretaria2.setNome("Flavia");
		secretaria2.setSalario(5500);
		secretaria2.setRamal(33);
		
		
		
		teclado.close();
	}

}
