package iftm.poo.aula12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Programa14 implements ActionListener{


	private static JButton btn1 = new JButton("Imprimir Console");
	private static JLabel rotulo = new JLabel("Nome: ");
	private static JTextField entrada = new JTextField(40);
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		btn1.addActionListener(new Programa14());
		
		panel.add(rotulo);
		panel.add(entrada);
		panel.add(btn1);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setSize(600,200);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn1)){
			System.out.println("Você digitou: "+entrada.getText());
		}
		
	}
}
