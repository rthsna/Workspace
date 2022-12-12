package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_creationlivre {

	private JFrame frame;
	private final JLabel lblCrationLivre = new JLabel("CRÉATION LIVRE");
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
					View_creationlivre window = new View_creationlivre();
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
	public View_creationlivre() {
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
		lblCrationLivre.setFont(new Font("Nimbus Roman", Font.BOLD, 18));
		lblCrationLivre.setBounds(131, 12, 196, 33);
		frame.getContentPane().add(lblCrationLivre);
		
		JLabel lblIsbn = new JLabel("ISBN : ");
		lblIsbn.setBounds(40, 69, 70, 15);
		frame.getContentPane().add(lblIsbn);
		
		textField = new JTextField();
		textField.setBounds(98, 67, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNom = new JLabel("Titre :");
		lblNom.setBounds(40, 96, 70, 15);
		frame.getContentPane().add(lblNom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 96, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prix :");
		lblNewLabel.setBounds(40, 123, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 123, 114, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAuteur = new JLabel("Auteur :");
		lblAuteur.setBounds(28, 150, 70, 15);
		frame.getContentPane().add(lblAuteur);
		
		textField_3 = new JTextField();
		textField_3.setBounds(98, 148, 114, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(98, 177, 117, 25);
		frame.getContentPane().add(btnValider);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {frame.setVisible(false);
			}
		});
		btnRetour.setBounds(319, 236, 117, 25);
		frame.getContentPane().add(btnRetour);
	}
}
