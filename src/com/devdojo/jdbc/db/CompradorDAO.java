package com.devdojo.jdbc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.conn.ConexaoFactory;

public class CompradorDAO {
	
	public static void save(Comprador comprador) {

		String sql = "INSERT INTO agencia.comprador (compradorcpf, compradornome) VALUES (?, ?);";

		try(Connection conn = ConexaoFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, comprador.getCpf());
			pstmt.setString(2, comprador.getNome());
			
			pstmt.executeUpdate();

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

		String sql = "DELETE FROM agencia.comprador WHERE idcomprador = ?";

		try(Connection conn = ConexaoFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, comprador.getId());
			
			pstmt.executeUpdate();

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

		String sql = "UPDATE agencia.comprador SET cpf = ?, nome = ? WHERE idcomprador = ?";

		try(Connection conn = ConexaoFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, comprador.getCpf());
			pstmt.setString(2, comprador.getNome());
			pstmt.setInt(3, comprador.getId());
			
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static List<Comprador> selectAll() {

		String sql = "SELECT idcomprador, compradorcpf, compradornome FROM agencia.comprador;";

		try(Connection conn = ConexaoFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();) {

			List<Comprador> compradores = new ArrayList<Comprador>();

			while (rs.next()) {

				compradores.add(new Comprador(rs.getInt("idcomprador"), rs.getString("compradorcpf"), rs.getString(3)));

			}

			return compradores;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	
	public static List<Comprador> selectByName(String nome) {

		String sql = "SELECT idcomprador, compradorcpf, compradornome FROM agencia.comprador compradornome LIKE ?";

		try(Connection conn = ConexaoFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, nome);
			
			ResultSet rs = pstmt.executeQuery();
			
			List<Comprador> compradores = new ArrayList<Comprador>();

			while (rs.next()) {

				compradores.add(new Comprador(rs.getInt("idcomprador"), rs.getString("compradorcpf"), rs.getString("compradornome")));

			}
			
			ConexaoFactory.close(conn, pstmt, rs);

			return compradores;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
