package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

import controller.mainMVC;
import model.ADHERENT;
import model.LIVRE;

public class View_emprunt {

	private JFrame frame;
	private JTextField textField_ad;
	private JButton btnRetour;
	private JLabel lblIsbn;
	private JTextField textField_isbn;
	private JButton btnNewButton_valid_ad;
	private JButton btnNewButton_valid_ISBN;
	private JButton btnEmprunter_1;
	private JLabel lbl_info_ad;
	private JLabel lbl_info_livre;
	private JLabel lbl_info_fin;

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
		try {
			mainMVC.getM().getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		lbl_info_fin = new JLabel("");
		lbl_info_fin.setBounds(221, 213, 192, 19);
		frame.getContentPane().add(lbl_info_fin);
		
		lbl_info_livre = new JLabel("");
		lbl_info_livre.setBounds(89, 171, 279, 14);
		frame.getContentPane().add(lbl_info_livre);
		
		lbl_info_ad = new JLabel("Veuillez entrer le numéro de l'adhérent");
		lbl_info_ad.setForeground(new Color(255, 0, 0));
		lbl_info_ad.setBounds(70, 90, 279, 14);
		frame.getContentPane().add(lbl_info_ad);
		
		btnEmprunter_1 = new JButton("EMPRUNTER");
		
		btnEmprunter_1.setBackground(new Color(175, 238, 238));
		btnEmprunter_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnEmprunter_1.setEnabled(false);
		btnEmprunter_1.setBounds(89, 209, 122, 23);
		frame.getContentPane().add(btnEmprunter_1);
		
		btnNewButton_valid_ISBN = new JButton("Valider");
		
		
		btnNewButton_valid_ISBN.setBackground(new Color(175, 238, 238));
		btnNewButton_valid_ISBN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_valid_ISBN.setEnabled(false);
		btnNewButton_valid_ISBN.setBounds(279, 137, 89, 23);
		frame.getContentPane().add(btnNewButton_valid_ISBN);
		
		btnNewButton_valid_ad = new JButton("Valider");
		btnNewButton_valid_ad.setForeground(new Color(0, 0, 0));
		
		
		btnNewButton_valid_ad.setBackground(new Color(175, 238, 238));
		btnNewButton_valid_ad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_valid_ad.setBounds(279, 56, 89, 23);
		frame.getContentPane().add(btnNewButton_valid_ad);
		
		JLabel lblAdherent = new JLabel("n° Adherent :");
		lblAdherent.setForeground(new Color(0, 191, 255));
		lblAdherent.setBounds(50, 60, 66, 15);
		frame.getContentPane().add(lblAdherent);
		
		textField_ad = new JTextField();
		textField_ad.setBounds(126, 57, 129, 19);
		frame.getContentPane().add(textField_ad);
		textField_ad.setColumns(10);
		
		btnRetour = new JButton("Retour");
		btnRetour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnRetour.setBackground(new Color(175, 238, 238));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { frame.setVisible(false);
			}
		});
		btnRetour.setBounds(0, 0, 117, 25);
		frame.getContentPane().add(btnRetour);
		
		lblIsbn = new JLabel("ISBN :");
		lblIsbn.setFont(UIManager.getFont("ComboBox.font"));
		lblIsbn.setForeground(new Color(0, 191, 255));
		lblIsbn.setBounds(69, 141, 41, 15);
		frame.getContentPane().add(lblIsbn);
		
		textField_isbn = new JTextField();
		textField_isbn.setBounds(126, 138, 129, 19);
		frame.getContentPane().add(textField_isbn);
		textField_isbn.setColumns(10);
		
		JLabel lblEmprunt = new JLabel("EMPRUNT");
		lblEmprunt.setForeground(new Color(0, 191, 255));
		lblEmprunt.setFont(new Font("Source Serif Pro Light", Font.BOLD | Font.ITALIC, 18));
		lblEmprunt.setBounds(168, 12, 117, 15);
		frame.getContentPane().add(lblEmprunt);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\istockphoto-910852368-612x612.jpg"));
		lblNewLabel.setBounds(0, 0, 444, 261);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_valid_ad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADHERENT ad;
				ad=mainMVC.getM().findadherent(textField_ad.getText());
				if(ad==null)
					lbl_info_ad.setText("Adhérent non trouvé!");
				else
				{
					
					textField_ad.setEnabled(false);
					lbl_info_ad.setText("Nom adhérent : "+ad.getNom());
					textField_isbn.setEnabled(true);
					btnNewButton_valid_ISBN.setEnabled(true);
					lbl_info_livre.setText("Veuillez entrer un numéro d'ISBN à réserver");
				}
			}
		});

		btnNewButton_valid_ISBN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LIVRE l;
				l=mainMVC.getM().findlivre(textField_isbn.getText());
				if(l==null)
				{
					lbl_info_livre.setText("Livre non trouvé");
				}
				else
				{
					if(l.getEmprunteur()==null)
					{
						lbl_info_livre.setText(l.getTitre());
						btnEmprunter_1.setEnabled(true);
						lbl_info_livre.setEnabled(false);
					}
					else
					{
						lbl_info_livre.setText("Erreur Livre indisponible");
					}
				}
			}
		});
		btnEmprunter_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					mainMVC.getM().emprunter_livre(textField_ad.getText(), textField_isbn.getText());
					btnEmprunter_1.setEnabled(false);
					lbl_info_fin.setText("Le livre a bien été emprunté");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}
			}
			
		});
		
	}
	
}
		
		