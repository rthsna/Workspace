import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MAQUETTEAP2 {

	private JFrame frame;
	private JTextField txtIdentifiant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAQUETTEAP2 window = new MAQUETTEAP2();
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
	public MAQUETTEAP2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConnexion = new JLabel("BIBLIOTHÈQUE DE COURBEVOIE");
		lblConnexion.setBounds(123, 0, 233, 15);
		frame.getContentPane().add(lblConnexion);
		
		txtIdentifiant = new JTextField();
		txtIdentifiant.setText("rechercher un livre");
		txtIdentifiant.setBounds(24, 27, 126, 19);
		frame.getContentPane().add(txtIdentifiant);
		txtIdentifiant.setColumns(10);
		
		JButton btnSeConnecter = new JButton("se connecter");
		btnSeConnecter.setBounds(104, 155, 132, 25);
		frame.getContentPane().add(btnSeConnecter);
	}
}
