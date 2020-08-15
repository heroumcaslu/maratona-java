package com.devdojo.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.conn.ConexaoFactory;
import com.devdojo.jdbc.db.CompradorDB;

public class TestaConexao {

	public static void main(String[] args) {
		/*
		 * Connection con = ConexaoFactory.getConnection();
		 * 
		 * try { con.close(); } catch (SQLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		insert();

	}

	public static void insert() {

		Comprador cmp = new Comprador("111.111.111-21", "Priscila");

		CompradorDB.save(cmp);

	}

	public static void remove() {

		Comprador cmp = new Comprador();

		cmp.setId(1);
		CompradorDB.remove(cmp);

	}

	public static void update() {

		Comprador cmp = new Comprador(1, "MARIA", "000.000.000-01");

		cmp.setId(1);
		CompradorDB.update(cmp);

	}

}
