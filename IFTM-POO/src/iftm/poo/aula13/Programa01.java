package iftm.poo.aula13;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Programa01 extends Application{

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		AnchorPane pane = new AnchorPane(); //Cria Janela
		pane.setPrefSize(400, 300); //Medição da janela
		
		TextField txtLogin = new TextField();
		txtLogin.setPromptText("Digite aqui seu login");
		
		PasswordField txtSenha = new PasswordField();
		txtSenha.setPromptText("Digite aqui sua senha");
		
		Button btnEntrar = new Button("Entrar");
		Button btnSair = new Button("Sair");
		
		pane.getChildren().addAll(txtLogin, txtSenha, btnEntrar, btnSair); //Passar parametros todos juntos
		
		Scene cena = new Scene(pane); //Tudo que vai aparecer na janela
		primaryStage.setScene(cena); //Setar a cena
		primaryStage.show(); //Mostrar tudo
		primaryStage.setTitle("IFTM-POO Interface");
		
		txtLogin.setLayoutX((pane.getWidth() - txtLogin.getWidth())/2);
		txtLogin.setLayoutY(50);
		
		txtSenha.setLayoutX((pane.getWidth() - txtSenha.getWidth())/2);
		txtSenha.setLayoutY(100);
		
		btnEntrar.setLayoutX((pane.getWidth() - btnEntrar.getWidth())/2);
		btnEntrar.setLayoutY(150);
		
		btnSair.setLayoutX((pane.getWidth() - btnSair.getWidth())/2);
		btnSair.setLayoutY(200);
		
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, Red 0%, silver 100%);");
		
	}

}
