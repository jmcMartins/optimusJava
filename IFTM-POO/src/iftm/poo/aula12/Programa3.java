package iftm.poo.aula12;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Programa3 {

		public static void main(String[] args) {
			JFrame frame = new JFrame("IFTM - POO");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel panel = new JPanel();
			
			JLabel rotulo = new JLabel("Texto: ");
			JTextArea texto = new JTextArea(10, 20);
			
			panel.add(rotulo);
			panel.add(texto);
			
			frame.setContentPane(panel);
			
			frame.pack();
			frame.setVisible(true);
			
		}
}
