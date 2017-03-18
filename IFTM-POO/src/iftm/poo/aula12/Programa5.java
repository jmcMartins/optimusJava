package iftm.poo.aula12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa5 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JButton btnSim = new JButton("Sim");
		JButton btnNao = new JButton("Não");
		JButton btnCancelar = new JButton("Cancelar");
		
		panel.add(btnSim);
		panel.add(btnNao);
		panel.add(btnCancelar);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
