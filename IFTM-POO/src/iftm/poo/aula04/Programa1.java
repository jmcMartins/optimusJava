package iftm.poo.aula04;

public class Programa1 {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Gurita", 5000.00); /*Quem for declarado primeiro o contador comeÁa nele */
		Funcionario f2 = new Funcionario("Junim", 3000.00);
		
		Funcionario.reajustarValeRefeicao(0.35);
		
		System.out.println("1∫ Funcionario:");
		System.out.println("ID: " + f1.getId());
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Vale Refeicao: " + f1.getValeRefeicao());
		
		System.out.println("");
		
		System.out.println("2∫ Funcion√°rio:");
		System.out.println("ID: " + f2.getId());
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Sal√°rio: " + f2.getSalario());
		System.out.println("Vale Refei√ß√£o: " + f2.getValeRefeicao());
	}

}
