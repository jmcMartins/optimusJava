package iftm.poo.aula12;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa6 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JCheckBox ckbJava = new JCheckBox("Java");
		JCheckBox ckbPython = new JCheckBox("Python");
		JCheckBox ckbPhp = new JCheckBox("PHP");
		
		panel.add(ckbJava);
		panel.add(ckbPython);
		panel.add(ckbPhp);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
