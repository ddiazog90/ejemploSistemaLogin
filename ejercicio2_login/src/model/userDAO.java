package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userDAO implements settings{
	private user user;
	
   //Para realizar operaciones
	public userDAO(model.user user) {
		super();
		this.user = user;
	}

	//Se lo utilizara para realizar consultas
	public userDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean updateUser(int option) {
		/**
		 * option = 1    INSERT
		 * option = 2    UPDATE
		 * option = 3    DELETE
		 */
		boolean estate=switch(option) {
		case 1->conn.setQuery(String.format("INSERT INTO empresa1.user VALUES(null,'%s','%s',%d);", user.getEmail(),user.getPSW(),user.getRoll()));
		case 2->conn.setQuery("");
		case 3->conn.setQuery("");
		default->false;
		};
		return estate;
	}
	
	public List<user> loadAllUsers() throws SQLException{
		List<user>users=new ArrayList();
		ResultSet res=conn.getQuery("SELECT * FROM empresa1.user;");
		while(res.next()) {
			users.add(new user(res.getInt(1),		//id_user
					           res.getString(2),	//email
					           res.getString(3),	//psw
					           res.getInt(4)));		//roll
		}
		conn.closeConn();
		return users;
	}
}
