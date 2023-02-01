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
import javax.swing.JMenu;
import java.awt.Canvas;
import java.awt.Panel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

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
		frame.setBounds(100, 100, 454, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAccueil = new JLabel("ACCUEIL");
		lblAccueil.setForeground(new Color(153, 255, 255));
		lblAccueil.setFont(new Font("Source Serif Pro Black", lblAccueil.getFont().getStyle() | Font.BOLD | Font.ITALIC, 21));
		lblAccueil.setBounds(171, 11, 145, 39);
		frame.getContentPane().add(lblAccueil);
		
		JButton btnNewButton = new JButton("Liste des Livres");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 11));
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
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(12, 161, 179, 25);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_emprunt vr = new View_emprunt();
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Creation adherent");
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_creationadh cah = new View_creationadh();
			}
		});
		btnNewButton_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_2.setBounds(234, 161, 165, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnEspaceAdhrent = new JButton("Espace Adhérent");
		btnEspaceAdhrent.setBackground(Color.RED);
		btnEspaceAdhrent.setIcon(null);
		btnEspaceAdhrent.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		btnEspaceAdhrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {View_espadh vi = new View_espadh();
			}
		});
		btnEspaceAdhrent.setBounds(12, 133, 179, 25);
		frame.getContentPane().add(btnEspaceAdhrent);
		
		JButton btnNewButton_3 = new JButton("Création Livre");
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {View_creationlivre cl = new View_creationlivre();
			}
		});
		btnNewButton_3.setBounds(234, 133, 165, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblAdhrent = new JLabel("Adhérent");
		lblAdhrent.setBackground(SystemColor.textHighlight);
		lblAdhrent.setForeground(Color.RED);
		lblAdhrent.setFont(new Font("DejaVu Sans Condensed", lblAdhrent.getFont().getStyle() | Font.BOLD | Font.ITALIC, 15));
		lblAdhrent.setBounds(31, 107, 100, 15);
		frame.getContentPane().add(lblAdhrent);
		
		JButton btnRestituerUnLivre = new JButton("Restituer Un Livre");
		btnRestituerUnLivre.setBackground(Color.ORANGE);
		btnRestituerUnLivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {View_restitution res = new View_restitution();
			}
		});
		btnRestituerUnLivre.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		btnRestituerUnLivre.setBounds(234, 187, 165, 25);
		frame.getContentPane().add(btnRestituerUnLivre);
		
		JLabel lblBibliothcaire = new JLabel("Bibliothcaire");
		lblBibliothcaire.setForeground(Color.ORANGE);
		lblBibliothcaire.setBounds(268, 104, 107, 20);
		frame.getContentPane().add(lblBibliothcaire);
		lblBibliothcaire.setFont(new Font("DejaVu Sans Condensed", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\IlpLRYK (2).jpg"));
		lblNewLabel.setBounds(-16, -1, 454, 262);
		frame.getContentPane().add(lblNewLabel);
	}

	public static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
