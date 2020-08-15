package com.devdojo.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.conn.ConexaoFactory;
import com.devdojo.jdbc.db.CompradorDB;

public class TestaConexao {
	
	public static void main(String[] args) {
		/*
		Connection con = ConexaoFactory.getConnection();
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		Comprador cmp = new Comprador("111.111.111-21", "Priscila");
		
		CompradorDB cmpDB = new CompradorDB();
		cmpDB.save(cmp);
		
	}

}
