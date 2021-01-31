/******************************************************************************
 *  Compilation:  javac GUI.java
 *  Execution:    java GUI
 *
 *  A minimal Java program with a graphical user interface. The
 *  GUI prints out the number of times the user clicks a button.
 *
 *  % java GUI
 *  import javax.swing.*;
 *  import java.awt.*;
 *  import java.awt.event.*;
 ******************************************************************************/
package ourFirstGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {	
	private int count =0;
	private JLabel label;
	private JFrame frame;
	private JButton button;
	private JPanel panel;
	
	public GUI() {
		frame = new JFrame();
		button = new JButton("Click Me");
		label = new JLabel("Number of Clicks: 0");
		button.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(60 ,60 ,10 ,60));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First GUI");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Number of Clicks " + count);	
	}
}
