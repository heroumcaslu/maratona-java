package com.devdojo.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {

	// java.sql = Connection, Statement, ResultSet
	// DriverManager
	public static Connection getConnection() {

		// eliminar warning = ?useSSL=false
		String url = "jdbc:mysql://localhost:3306/agencia";
		String user = "root";
		String password = "root";

		try {

			// Antes do java 4
			//Class.forName("com.mysql.jdbc.Driver");

			// Connection conn = DriverManager.getConnection(url, user, password);
			return DriverManager.getConnection(url, user, password);

			//| ClassNotFoundException 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void close(Connection con) {

		try {

			if (con != null)
				con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void close(Connection conn, Statement stmt) {

		close(conn);
		try {

			if (stmt != null)
				stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
