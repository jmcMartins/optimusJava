package iftm.poo.javafx.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import iftm.poo.javafx.model.Conta;

public class ContasDBService implements ContasService{
	
	//Dados para acesso ao banco. atualize de acordo com o seu banco de dados
	final String USUARIO = "aluno";
	final String SENHA = "alunoiftm";
	final String URL_BANCO = "jdbc:mysql://localhost:3306/financeiro";
	
	// Constantes de acesso
	final String CLASSE_DRIVER = "com.mysql.jdbc.Driver";
	
	final String INSERIR = "INSERT INTO contas(concessionaria, descricao, valor, data_vencimento) VALUES(?, ?, ?, ?)";
	final String ATUALIZAR = "UPDATE contas SET concessionaria=?, descricao=?, valor=?, data_vencimento=? WHERE id = ?";
	final String BUSCAR = "SELECT id, concessionaria, descricao, valor, data_vencimento FROM contas WHERE ID = ?";
	final String BUSCAR_TODOS = "SELECT id, concessionaria, descricao, valor, data_vencimento FROM contas";
	
	final String APAGAR = "DELETE FROM contas WHERE id = ?";

	@Override
	public void salvar(Conta conta) {
		try{
			Connection con = conexao();
			PreparedStatement salvar = con.prepareStatement(INSERIR);
			salvar.setString(1, conta.getConcessionaria());
			salvar.setString(2, conta.getDescricao());
			salvar.setDouble(3, conta.getValor());
			salvar.setDate(4, java.sql.Date.valueOf(conta.getDataVencimento()));
			salvar.executeUpdate();
			salvar.close();
			
		}catch (Exception e){
			e.printStackTrace();
			System.err.println("ERRO SALVANDO CONTA");
			System.exit(0);
		}
	}

	@Override
	public List<Conta> buscarTodas() {
		List<Conta> contas = new ArrayList<>();
		try{
			Connection con = conexao();
			PreparedStatement buscarTodos = con.prepareStatement(BUSCAR_TODOS);
			ResultSet resultadoBusca = buscarTodos.executeQuery();
			while (resultadoBusca.next()){
				Conta conta = extraiConta(resultadoBusca);
				contas.add(conta);
			}
			buscarTodos.close();
			con.close();
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("ERROR BUSCANDO TODAS AS CONTAS");
			System.exit(0);
		}
		
		return contas;
	}

	@Override
	public Conta buscaPorId(int id) {
		Conta conta = null;
		try{
			Connection con = conexao();
			PreparedStatement buscar = con.prepareStatement(BUSCAR);
			buscar.setInt(1, id);
			ResultSet resultadoBusca = buscar.executeQuery();
			resultadoBusca.next();
			conta = extraiConta(resultadoBusca);
			buscar.close();
			con.close();
			
		}catch (Exception e){
			e.printStackTrace();
			System.err.println("ERROR BUSCANDO CONTA COM ID " + id);
			System.exit(0);
		}
		return conta;
	}

	@Override
	public void apagar(int id) {
		try{
			Connection con = conexao();
			PreparedStatement apagar = con.prepareStatement(APAGAR);
			apagar.setInt(1, id);
			apagar.executeUpdate();
			apagar.close();
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("ERROR APAGANDO CONTA COM ID " + id);
			System.exit(0);
		}
		
		
	}

	@Override
	public void atualzar(Conta conta) {
		try{
			Connection con = conexao();
			PreparedStatement atualizar = con.prepareStatement(ATUALIZAR);
			atualizar.setString(1, conta.getConcessionaria());
			atualizar.setString(2, conta.getDescricao());
			atualizar.setDouble(3, conta.getValor());
			atualizar.setDate(4, java.sql.Date.valueOf(conta.getDataVencimento()));
			atualizar.setInt(5, conta.getId());
			atualizar.executeUpdate();
			atualizar.close();
			con.close();
		}catch ( Exception e){
			e.printStackTrace();
			System.err.println("ERROR ATUALIZADNO CONTA COM ID " + conta.getId());
			System.exit(0);
		}
	}
	
	private Connection conexao(){
		try{
			Class.forName(CLASSE_DRIVER);
			return DriverManager.getConnection(URL_BANCO,USUARIO,SENHA);
		}catch(Exception e){
			e.printStackTrace();
			if(e instanceof ClassNotFoundException){
				System.err.println("Verifique o driver de conexão.");
			}else{
				System.err.println("Verifique se o DB está rodando.");
			}
			System.exit(0);
			return null;
		}
	}
	
	private Conta extraiConta(ResultSet resultadoBusca) throws SQLException, ParseException {
		Conta conta = new Conta();
		conta.setId(resultadoBusca.getInt(1));
		conta.setConcessionaria(resultadoBusca.getString(2));
		conta.setDescricao(resultadoBusca.getString(3));
		conta.setValor(resultadoBusca.getDouble(4));
		Date dataVencimento = resultadoBusca.getDate(5);
		conta.setDataVencimento(toLocalDate(dataVencimento));
		
		return conta;
	}
	
	public static LocalDate toLocalDate(Date d){
		Instant instant = Instant.ofEpochMilli(d.getTime());
		LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
		return localDate;
	}
	
	
	
}
