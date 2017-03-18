package iftm.poo.javafx.service;

import java.util.List;
import iftm.poo.javafx.model.Conta;

public interface ContasService {

	//Create
	public void salvar(Conta conta);
	
	//Retrieve
	public List<Conta> buscarTodas();
	
	public Conta buscaPorId(int id);
	
	//Delete
	public void apagar(int id);
	
	//Update
	public void atualzar(Conta conta);
	
	public static ContasService getNewInstance(){
		return new ContasDBService();
	}
	
}
