package com.devdojo.jdbc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.devdojo.jdbc.classes.Carro;
import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.conn.ConexaoFactory;

public class CarroDAO {

	public static void save(Carro carro) {

		String sql = "INSERT INTO agencia.carro (nome, placa, compradorid) VALUES (?, ?, ?);";

		try (Connection conn = ConexaoFactory.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, carro.getNome());
			pstmt.setString(2, carro.getPlaca());
			pstmt.setInt(3, carro.getComprador().getId());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void remove(Carro Carro) {

		if (Carro == null || Carro.getId() == null) {

			System.out.println("Não foi possivel excluir");
			return;

		}

		String sql = "DELETE FROM agencia.carro WHERE idcarro = ?";

		try (Connection conn = ConexaoFactory.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setInt(1, Carro.getId());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void update(Carro Carro) {

		if (Carro == null || Carro.getId() == null) {

			System.out.println("Não foi possivel atualizar");
			return;

		}

		String sql = "UPDATE agencia.carro SET carroplaca = ?, carronome = ? WHERE idCarro = ?";

		try (Connection conn = ConexaoFactory.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, Carro.getPlaca());
			pstmt.setString(2, Carro.getNome());
			pstmt.setInt(3, Carro.getId());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Carro> selectAll() {

		String sql = "SELECT idcarro, carroplaca, carronome, idcomprador FROM agencia.Carro;";

		try (Connection conn = ConexaoFactory.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();) {

			List<Carro> carros = new ArrayList<Carro>();

			while (rs.next()) {

				carros.add(new Carro(rs.getInt("idcarro"), rs.getString("carroplaca"), rs.getString("carronome"), 
						CompradorDAO.selectById(rs.getInt("idcomprador"))));

			}

			return carros;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public static List<Carro> selectByName(String nome) {

		String sql = "SELECT idcarro, carroplaca, carronome, idcomprador FROM agencia.Carro WHERE carronome LIKE ?";

		try (Connection conn = ConexaoFactory.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, nome);

			ResultSet rs = pstmt.executeQuery();

			List<Carro> carros = new ArrayList<Carro>();

			while (rs.next()) {

				carros.add(new Carro(rs.getInt("idcarro"), rs.getString("carroplaca"), rs.getString("carronome"), 
						CompradorDAO.selectById(rs.getInt("idcomprador"))));

			}

			ConexaoFactory.close(conn, pstmt, rs);

			return carros;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static Carro selectById(Integer id) {

		String sql = "SELECT carroplaca, carronome, idcomprador FROM agencia.carro where id = ?";
		
		Carro carro = null;

		try(Connection conn = ConexaoFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();

			//nome, placa, compradorid
			while (rs.next()) {

				carro = new Carro(id, rs.getString("carroplaca"), rs.getString("carronome"), 
						CompradorDAO.selectById(rs.getInt("idcomprador")));

			}
			
			ConexaoFactory.close(conn, pstmt, rs);

			return carro;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
