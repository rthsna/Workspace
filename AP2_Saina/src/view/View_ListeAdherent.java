package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.List;
import javax.swing.JLabel;

import controller.mainMVC;

import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_ListeAdherent {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_ListeAdherent window = new View_ListeAdherent();
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
	public View_ListeAdherent() {
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
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { frame.setVisible(false);
			}
		});
		btnRetour.setForeground(new Color(30, 144, 255));
		btnRetour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnRetour.setBackground(new Color(135, 206, 250));
		btnRetour.setBounds(0, 236, 117, 25);
		frame.getContentPane().add(btnRetour);
		
		JLabel lblNewLabel_1 = new JLabel("Liste Des Adherent");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(105, 73, 161, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		List listAdherent = new List();
		listAdherent.setBounds(110, 93, 279, 114);
		frame.getContentPane().add(listAdherent);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\istockphoto-1015149600-612x612.jpg"));
		lblNewLabel.setBounds(0, 0, 424, 261);
		frame.getContentPane().add(lblNewLabel);
		System.out.println(mainMVC.getM().getListAdherent().size());
		for (int i=0;i!=mainMVC.getM().getListAdherent().size();i++)
		{
			listAdherent.add(mainMVC.getM().getListAdherent().get(i).LigneAdherent());	
		}
	
	}
}
