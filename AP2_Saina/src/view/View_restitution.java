package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_restitution {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_restitution window = new View_restitution();
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
	public View_restitution() {
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
		
		JLabel lblRestitutionDeLivre = new JLabel("RESTITUTION DE LIVRE");
		lblRestitutionDeLivre.setForeground(new Color(206, 92, 0));
		lblRestitutionDeLivre.setFont(new Font("Montserrat ExtraLight", Font.BOLD, 15));
		lblRestitutionDeLivre.setBounds(106, 12, 201, 15);
		frame.getContentPane().add(lblRestitutionDeLivre);
		
		JLabel lblIsbn = new JLabel("ISBN :");
		lblIsbn.setBounds(38, 61, 70, 15);
		frame.getContentPane().add(lblIsbn);
		
		textField = new JTextField();
		textField.setBounds(92, 59, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRestituer = new JButton("Restituer");
		btnRestituer.setBounds(135, 102, 117, 25);
		frame.getContentPane().add(btnRestituer);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {View_Accueil retour = new View_Accueil();
			}
		});
		btnRetour.setBounds(25, 224, 117, 25);
		frame.getContentPane().add(btnRetour);
	}

}
