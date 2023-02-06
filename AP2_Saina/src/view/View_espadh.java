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
import javax.swing.ImageIcon;

public class View_espadh {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 52, 114, 19);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNAdherent = new JLabel("N° ADHERENT :");
		lblNAdherent.setForeground(new Color(135, 206, 250));
		lblNAdherent.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 13));
		lblNAdherent.setBounds(24, 54, 108, 15);
		frame.getContentPane().add(lblNAdherent);
		
		JLabel lblEspaceAdhrent = new JLabel("ESPACE ADHÉRENT");
		lblEspaceAdhrent.setBackground(new Color(51, 102, 204));
		lblEspaceAdhrent.setBounds(123, 11, 209, 32);
		lblEspaceAdhrent.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblEspaceAdhrent.setForeground(new Color(65, 105, 225));
		frame.getContentPane().add(lblEspaceAdhrent);
		
		JLabel lblNewLabel = new JLabel("INFORMATION :");
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(24, 84, 108, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom ");
		lblNom.setForeground(new Color(0, 128, 0));
		lblNom.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom.setBounds(24, 110, 49, 15);
		frame.getContentPane().add(lblNom);
		
		textField = new JTextField();
		textField.setBounds(82, 108, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setForeground(new Color(0, 191, 255));
		lblPrenom.setBounds(24, 136, 49, 15);
		frame.getContentPane().add(lblPrenom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(82, 133, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 0, 0));
		lblEmail.setBounds(24, 166, 49, 15);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(82, 163, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmprunt = new JLabel("EMPRUNT :");
		lblEmprunt.setForeground(new Color(255, 69, 0));
		lblEmprunt.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 13));
		lblEmprunt.setBounds(266, 84, 108, 15);
		frame.getContentPane().add(lblEmprunt);
		
		List list = new List();
		list.setBounds(266, 110, 139, 72);
		frame.getContentPane().add(list);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setForeground(new Color(30, 144, 255));
		btnRetour.setBackground(new Color(135, 206, 250));
		btnRetour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { frame.setVisible(false);
			}
		});
		btnRetour.setBounds(0, 236, 117, 25);
		frame.getContentPane().add(btnRetour);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(123, 193, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(65, 105, 225));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\bpi-rayonnages-voyez-vous.jpg"));
		lblNewLabel_1.setBounds(-232, -12, 713, 294);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
