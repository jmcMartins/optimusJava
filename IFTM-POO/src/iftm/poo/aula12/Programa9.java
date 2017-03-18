package iftm.poo.aula12;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa9 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JButton btnNorte = new JButton("Norte");
		JButton btnOeste = new JButton("Oeste");
		JButton btnCentro = new JButton("Centro");
		JButton btnLeste = new JButton("Leste");
		JButton btnSul = new JButton("Sul");
		
		panel.setLayout(new BorderLayout(1,0));
		
		panel.add(btnNorte, BorderLayout.NORTH);
		panel.add(btnOeste, BorderLayout.WEST);
		panel.add(btnCentro, BorderLayout.CENTER);
		panel.add(btnLeste, BorderLayout.EAST);
		panel.add(btnSul, BorderLayout.SOUTH);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
