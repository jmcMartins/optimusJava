package iftm.poo.aula12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa13 implements ActionListener{
	
	private static JButton btn1 = new JButton("Ação 1");
	private static JButton btn2 = new JButton("Ação 2");
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		
		btn1.addActionListener(new Programa13());
		btn2.addActionListener(new Programa13());

		panel.add(btn1);
		panel.add(btn2);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setSize(300,200);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn1)){
			btn1.setText("Me cliclou! 1");
			System.out.println("Clicou no botão 1");
			btn2.setText("Ação 2");
		}
		if(e.getSource().equals(btn2)){
			JButton botao = (JButton)e.getSource();
			btn2.setText("Me cliclou! 2");
			System.out.println("Clicou no botão 2");
			btn1.setText("Ação 1");
		}
	}

}
