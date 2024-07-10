package ejercicio1_conexion;

public interface settings {
	public final String ip="localhost",//"localhost",//172.17.42.52
						port="3306",
						nameBbdd="empresa",
						user="root",
						psw="root",
						driver="com.mysql.cj.jdbc.Driver";
	public default String getURL() {
		return String.format("jdbc:mysql://%s:%s/%s?user=%s&password=%s&useSSL=false&serverTimezone=UTC", 
				                           ip,port,nameBbdd,user,psw);
	}

}
