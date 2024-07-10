package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.logic_view_login;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class view_login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txt_email;
	public JPasswordField ptxt_psw;
	public JButton btn_login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_login frame = new view_login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public view_login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMAIL:");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblNewLabel.setBounds(5, 5, 65, 37);
		contentPane.add(lblNewLabel);
		
		txt_email = new JTextField();
		txt_email.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txt_email.setBounds(61, 7, 335, 30);
		contentPane.add(txt_email);
		txt_email.setColumns(10);
		
		JLabel lblClave = new JLabel("CLAVE:");
		lblClave.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lblClave.setBounds(5, 55, 65, 37);
		contentPane.add(lblClave);
		
		ptxt_psw = new JPasswordField();
		ptxt_psw.setBounds(61, 52, 337, 30);
		contentPane.add(ptxt_psw);
		
		btn_login = new JButton("INGRESAR");
		btn_login.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btn_login.setBounds(259, 92, 137, 33);
		contentPane.add(btn_login);
		
		new logic_view_login(this);
	}
}
