package iftm.poo.aula12;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa11 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JButton btn1 = new JButton("Ação 1");
		JButton btn2 = new JButton("Ação 2");
		JButton btn3 = new JButton("Ação 3");
		JButton btn4 = new JButton("Ação 4");
		JButton btn5 = new JButton("Ação 5");
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		frame.setContentPane(panel);
		frame.pack();
		//frame.setSize(300,100);
		frame.setVisible(true);
	}

}
