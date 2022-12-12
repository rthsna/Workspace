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
		lblCrationAdhrent.setBackground(new Color(52, 101, 164));
		lblCrationAdhrent.setFont(new Font("Montserrat Light", Font.BOLD, 18));
		lblCrationAdhrent.setBounds(98, 12, 227, 15);
		frame.getContentPane().add(lblCrationAdhrent);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(78, 75, 114, 19);
		frame.getContentPane().add(textField);
		
		JLabel lblNum = new JLabel("Num : ");
		lblNum.setBounds(27, 77, 70, 15);
		frame.getContentPane().add(lblNum);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(78, 106, 114, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(78, 137, 114, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(78, 164, 114, 19);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setBounds(27, 106, 70, 15);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrnom = new JLabel("Prénom: ");
		lblPrnom.setBounds(12, 137, 70, 15);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblEmail = new JLabel("email : ");
		lblEmail.setBounds(27, 164, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(112, 195, 117, 25);
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
