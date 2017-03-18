package iftm.poo.aula05;

public class Programa01 {

	public static void main(String[] args) {
		
		Ventilador v = new Ventilador();
		
		v.setMarca("Wallita");
		v.setModelo("VW8899");
		
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
	}

}
