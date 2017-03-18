package iftm.poo.aula01;

public class Programa03 {

	public static void main(String[] args) {
		boolean ativo = true;
		double tx1 = 10.0;
		double tx2 = 20.0;
		double saldo = 5000.00;
		
		/*O if(ativo) é igual a if(ativo == true)*/
		
		
		if(ativo){
			saldo = saldo + ((saldo * tx2) / 100);
		}else{
			saldo = saldo + ((saldo * tx1) / 100);
		}
		System.out.println("O saldo atual é: R$ " + saldo +"\n");
		
		int contador = 1;
		while(contador <= 10){
			System.out.println("Imprindo pela " + contador + "° vez.");
			contador++;
		}
		
		System.out.println();
		
		for(int i = 0; i < 20; i++){
			System.out.println("Dentro do for na volta " + i);
			if(i == 5)
				break;
		}
		System.out.println("\nSaiu...do for");
	}

}
