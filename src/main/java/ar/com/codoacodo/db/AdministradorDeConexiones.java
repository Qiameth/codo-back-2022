package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	public static Connection getConnection() {
		String hosts = "127.0.0.1"; // es lo mismo que //localhost
		String port = "3306";
		String password = "root";
		String username = "root";
		String dbName = "22569"; //nombre de la base de datos


		Connection connection;

		// driver de conexión a la base de datos, el nombre es paquete.class
		String driverClassName = "com.mysql.cj.jdbc.Driver";

		// excepciones se ve en el siguiente nivel
		try {
			Class.forName(driverClassName);

			String url = "jdbc:mysql://" + hosts + ":"+ port +"/"+ dbName +"?serverTimeZone=UTC&useSSL=false";

			connection = DriverManager.getConnection(url, username, password);
		}catch(Exception e) {
			connection = null;
		}


		return null;
	}

}
