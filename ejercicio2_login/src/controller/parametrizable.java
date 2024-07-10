package controller;

import model.userDAO;

import java.io.IOException;
import java.util.Date;

import libreriaVersion3.files;
import model.user;

public interface parametrizable {
	public final userDAO udao=new userDAO();//Permite acceder al DAO de user
	public final user user=new user();//Para crear una variable de session
	public final files log=new files("src/data/log.txt"),//Almacenar los logs del programa
			           session=new files("src/data/session.txt");//Almacenar el usuario logeado
	
	//permite construir una cadena de caracteres
	public default String getWord(char [] c) {
		String word="";
		for(char cr:c) {
			word+=String.valueOf(cr);
		}
		return word;
	}
	
	public default void registerLog(String msg) {
		try {
			log.writerFile("User:"+user.getEmail()+" Action:"+msg+" Date:"+new Date(), false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
