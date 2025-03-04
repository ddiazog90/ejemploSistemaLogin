package view;

import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class view_product extends JFrame{
	private JTextField txt_nameProduct;
	private JTextField txt_precio;
	private JTextArea txt_desc;
	private JSpinner sp_stock;
	private JButton btn_add;

	public view_product()  {
		setResizable(false);//Mantiene fijo el tamano de la ventana
		//Controlar la accion despues de cerra la ventana
		this.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				view_login vl=new view_login();
				vl.setVisible(true);
				vl.setLocationRelativeTo(null);
			}
		});
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100,413,256);
		getContentPane().setLayout(null);
		
		JPanel pn_register = new JPanel();
		pn_register.setBounds(0, 0, 386, 218);
		getContentPane().add(pn_register);
		pn_register.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCTO:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(50, 33, 78, 19);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		pn_register.add(lblNewLabel);
		
		txt_nameProduct = new JTextField();
		txt_nameProduct.setBounds(133, 30, 253, 25);
		txt_nameProduct.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		pn_register.add(txt_nameProduct);
		txt_nameProduct.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("DESCRIPCION:");
		lblDescripcion.setBounds(30, 84, 98, 19);
		lblDescripcion.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		pn_register.add(lblDescripcion);
		
		txt_desc = new JTextArea();
		txt_desc.setBounds(133, 60, 253, 67);
		pn_register.add(txt_desc);
		
		JLabel lblStock = new JLabel("STOCK:");
		lblStock.setBounds(54, 132, 74, 19);
		lblStock.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStock.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		pn_register.add(lblStock);
		
		sp_stock = new JSpinner();
		sp_stock.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		sp_stock.setBounds(133, 134, 48, 20);
		pn_register.add(sp_stock);
		
		JLabel lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setBounds(74, 160, 54, 19);
		lblPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrecio.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		pn_register.add(lblPrecio);
		
		txt_precio = new JTextField();
		txt_precio.setBounds(133, 157, 253, 25);
		txt_precio.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		txt_precio.setColumns(10);
		pn_register.add(txt_precio);
		
		btn_add = new JButton("ADD");
		btn_add.setBounds(309, 187, 67, 31);
		btn_add.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		pn_register.add(btn_add);
		
	}
}
