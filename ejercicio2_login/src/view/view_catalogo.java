package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class view_catalogo extends JFrame{
	private JLabel lbl_imgProduct;
	
	public view_catalogo() {
		setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				view_login vl=new view_login();
				vl.setVisible(true);
				vl.setLocationRelativeTo(null);
			}
		});
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100,339,429);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 326, 392);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lbl_imgProduct = new JLabel("IMAGEN");
		lbl_imgProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_imgProduct.setBounds(27, 10, 259, 221);
		panel.add(lbl_imgProduct);
		
		JLabel lbl_nameProduct = new JLabel("PRODUCTO");
		lbl_nameProduct.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_nameProduct.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lbl_nameProduct.setBounds(27, 241, 259, 13);
		panel.add(lbl_nameProduct);
		
		JLabel lbl_desc = new JLabel("DESCRIPCION");
		lbl_desc.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_desc.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lbl_desc.setBounds(27, 281, 259, 13);
		panel.add(lbl_desc);
		
		JLabel lbl_stock = new JLabel("STOCK");
		lbl_stock.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_stock.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lbl_stock.setBounds(27, 315, 125, 13);
		panel.add(lbl_stock);
		
		JLabel lbl_price = new JLabel("PRECIO");
		lbl_price.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_price.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		lbl_price.setBounds(161, 317, 125, 13);
		panel.add(lbl_price);
		
		JButton btn_prev = new JButton("<<");
		btn_prev.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btn_prev.setBounds(68, 361, 85, 21);
		panel.add(btn_prev);
		
		JButton btn_next = new JButton(">>");
		btn_next.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btn_next.setBounds(164, 361, 85, 21);
		panel.add(btn_next);
		
	}
}
