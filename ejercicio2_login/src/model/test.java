package model;

import java.sql.SQLException;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		userDAO udao=new userDAO(new user(1,"ptorres@ups.edu.ec","ptorres1234",1));
//		if(udao.updateUser(1)) {
//			System.out.println("Usuario registrado");
//		}
		
//		userDAO udao=new userDAO();
//		try {
//			List<user> users=udao.loadAllUsers();
//			for(user u:users) {
//				System.out.println(u.getEmail()+"\t"+u.getPSW());
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		productDAO pdao=new productDAO(new product(1,"Monitor","Monitor LG",4,125.50));
		if(pdao.crudProduct(1)) {
			System.out.println("Producto registrado");
		}
		
		
	}

}
