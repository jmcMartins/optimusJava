package iftm.poo.aula12;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa7 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		String[] estados = new String[3];
		estados[0] = "Minas Gerais";
		estados[1] = "Acre";
		estados[2] = "São Paulo";
		
		JComboBox cbbEstados = new JComboBox(estados);
		
		panel.add(cbbEstados);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
