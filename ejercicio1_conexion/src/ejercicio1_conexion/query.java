package ejercicio1_conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class query extends connection{
	
	public ResultSet queryBBDD(String senSql) {
		try {
			stmt=(Statement)openConn().createStatement();
			res=stmt.executeQuery(senSql);
			return res;//cargado de data
		}catch(SQLException sqle) {
			System.err.println("Error en la consulta");
			return res;//null
		}
	}
	public boolean operationBBDD(String senSQL) {
		try {
			stmt=(Statement)openConn().createStatement();
			stmt.executeUpdate(senSQL);
			return closeConn();
		} catch (SQLException e) {
			System.err.println("Error en actualizar");
			return false;
		}
	}

}
