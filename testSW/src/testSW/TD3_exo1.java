package testSW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class TD3_exo1 {

	private JFrame frame;
	private JTextField Entree;
    private int min= 1  ;
    private int max=100 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TD3_exo1 window = new TD3_exo1();
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
	public TD3_exo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Devine le nombre");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDevineLeNombre = new JLabel("Devine le nombre :");
		lblDevineLeNombre.setBounds(23, 49, 137, 15);
		frame.getContentPane().add(lblDevineLeNombre);
		
		Entree = new JTextField();
		Entree.setBounds(166, 47, 85, 31);
		frame.getContentPane().add(Entree);
		Entree.setColumns(10);
		
		JButton btnNewButton = new JButton("?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(146, 90, 117, 100);
		frame.getContentPane().add(btnNewButton);
	}
}
