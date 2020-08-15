package com.devdojo.jdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.conn.ConexaoFactory;

public class CompradorDB {

	public void save(Comprador comprador) {
		
		String sql = "INSERT INTO agencia.comprador (compradorcpf, compradornome) VALUES ('"+comprador.getCpf()+"', '"+comprador.getNome()+"');";
		
		Connection conn = ConexaoFactory.getConnection();
		
		try {
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate(sql);//mudar o estado do banco e retorna a quantidade de linhas atualizadas
			//stmt.execute(sql);//quando não tem certeza do que vai executar até receber o sql
			//stmt.executeQuery(sql); //consulta com diversos resultados
			
			ConexaoFactory.close(conn, stmt);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
