package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;

public class View_Accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Accueil window = new View_Accueil();
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
	public View_Accueil() {
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
		
		JLabel lblAccueil = new JLabel("ACCUEIL");
		lblAccueil.setForeground(Color.DARK_GRAY);
		lblAccueil.setFont(new Font("NanumGothic", Font.BOLD, 19));
		lblAccueil.setBounds(169, -1, 145, 39);
		frame.getContentPane().add(lblAccueil);
		
		JButton btnNewButton = new JButton("Liste des Livres");
		btnNewButton.setBounds(12, 50, 145, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					View_Livre vl = new View_Livre();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Emprunter un Livre");
		btnNewButton_1.setFont(new Font("Montserrat Medium", Font.BOLD, 12));
		btnNewButton_1.setBounds(12, 189, 179, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_emprunt vr = new View_emprunt();
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Creation adherent");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_creationadh cah = new View_creationadh();
			}
		});
		btnNewButton_2.setFont(new Font("Montserrat Medium", Font.BOLD, 12));
		btnNewButton_2.setBounds(238, 189, 165, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnEspaceAdhrent = new JButton("Espace Adhérent");
		btnEspaceAdhrent.setFont(new Font("Montserrat Medium", Font.BOLD, 12));
		btnEspaceAdhrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {View_espadh vi = new View_espadh();
			}
		});
		btnEspaceAdhrent.setBounds(12, 161, 194, 25);
		frame.getContentPane().add(btnEspaceAdhrent);
		
		JButton btnNewButton_3 = new JButton("Création Livre");
		btnNewButton_3.setFont(new Font("Montserrat Medium", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {View_creationlivre cl = new View_creationlivre();
			}
		});
		btnNewButton_3.setBounds(238, 161, 179, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblAdhrent = new JLabel("Adhérent");
		lblAdhrent.setFont(new Font("FreeMono", Font.BOLD, 15));
		lblAdhrent.setBounds(24, 121, 100, 15);
		frame.getContentPane().add(lblAdhrent);
		
		JLabel lblBibliothcaire = new JLabel("Bibliothcaire");
		lblBibliothcaire.setFont(new Font("FreeMono", Font.BOLD, 15));
		lblBibliothcaire.setBounds(269, 121, 127, 15);
		frame.getContentPane().add(lblBibliothcaire);
		
		JButton btnRestituerUnLivre = new JButton("Restituer Un Livre");
		btnRestituerUnLivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {View_restitution res = new View_restitution();
			}
		});
		btnRestituerUnLivre.setFont(new Font("Montserrat Medium", Font.BOLD, 12));
		btnRestituerUnLivre.setBounds(238, 215, 175, 25);
		frame.getContentPane().add(btnRestituerUnLivre);
	}

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
