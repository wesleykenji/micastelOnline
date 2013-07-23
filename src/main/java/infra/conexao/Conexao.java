package infra.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static final String dataBase = "dbMicastel";

	public static Connection criarConexao(){
		String url = "jdbc:h2:data/" + dataBase + ";IFEXISTS=TRUE;";
		String user = "sa";
		String password = "";
		Connection conexao = null;
		
		try {
			Class.forName("org.h2.Driver");
			conexao = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		return conexao;
	}
}
