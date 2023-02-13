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

public class View_creationadh {

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
					View_creationadh window = new View_creationadh();
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
	public View_creationadh() {
		System.out.println("test");
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
		
		JLabel lblCrationAdhrent = new JLabel("CRÉATION ADHÉRENT");
		lblCrationAdhrent.setForeground(new Color(255, 69, 0));
		lblCrationAdhrent.setBackground(new Color(52, 101, 164));
		lblCrationAdhrent.setFont(new Font("DialogInput", Font.BOLD, 18));
		lblCrationAdhrent.setBounds(63, 11, 227, 15);
		frame.getContentPane().add(lblCrationAdhrent);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 74, 114, 19);
		frame.getContentPane().add(textField);
		
		JLabel lblNum = new JLabel("Num : ");
		lblNum.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNum.setForeground(new Color(255, 215, 0));
		lblNum.setBounds(84, 77, 36, 15);
		frame.getContentPane().add(lblNum);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 104, 114, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 134, 114, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 164, 114, 19);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setForeground(new Color(255, 215, 0));
		lblNom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNom.setBounds(85, 107, 36, 15);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrnom = new JLabel("Prénom: ");
		lblPrnom.setForeground(new Color(255, 215, 0));
		lblPrnom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblPrnom.setBounds(77, 137, 58, 15);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblEmail = new JLabel("email : ");
		lblEmail.setForeground(new Color(255, 215, 0));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblEmail.setBounds(87, 164, 48, 15);
		frame.getContentPane().add(lblEmail);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValider.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnValider.setBackground(new Color(135, 206, 250));
		btnValider.setBounds(127, 203, 117, 25);
		frame.getContentPane().add(btnValider);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(173, 216, 230));
		btnRetour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnRetour.setForeground(new Color(0, 0, 0));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {frame.setVisible(false);
			}
		});
		btnRetour.setBounds(319, 236, 117, 25);
		frame.getContentPane().add(btnRetour);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\Book-diapo-1.jpg"));
		lblNewLabel.setBounds(-237, 0, 767, 275);
		frame.getContentPane().add(lblNewLabel);
	}
}
