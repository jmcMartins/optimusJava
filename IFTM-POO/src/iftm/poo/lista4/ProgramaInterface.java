package iftm.poo.lista4;

public class ProgramaInterface {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(3.2);
		Quadrado q = new Quadrado(5);
		
		System.out.println("\n--- DADOS CIRCULO ---");
		c.calculaArea();
		c.calculaComprimento();
		System.out.println(c);
		
		System.out.println("\n--- DADOS QUADRADO ---");
		q.calcularArea();
		q.calcularComprimento();
		System.out.println(q);
		
	}
}
