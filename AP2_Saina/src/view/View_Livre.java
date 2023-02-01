package view;

import java.awt.EventQueue;
import java.sql.SQLException;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import controller.mainMVC;
import model.model;
import java.awt.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
public class View_Livre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Livre window = new View_Livre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException
	 */
	public View_Livre() throws SQLException { 
		mainMVC.getM().getAll();
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
		
		JLabel lblListeDeLivre = new JLabel("Liste de Livre :");
		lblListeDeLivre.setBackground(new Color(0, 255, 255));
		lblListeDeLivre.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeDeLivre.setForeground(new Color(255, 51, 51));
		lblListeDeLivre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblListeDeLivre.setBounds(80, 71, 122, 15);
		frame.getContentPane().add(lblListeDeLivre);
		
		List list_box = new List();
		list_box.setBackground(new Color(255, 255, 204));
		list_box.setForeground(new Color(255, 102, 102));
		list_box.setBounds(68, 93, 339, 87);
		frame.getContentPane().add(list_box);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(102, 51, 51));
		btnRetour.setForeground(new Color(0, 0, 0));
		btnRetour.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ 
				//frame.dispose();
	         frame.setVisible(false);
	   
			
			}

	
		});
		btnRetour.setBounds(35, 222, 117, 25);
		frame.getContentPane().add(btnRetour);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sayn\\Pictures\\img-blv-620x400.jpg"));
		lblNewLabel.setBounds(0, 0, 454, 262);
		frame.getContentPane().add(lblNewLabel);
		System.out.println(mainMVC.getM().getListLivre().size());
		for (int i=0;i!=mainMVC.getM().getListLivre().size();i++)
		{
			list_box.add(mainMVC.getM().getListLivre().get(i).Ligne());	
		}
	}
}
