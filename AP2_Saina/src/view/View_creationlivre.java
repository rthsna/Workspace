package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextField;

import controller.mainMVC;
import model.LIVRE;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class View_creationlivre {

	private JFrame frame;
	private final JLabel lblCrationLivre = new JLabel("CRÉATION LIVRE");
	private JTextField textField_Isbn;
	private JTextField textField_Titre;
	private JTextField textField_Prix;
	private JTextField textField_Auteur;

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
		lblCrationLivre.setForeground(new Color(255, 222, 173));
		lblCrationLivre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		lblCrationLivre.setBounds(98, 11, 196, 33);
		frame.getContentPane().add(lblCrationLivre);
		
		JLabel lblIsbn = new JLabel("ISBN : ");
		lblIsbn.setForeground(new Color(224, 255, 255));
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblIsbn.setBounds(40, 69, 70, 15);
		frame.getContentPane().add(lblIsbn);
		
		textField_Isbn = new JTextField();
		textField_Isbn.setBounds(98, 67, 114, 19);
		frame.getContentPane().add(textField_Isbn);
		textField_Isbn.setColumns(10);
		JLabel lblNom = new JLabel("Titre :");
		lblNom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNom.setForeground(new Color(224, 255, 255));
		lblNom.setBounds(40, 96, 70, 15);
		frame.getContentPane().add(lblNom);
		
		textField_Titre = new JTextField();
		textField_Titre.setBounds(98, 96, 114, 19);
		frame.getContentPane().add(textField_Titre);
		textField_Titre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prix :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setForeground(new Color(224, 255, 255));
		lblNewLabel.setBounds(40, 123, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		textField_Prix = new JTextField();
		textField_Prix.setBounds(98, 123, 114, 19);
		frame.getContentPane().add(textField_Prix);
		textField_Prix.setColumns(10);
		
		
		JLabel lblAuteur = new JLabel("Auteur :");
		lblAuteur.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblAuteur.setForeground(new Color(224, 255, 255));
		lblAuteur.setBounds(28, 150, 70, 15);
		frame.getContentPane().add(lblAuteur);
		
		textField_Auteur = new JTextField();
		textField_Auteur.setBounds(98, 148, 114, 19);
		frame.getContentPane().add(textField_Auteur);
		textField_Auteur.setColumns(10);
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				mainMVC.getM().Creation_livre(textField_Isbn.getText(),textField_Titre.getText(), Float.parseFloat(textField_Prix.getText()),Integer.parseInt(textField_Auteur.getText()));
			}
		});
		btnValider.setBackground(new Color(176, 224, 230));
		btnValider.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnValider.setBounds(98, 177, 117, 25);
		frame.getContentPane().add(btnValider);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(175, 238, 238));
		btnRetour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {frame.setVisible(false);
			}
		});
		btnRetour.setBounds(319, 236, 117, 25);
		frame.getContentPane().add(btnRetour);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\istockphoto-683970720-612x612.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
