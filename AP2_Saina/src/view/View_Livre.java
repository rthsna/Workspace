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
		lblListeDeLivre.setBounds(84, 49, 122, 15);
		frame.getContentPane().add(lblListeDeLivre);
		
		JList list = new JList();
		list.setBounds(80, 76, 190, 79);
		frame.getContentPane().add(list);
		
		List list_box = new List();
		list_box.setBounds(81, 168, 139, 72);
		frame.getContentPane().add(list_box);
		
		System.out.println(mainMVC.getM().getListLivre().size());
		for (int i=0;i!=mainMVC.getM().getListLivre().size();i++)
		{
			list_box.add(mainMVC.getM().getListLivre().get(i).Ligne());	
		}
	}
}
