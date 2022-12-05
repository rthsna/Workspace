package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_emprunt {

	private JFrame frame;
	private JTextField textField;
	private JButton btnRetour;
	private JLabel lblIsbn;
	private JTextField textField_1;
	private JButton btnEmprunter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_emprunt window = new View_emprunt();
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
	public View_emprunt() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdherent = new JLabel("n° Adherent :");
		lblAdherent.setBounds(68, 50, 100, 15);
		frame.getContentPane().add(lblAdherent);
		
		textField = new JTextField();
		textField.setBounds(173, 48, 129, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {View_Accueil retour = new View_Accueil();
			}
		});
		btnRetour.setBounds(37, 236, 117, 25);
		frame.getContentPane().add(btnRetour);
		
		lblIsbn = new JLabel("ISBN :");
		lblIsbn.setBounds(107, 87, 70, 15);
		frame.getContentPane().add(lblIsbn);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 85, 129, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnEmprunter = new JButton("Emprunter");
		btnEmprunter.setBounds(174, 137, 117, 25);
		frame.getContentPane().add(btnEmprunter);
	}

}
