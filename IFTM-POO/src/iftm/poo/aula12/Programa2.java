package iftm.poo.aula12;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Programa2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(300, 200);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		
		JLabel rotulo = new JLabel("Nome: ");
		JTextField entrada = new JTextField(40);
		
		panel.add(rotulo);
		panel.add(entrada);
		
		frame.setContentPane(panel);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
