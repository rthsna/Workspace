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
		lblEspaceAdhrent.setBackground(new Color(51, 102, 204));
		lblEspaceAdhrent.setBounds(123, 11, 209, 32);
		lblEspaceAdhrent.setFont(new Font("Yu Gothic Medium", Font.BOLD, 19));
		lblEspaceAdhrent.setForeground(new Color(0, 102, 255));
		frame.getContentPane().add(lblEspaceAdhrent);
		
		JLabel lblNewLabel = new JLabel("INFORMATION :");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(24, 54, 108, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom ");
		lblNom.setForeground(new Color(255, 51, 204));
		lblNom.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNom.setBounds(24, 94, 70, 15);
		frame.getContentPane().add(lblNom);
		
		textField = new JTextField();
		textField.setBounds(82, 92, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setForeground(new Color(255, 0, 204));
		lblPrenom.setBounds(24, 121, 70, 15);
		frame.getContentPane().add(lblPrenom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(82, 119, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 0, 255));
		lblEmail.setBounds(24, 148, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(82, 146, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEmprunt = new JLabel("EMPRUNT :");
		lblEmprunt.setForeground(Color.BLUE);
		lblEmprunt.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 13));
		lblEmprunt.setBounds(266, 54, 108, 15);
		frame.getContentPane().add(lblEmprunt);
		
		List list = new List();
		list.setBounds(266, 92, 139, 72);
		frame.getContentPane().add(list);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(255, 255, 51));
		btnRetour.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { frame.setVisible(false);
			}
		});
		btnRetour.setBounds(15, 225, 117, 25);
		frame.getContentPane().add(btnRetour);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBackground(new Color(255, 204, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(123, 176, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\livres.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
