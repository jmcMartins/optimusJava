package iftm.poo.aula03;

public class ProgramaBanco01 {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria");
		cliente1.setCpf("012.345.678.96");
		
		Cliente cliente2 = new Cliente();
		cliente1.setNome("Júnior");
		cliente1.setCpf("666.666.666.66");
		
		Conta conta1 = new Conta();
		conta1.setNumero(1);
		conta1.setSaldo(8000.00);
		conta1.setLimite(1000.00);
		conta1.setCliente(cliente1);
		
		Conta conta2 = new Conta();
		conta2.setNumero(2);
		conta2.setSaldo(15000.00);
		conta2.setLimite(5000.00);
		conta2.setCliente(cliente2);
		
		Agencia agencia1 = new Agencia();
		agencia1.setNome("IFTM");
		agencia1.setNumero(11);
		agencia1.addConta(conta1);
		
		Agencia agencia2 = new Agencia();
		agencia2.setNome("IFG");
		agencia2.setNumero(66);
		agencia2.addConta(conta2);
		
		Banco banco1 = new Banco();
		banco1.setNome("Caixa");
		banco1.addAgencia(agencia1);
		
		Banco banco2 = new Banco();
		banco2.setNome("Banco do Brasil");
		banco2.addAgencia(agencia2);
		
		System.out.println("---Dados Bancários Cliente 1---");
		System.out.println("Banco:" + banco1.getNome());
		System.out.println("Cliente:" + banco1.getAgencias().get(0).getContas().get(0).getCliente().getNome());
		System.out.println("Agência:" + banco1.getAgencias().get(0).getNome());
		System.out.println("Número da Conta:" + banco1.getAgencias().get(0).getContas().get(0).getNumero());
		System.out.println("Saldo:" + banco1.getAgencias().get(0).getContas().get(0).getSaldo());
		System.out.println("Limite:" + banco1.getAgencias().get(0).getContas().get(0).getLimite());
		
		System.out.println("---Dados Bancários Cliente 2---");
		System.out.println("Banco:" + banco2.getNome());
		System.out.println("Cliente:" + banco2.getAgencias().get(0).getContas().get(0).getCliente().getNome());
		System.out.println("Agência:" + banco2.getAgencias().get(0).getNome());
		System.out.println("Número da Conta:" + banco2.getAgencias().get(0).getContas().get(0).getNumero());
		System.out.println("Saldo:" + banco2.getAgencias().get(0).getContas().get(0).getSaldo());
		System.out.println("Limite:" + banco2.getAgencias().get(0).getContas().get(0).getLimite());
		
		banco1.getAgencias().get(0).getContas().get(0).depositar(2000.00);
		
		banco1.getAgencias().get(0).getContas().get(0).sacar(50000.00);
		
		System.out.println("Seu saldo éh:" + banco1.getAgencias().get(0).getContas().get(0).getSaldo());
		
		banco1.getAgencias().get(0).getContas().get(0).sacar(500.00);
		
		System.out.println("Seu saldo éh:" + banco1.getAgencias().get(0).getContas().get(0).getSaldo());
		
		System.out.println("----Extrato da Conta 1 ----");
		banco1.getAgencias().get(0).getContas().get(0).gerarExtrato(1, "Júnior");
		banco1.getAgencias().get(0).getContas().get(0).gerarExtrato(1);
		
		System.out.println("----Extrato da Conta 2 ----");
		banco1.getAgencias().get(0).getContas().get(0).gerarExtrato(2, "Júnior");
		banco1.getAgencias().get(0).getContas().get(0).gerarExtrato(2);
		
		System.out.println("----Transferencia----");
		banco1.getAgencias().get(0).getContas().get(0).efetuarTransferencia(conta2, 5000);
		System.out.println("----Salda da conta 1----");
		System.out.println("Seu saldo éh:" + banco1.getAgencias().get(0).getContas().get(0).getSaldo());
		System.out.println("----Saldo da conta 2----");
		System.out.println("Seu saldo éh:" + banco2.getAgencias().get(0).getContas().get(0).getSaldo());
	}

}
