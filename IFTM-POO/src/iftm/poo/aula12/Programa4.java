package iftm.poo.aula12;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Programa4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JLabel lblUsuario = new JLabel("Usúario: ");
		JTextField txtUsuario = new JTextField(20);
		
		JLabel lblSenha = new JLabel("Senha: ");
		JPasswordField txtSenha = new JPasswordField(20);
		
		panel.add(lblUsuario);
		panel.add(txtUsuario);
		panel.add(lblSenha);
		panel.add(txtSenha);
		
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
