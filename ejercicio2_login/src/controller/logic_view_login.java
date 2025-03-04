package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;
import javax.swing.JOptionPane;

import model.user;
import view.view_catalogo;
import view.view_login;
import view.view_product;

public class logic_view_login implements ActionListener,parametrizable{
	
	private view_login vl;
	private boolean flag=false;//crear un semaforo

	public logic_view_login(view_login vl) {
		super();
		this.vl = vl;
		this.vl.btn_login.addActionListener(this);//
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==vl.btn_login) {
			try {
				//Obtiene los datos del usuario
				user.setEmail(vl.txt_email.getText());
				user.setPSW(getWord(vl.ptxt_psw.getPassword()));
				//Obtiene los datos de la bbdd
				List<user> users=udao.loadAllUsers();
				//Validar los campos
				for(user u:users) {
					//validar
					if(u.getEmail().equals(user.getEmail())&&u.getPSW().equals(user.getPSW())) {
						flag=true;
						user.setId(u.getId());
						user.setRoll(u.getRoll());
					}
				}
				//Accion correspondiente
				accessSession();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(vl, "Error al cargar Users");
			}
		}
	}

	private void accessSession() {
		if(flag) {
			JOptionPane.showMessageDialog(vl, "Bienvenido:"+user.getEmail());
			registerLog("Acceso Correcto");
			try {
				session.writerFile(user.getEmail()+";"+user.getRoll(), false);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch(user.getRoll()) {
			case 1:
				view_product vp=new view_product();
				vp.setVisible(true);//Abrir la ventana de producto				
				break;
			case 2:
				view_catalogo vc=new view_catalogo();
				vc.setVisible(true);
				break;
			}
			vl.setVisible(false);//Cerrar la ventana de login
		}else {
			JOptionPane.showMessageDialog(vl, "Credenciales Incorrectas");
			registerLog("Acceso Incorrecto");
		}
	}

	
	
	

}
