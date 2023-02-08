package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

import controller.mainMVC;
import model.ADHERENT;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Panel;

public class View_espadh {

	private JFrame frame;
	private JTextField textField_ad;

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
		
		List listemail = new List();
		listemail.setBounds(79, 161, 139, 19);
		frame.getContentPane().add(listemail);
		
		List listprenom = new List();
		listprenom.setBounds(79, 136, 139, 19);
		frame.getContentPane().add(listprenom);
		
		List listnom = new List();
		listnom.setBounds(79, 111, 139, 19);
		frame.getContentPane().add(listnom);
		
		JLabel lbl_info = new JLabel("\"\"");
		lbl_info.setBounds(24, 198, 158, 14);
		frame.getContentPane().add(lbl_info);
		
		textField_ad = new JTextField();
		textField_ad.setColumns(10);
		textField_ad.setBounds(133, 52, 114, 19);
		frame.getContentPane().add(textField_ad);
		
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
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setForeground(new Color(0, 191, 255));
		lblPrenom.setBounds(24, 136, 49, 15);
		frame.getContentPane().add(lblPrenom);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 0, 0));
		lblEmail.setBounds(24, 166, 49, 15);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblEmprunt = new JLabel("EMPRUNT :");
		lblEmprunt.setForeground(new Color(255, 69, 0));
		lblEmprunt.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 13));
		lblEmprunt.setBounds(266, 84, 108, 15);
		frame.getContentPane().add(lblEmprunt);
		
		List listlivre = new List();
		listlivre.setBounds(266, 110, 139, 72);
		frame.getContentPane().add(listlivre);
		
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
		
		JButton btnValider = new JButton("Valider");
		btnValider.setForeground(new Color(30, 144, 255));
		btnValider.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnValider.setBackground(new Color(135, 206, 250));
		
		btnValider.setBounds(260, 51, 89, 23);
		frame.getContentPane().add(btnValider);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(65, 105, 225));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\bpi-rayonnages-voyez-vous.jpg"));
		lblNewLabel_1.setBounds(-232, -12, 713, 294);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADHERENT ad;
				ad=mainMVC.getM().findadherent(textField_ad.getText());
				if(ad==null)
					lbl_info.setText("Adhérent non trouvé!");
				else
				{
					listnom.add(ad.getNom());
					listprenom.add(ad.getPrenom());
					listemail.add(ad.getEmail());
					//on parcourt la liste des livres
					
					//dans la boucle
					//list.add(
					listlivre.add(ad.getListLivre());
				}
					
				
			}
		});
	}
}
