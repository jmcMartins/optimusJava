package iftm.poo.lista2;

public class Programa2 {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.removePessoa("Abadia");
		int ret = agenda.buscaPessoa("Júnior Martins");
		if ( ret >= 0){
			System.out.println("Pessoa Encontrada. Posição: "+ret);
		}else{
			System.out.println("Pessoa não encontrada.");
		}
		agenda.imprimePessoa(666);
		agenda.imprimeAgenda();
		
		agenda.armazenaPessoa("Dead Poll", 34, 1.68f);
		agenda.armazenaPessoa("Jr Martins", 18, 1.78f);
		agenda.armazenaPessoa("Lulu", 50, 1.50f);
		
		agenda.imprimeAgenda();
		
		agenda.imprimePessoa(1);

		ret = agenda.buscaPessoa("Jr Martins");
		if ( ret >= 0){
			System.out.println("Pessoa Encontrada. Posição: "+ret);
		}else{
			System.out.println("Pessoa não encontrada.");
		}
		
		agenda.removePessoa("Lulu");
	
		
	}

}
