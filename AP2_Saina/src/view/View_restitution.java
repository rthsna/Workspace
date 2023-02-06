package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class View_restitution {

	private JFrame frame;
	private JTextField textField;

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
		btnValider.setBounds(199, 87, 89, 23);
		frame.getContentPane().add(btnValider);
		
		JLabel lbl_info_livre = new JLabel("");
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
		
		textField = new JTextField();
		textField.setBounds(92, 59, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRestituer = new JButton("Restituer");
		btnRestituer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRestituer.setBackground(new Color(176, 224, 230));
		btnRestituer.setBounds(190, 128, 117, 25);
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
	}
}
