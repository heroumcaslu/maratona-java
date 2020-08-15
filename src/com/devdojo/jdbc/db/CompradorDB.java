package com.devdojo.jdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.conn.ConexaoFactory;

public class CompradorDB {

	public static void save(Comprador comprador) {

		String sql = "INSERT INTO agencia.comprador (compradorcpf, compradornome) VALUES ('" + comprador.getCpf()
				+ "', '" + comprador.getNome() + "');";

		Connection conn = ConexaoFactory.getConnection();

		try {

			Statement stmt = conn.createStatement();

			stmt.executeUpdate(sql);// mudar o estado do banco e retorna a quantidade de linhas atualizadas
			// stmt.execute(sql);//quando não tem certeza do que vai executar até receber o
			// sql
			// stmt.executeQuery(sql); //consulta com diversos resultados

			ConexaoFactory.close(conn, stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void remove(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {

			System.out.println("Não foi possivel excluir");
			return;

		}

		String sql = "DELETE FROM agencia.comprador WHERE idcomprador ='" + comprador.getId() + "'";

		Connection conn = ConexaoFactory.getConnection();

		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConexaoFactory.close(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void update(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {

			System.out.println("Não foi possivel atualizar");
			return;

		}

		String sql = "UPDATE agencia.comprador SET cpf = '"+comprador.getCpf()+"' nome = '"+comprador.getNome()+"' WHERE idcomprador ='" + comprador.getId() + "'";

		Connection conn = ConexaoFactory.getConnection();

		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConexaoFactory.close(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
