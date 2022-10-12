package testSW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.lang.invoke.SwitchPoint;
import java.awt.event.ActionEvent;

public class TD_7 {

	private JFrame frame; 
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldTotal;
	private JButton btnNewButtonplus;
	private JButton btnNewButtonmoins;
	private JButton btnNewButtondiv;
	private JButton btnNewButtonmulti;
	private int operation;  
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TD_7 window = new TD_7();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TD_7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		operation = 1;
		frame = new JFrame();
		frame.setBounds(100, 100, 695, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 41, 90, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 41, 83, 33);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;
				switch (operation) {
				case 1 :
				{
					total=  Integer.parseInt(textField.getText())+ Integer.parseInt(textField_1.getText());
				    System.out.println("case 1");
					break;	
				}
				case 2 : 
				{
					total = Integer.parseInt(textField.getText())- Integer.parseInt (textField_1.getText());
					System.out.println("case 2");
					break;
				}
				case 3 : 
				{
					total = Integer.parseInt(textField.getText())/Integer.parseInt (textField_1.getText());
                    System.out.println("case 3"); 
                    break;
				}
				case 4 :
				{
					total = Integer.parseInt(textField.getText())*Integer.parseInt (textField_1.getText());
                    System.out.println("case 3"); 
                    break;
				}				
				}
				textFieldTotal.setText(String.valueOf(total));
				
			}
		});
		btnNewButton.setBounds(276, 45, 117, 25);
		frame.getContentPane().add(btnNewButton);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setBounds(415, 41, 114, 33);
		frame.getContentPane().add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		btnNewButtonplus = new JButton("+");
		btnNewButtonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				btnNewButtonplus.setBackground(Color.GREEN);
				btnNewButtonmoins.setBackground(Color.GRAY);
				btnNewButtondiv.setBackground(Color.GRAY);
				btnNewButtonmulti.setBackground(Color.GRAY);
				operation = 1;
			}
		});
		btnNewButtonplus.setBounds(119, 30, 44, 25);
		frame.getContentPane().add(btnNewButtonplus);
		
		btnNewButtonmoins = new JButton("-");
		btnNewButtonmoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			btnNewButtonplus.setBackground(Color.GRAY);
			btnNewButtonmoins.setBackground(Color.GREEN);
			btnNewButtondiv.setBackground(Color.GRAY);
			btnNewButtonmulti.setBackground(Color.GRAY);
			operation = 2;}
		});
		btnNewButtonmoins.setBounds(119, 67, 41, 25);
		frame.getContentPane().add(btnNewButtonmoins);
		
		btnNewButtondiv = new JButton("/");
		btnNewButtondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnNewButtonplus.setBackground(Color.GRAY);
			btnNewButtonmoins.setBackground(Color.GRAY);
			btnNewButtondiv.setBackground(Color.GREEN);
			btnNewButtonmulti.setBackground(Color.GRAY);
			operation = 3; 
			}
		});
		btnNewButtondiv.setBounds(119, 104, 41, 25);
		frame.getContentPane().add(btnNewButtondiv);
		
		btnNewButtonmulti = new JButton("*");
		btnNewButtonmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnNewButtonplus.setBackground(Color.GRAY);
			btnNewButtonmoins.setBackground(Color.GRAY);
			btnNewButtondiv.setBackground(Color.GRAY);
			btnNewButtonmulti.setBackground(Color.GREEN);
			operation = 4;
			}
		});
		btnNewButtonmulti.setBounds(119, 141, 41, 25);
		frame.getContentPane().add(btnNewButtonmulti);
	}
}
