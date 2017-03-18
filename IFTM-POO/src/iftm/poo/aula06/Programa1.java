package iftm.poo.aula06;

import java.time.LocalDate;

import iftm.poo.aula03.Cliente;
import iftm.poo.aula04.Funcionario;

public class Programa1 {

	public static void main(String[] args) {
		Cliente contratante = new Cliente(1,"Junior,","666.666.666-66");
		Funcionario responsavel = new Funcionario("Dead Poll",8000);
		LocalDate dataDeContratacao = LocalDate.of(2016, 04, 07);
		
		Emprestimo e = new Emprestimo(contratante,responsavel,dataDeContratacao,5000,10);
		e.setContratante(contratante);
		e.setResponsavel(responsavel);
		e.setDataDeContratacao(dataDeContratacao);
		
		Veiculo v = new Veiculo("Honda","Civic",49000);
		
		SeguroVeiculo sv = new SeguroVeiculo(contratante,responsavel,dataDeContratacao,v,2200,1300);
		
		sv.setContratante(contratante);
		sv.setResponsavel(responsavel);
		sv.setDataDeContratacao(dataDeContratacao);
		e.calculaTaxa();
		
		System.out.println("Emprestimo: "+e.calculaTaxa());
		System.out.println("Seguro Veiculo: "+sv.calculaTaxa());	
	}

}