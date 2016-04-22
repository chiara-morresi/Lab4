package it.polito.tdp.anagrammi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnagrammiDAO {
	
	
	public boolean ifEsistente(String s) {
		Connection conn = BDConnect.getConnection();
		String sql="select nome froma parola where nome=?";
		PreparedStatement st;
		try {
			st= conn.prepareStatement(sql);
			st.setString(1, s);
			ResultSet res = st.executeQuery();
			
			if(res.next())
			{
				res.close();
				conn.close();
				return true;
			}
			else
			{
				res.close();
				conn.close();
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}

}
