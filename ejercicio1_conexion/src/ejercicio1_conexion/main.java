package ejercicio1_conexion;

import java.sql.ResultSet;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		connection conn=new connection();
//		conn.openConn();

		query query=new query();
		//query.operationBBDD("INSERT INTO empresa1.position VALUES(null,'Contador',600);");
	    //query.operationBBDD("UPDATE empresa1.position SET salary=620 WHERE id_position=1;");
	
		String description="Guardia";
		String salary="450.0";
		
		String sentSql=String.format("INSERT INTO empresa1.position VALUES(null,'%s',%s);", description,salary);
		query.operationBBDD(sentSql);
		//System.out.println(sentSql);
		ResultSet res=query.queryBBDD("SELECT * FROM empresa1.position;");
		
		try {
			while(res.next()) {
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getDouble(3));
			}
			query.closeConn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
