package ejercicio1_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connection implements settings{
	protected Connection conn=null;//Despacha
	protected Statement stmt=null;//solicita
	protected ResultSet res=null;//recibe
	
	public Connection openConn() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(getURL());
			if(conn!=null)
				System.out.println("CONEXION EXITOSA!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Error en el Driver");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error en el URL a la Base de Datos");
		}
		return conn;
	}
	
	public boolean closeConn() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}else {
			return false;
		}
	}
	
	

}
