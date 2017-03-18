package iftm.poo.aula10;

import java.sql.SQLException;

public class Programa1 {

	public static void main(String[] args) {
		Conta c = new Conta(34000);
		
		try{
			c.depositar(-1);
		}catch(IllegalArgumentException e){
			System.out.println("Houve um erro ao depositar.");
		}catch(SQLException e){
			System.out.println("Ocorreu um erro no Banco de Dados.");
		}
		

	}

}
