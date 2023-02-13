
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import controller.mainMVC;
import model.ADHERENT;
import model.LIVRE;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class View_restitution {

	private JFrame frame;
	private JTextField textField_L;

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

		JButton btnValider = new JButton("Valider");
		btnValider.setBackground(new Color(135, 206, 250)) ;


		btnValider.setBounds(76, 89, 89, 23);
		frame.getContentPane().add(btnValider);

		JLabel lbl_info_livre = new JLabel("");
		lbl_info_livre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lbl_info_livre.setForeground(new Color(255, 0, 0));
		lbl_info_livre.setBackground(new Color(255, 0, 0));
		lbl_info_livre.setBounds(216, 62, 220, 14);
		frame.getContentPane().add(lbl_info_livre);

		JLabel lblRestitutionDeLivre = new JLabel("RESTITUTION DE LIVRE");
		lblRestitutionDeLivre.setForeground(new Color(127, 255, 212));
		lblRestitutionDeLivre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblRestitutionDeLivre.setBounds(106, 12, 201, 15);
		frame.getContentPane().add(lblRestitutionDeLivre);

		JLabel lblIsbn = new JLabel("ISBN :");
		lblIsbn.setForeground(new Color(152, 251, 152));
		lblIsbn.setBounds(38, 61, 70, 15);
		frame.getContentPane().add(lblIsbn);

		textField_L = new JTextField();
		textField_L.setBounds(92, 59, 114, 19);
		frame.getContentPane().add(textField_L);
		textField_L.setColumns(10);

		JButton btnRestituer = new JButton("Restituer");


		btnRestituer.setBackground(new Color(176, 224, 230));
		btnRestituer.setBounds(203, 118, 117, 25);
		btnRestituer.setEnabled(false);
		frame.getContentPane().add(btnRestituer);

		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(175, 238, 238));
		btnRetour.setFont(new Font("Khmer OS Content", Font.BOLD, 12));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { frame.setVisible(false);
			}
		});
		btnRetour.setBounds(25, 224, 117, 25);
		frame.getContentPane().add(btnRetour);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\istockphoto-1130461533-612x612.jpg"));
		lblNewLabel.setBounds(-48, 0, 492, 261);
		frame.getContentPane().add(lblNewLabel);

		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LIVRE l;
				l=mainMVC.getM().findlivre(textField_L.getText());

				if(l==null)
					lbl_info_livre.setText("Livre inexistant!");


				else 
				{
					if(l.getEmprunteur() == null)
					{
						lbl_info_livre.setText("Livre Disponible");
						btnRestituer.setEnabled(false);	
					}
					else
					{
						btnValider.setEnabled(false);
						lbl_info_livre.setText("titre du Livre: "+l.getTitre());
						btnRestituer.setEnabled(true);					
					}
				}

			}

		});	
		btnRestituer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					mainMVC.getM().restituer_livre(textField_L.getText());
					btnRestituer.setEnabled(false);
					lbl_info_livre.setText("Le livre a bien été restitué");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}
			}





			});
		
	}
}
