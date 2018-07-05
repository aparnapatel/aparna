package Aparna;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPasswordField;

public class mainpage {

	private JFrame frame;
	private JTextField user;
	private JLabel label;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage window = new mainpage();
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
	public mainpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 307, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterStudyHours = new JLabel("Username");
		lblEnterStudyHours.setBounds(25, 11, 128, 14);
		frame.getContentPane().add(lblEnterStudyHours);
		
		user = new JTextField();
		user.setForeground(Color.BLACK);
		user.setBounds(23, 25, 130, 20);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		label = new JLabel("Password");
		label.setBounds(25, 96, 128, 14);
		frame.getContentPane().add(label);
		
		JButton btnShow = new JButton("Login");
		btnShow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				//Business Logic Here
				String USER=user.getText();
				String PASSWORD=pass.getText();
				if(USER.matches("Admin") && PASSWORD.matches("1234"))
				{
					JOptionPane.showMessageDialog(null,"login Successfull");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Login Unsucessfull");
				}
				
			}
		});
		btnShow.setBounds(38, 178, 89, 23);
		frame.getContentPane().add(btnShow);
		
		pass = new JPasswordField();
		pass.setBounds(25, 110, 102, 20);
		frame.getContentPane().add(pass);
	}
}
