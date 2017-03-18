package iftm.poo.javafx.controller;

import java.net.URL;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

import iftm.poo.javafx.model.Conta;
import iftm.poo.javafx.service.ContasService;
import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ContasController implements Initializable{

	@FXML
	private TableView<Conta> tblContas;
	@FXML
	private TableColumn<Conta, String> clConsc;
	@FXML
	private TableColumn<Conta, String> clDesc;
	@FXML
	private TableColumn<Conta, Double> clValor;
	@FXML
	private TableColumn<Conta, LocalDate> clVenc;
	@FXML
	private TextField txtConsc;
	@FXML
	private TextField txtDesc;
	@FXML
	private TextField txtValor;
	@FXML
	private DatePicker dpVencimento;
	@FXML
	private Button btnSalvar;
	@FXML
	private Button btnAtualizar;
	@FXML
	private Button btnApagar;
	@FXML
	private Button btnLimpar;
	
	private ContasService service;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		service = ContasService.getNewInstance();
		configuraColunas();
		configuraBindings();
		atualizaDadosTabela();
		
	}
	
	DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
	NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
	
	
	public void salvar(){
		Conta c = new Conta();
		pegaValores(c);
		service.salvar(c);
		atualizaDadosTabela();
	}
	
	public void atualizar(){
		Conta c = tblContas.getSelectionModel().getSelectedItem();
		pegaValores(c);
		service.atualzar(c);
		atualizaDadosTabela();
	}
	
	public void apagar(){
		Conta c = tblContas.getSelectionModel().getSelectedItem();
		service.apagar(c.getId());
		atualizaDadosTabela();
	}
	
	public void limpar(){
		tblContas.getSelectionModel().select(null);
		txtConsc.setText("");
		txtDesc.setText("");
		txtValor.setText("");
		dpVencimento.setValue(null);
		
	}
	
	public void pegaValores(Conta c){
		c.setConcessionaria(txtConsc.getText());
		c.setDescricao(txtDesc.getText());
		c.setValor(Double.parseDouble( txtValor.getText().replace(",", ".") ) );
		LocalDate df = datePickerToLocalDate(dpVencimento);
		c.setDataVencimento(df);
		
	}
	
	public LocalDate datePickerToLocalDate(DatePicker datePicker){

		
		if(datePicker.getValue() == null){
			return null;
		}
		LocalDate id = datePicker.getValue();
		Instant instant = id.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		Date date  = Date.from(instant);
		
		instant = Instant.ofEpochMilli(date.getTime());
		LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
		return localDate;
		
	}
	
	public void atualizaDadosTabela(){
		tblContas.getItems().setAll(service.buscarTodas());
		limpar();
	}

	public void configuraColunas(){
		clConsc.setCellValueFactory(new PropertyValueFactory<>("concessionaria"));
		clDesc.setCellValueFactory(new PropertyValueFactory<>("descricao"));
		clValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
		clVenc.setCellValueFactory(new PropertyValueFactory<>("dataVencimento"));
		
		
		//Customiza a formatação da celula da tabela em formato da data
		clVenc.setCellFactory(column -> {
			return new TableCell<Conta, LocalDate>() {
				protected void updateItem(LocalDate item, boolean empty) {
					super.updateItem(item, empty);
					
					if (item == null || empty) {
						setText(null);
						setStyle("");
					}else{
						setText(formatador.format(item));
					}
				}
			};
		});
		//Customiza a formatação da celula da tabela em formato da moeda
		clValor.setCellFactory(column -> {
			return new TableCell<Conta, Double>() {
				protected void updateItem(Double item, boolean empty) {
					super.updateItem(item, empty);
					
					if (item == null || empty) {
						setText(null);
						setStyle("");
					}else{
						setText(formatoMoeda.format(item));
					}
				}
			};
		});
		
	}
		
	private void configuraBindings(){
			// esse binding só e falso quando os campos da tela estão preenchidos
			BooleanBinding camposPreenchidos = txtConsc.textProperty().isEmpty().
					or(txtDesc.textProperty().isEmpty()).
					or(txtValor.textProperty().isEmpty()).
					or(dpVencimento.valueProperty().isNull());	
			
			BooleanBinding algoSelecionado = tblContas.getSelectionModel().selectedItemProperty().isNull();
		
			//Alguns botoes so sao habilitados se algo dfoi celecionado na table
			btnApagar.disableProperty().bind(algoSelecionado);
			btnAtualizar.disableProperty().bind(algoSelecionado);
			btnLimpar.disableProperty().bind(algoSelecionado);
			// o botao salvar so e habilitado se as informacoes foram preenchidas
			//e nao tem nada na tela
			btnSalvar.disableProperty().bind(algoSelecionado.not().or(camposPreenchidos));
			
			tblContas.getSelectionModel().selectedItemProperty().addListener((b, o, n) ->{
				if (n != null){
					LocalDate data = null;
					data = n.getDataVencimento();
					txtConsc.setText(n.getConcessionaria());
					txtDesc.setText(n.getDescricao());
					txtValor.setText( String.valueOf(n.getValor()).replace(",", ".") );
					dpVencimento.setValue(data);
					
				}
			});
			
	}
	
	
	
	
	
	
	
	
	
}
