package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_espadh {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_espadh window = new View_espadh();
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
	public View_espadh() {
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
		
		JLabel lblEspaceAdhrent = new JLabel("ESPACE ADHÉRENT");
		lblEspaceAdhrent.setBounds(154, 12, 170, 15);
		lblEspaceAdhrent.setFont(new Font("Source Han Sans CN Medium", Font.BOLD, 15));
		lblEspaceAdhrent.setForeground(Color.BLUE);
		frame.getContentPane().add(lblEspaceAdhrent);
		
		JLabel lblNewLabel = new JLabel("INFORMATION :");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Droid Sans Fallback", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(24, 54, 108, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom ");
		lblNom.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom.setBounds(24, 94, 70, 15);
		frame.getContentPane().add(lblNom);
		
		textField = new JTextField();
		textField.setBounds(82, 92, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(24, 121, 70, 15);
		frame.getContentPane().add(lblPrenom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(82, 119, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(24, 148, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(82, 146, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmprunt = new JLabel("EMPRUNT :");
		lblEmprunt.setForeground(Color.BLUE);
		lblEmprunt.setFont(new Font("Droid Sans Fallback", Font.BOLD | Font.ITALIC, 13));
		lblEmprunt.setBounds(266, 54, 108, 15);
		frame.getContentPane().add(lblEmprunt);
		
		List list = new List();
		list.setBounds(266, 92, 139, 72);
		frame.getContentPane().add(list);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { frame.setVisible(false);
			}
		});
		btnRetour.setBounds(15, 225, 117, 25);
		frame.getContentPane().add(btnRetour);
	}
}
