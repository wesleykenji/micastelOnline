package infra.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) {
		
		try {
			
			Connection con = Conexao.criarConexao();
			System.out.println("con: " +con);
//			String sql = "Insert into Editora (nome,email) values (?,?)";
//			PreparedStatement st = null;//con.prepareStatement(sql);
//			st.setString(1, "teste2");
//			st.setString(2, "teste2PreparedStatement");
//			st.executeUpdate();
			
//			String busca = "Select * from Editora";
//			st = con.prepareStatement(busca);
//			ResultSet rs = st.executeQuery();
//			if(rs.first()){
//				
//				do{
//					System.out.println("nome: " + rs.getString("nome"));
//					System.out.println("email: " + rs.getString("email"));
//				}while(rs.next());
//			}
			
			con.close();
		}  catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
