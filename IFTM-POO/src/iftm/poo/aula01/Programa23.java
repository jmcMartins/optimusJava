package iftm.poo.aula01;

public class Programa23 {
	
	public static void main(String[] args){
		String produto = "PlayStation 4";
		int quantidade = 1;
		float preco = 1.475f;
		
		System.out.format("%d unidade de %s custa R$ %.3f", quantidade, produto, preco);
	}
}