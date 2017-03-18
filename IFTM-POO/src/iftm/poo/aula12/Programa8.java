package iftm.poo.aula12;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Programa8 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("IFTM - POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JRadioButton rbWindows = new JRadioButton("Windows");
		JRadioButton rbLinux = new JRadioButton("Linux");
		JRadioButton rbMac = new JRadioButton("Mac OS X");
		
		ButtonGroup bgSOs = new ButtonGroup();
		
		bgSOs.add(rbWindows);
		bgSOs.add(rbLinux);
		bgSOs.add(rbMac);
		
		panel.add(rbWindows);
		panel.add(rbLinux);
		panel.add(rbMac);
		
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
