package com.devdojo.jdbc.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;

import com.devdojo.jdbc.classes.Comprador;
import com.devdojo.jdbc.classes.MyRowSetListener;
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

		try {

			Statement stmt = conn.createStatement();
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

		String sql = "UPDATE agencia.comprador SET cpf = '" + comprador.getCpf() + "' nome = '" + comprador.getNome()
				+ "' WHERE idcomprador ='" + comprador.getId() + "'";

		Connection conn = ConexaoFactory.getConnection();

		try {

			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConexaoFactory.close(conn, stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void updatePrepared(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {

			System.out.println("Não foi possivel atualizar");
			return;

		}

		String sql = "UPDATE agencia.comprador SET cpf = ? nome = ? WHERE idcomprador = ?";

		Connection conn = ConexaoFactory.getConnection();

		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, comprador.getCpf());
			ps.setString(2, comprador.getNome());
			ps.setInt(3, comprador.getId());
			
			ps.executeUpdate();
			
			ConexaoFactory.close(conn, ps);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void updateRowSet(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {

			System.out.println("Não foi possivel atualizar");
			return;

		}

		//String sql = "UPDATE agencia.comprador SET cpf = ? nome = ? WHERE idcomprador = ?";
		String sql = "SELECT * FROM agencia.comprador WHERE idcomprador = ?";
		
		JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();

		jrs.addRowSetListener(new MyRowSetListener());
		
		try {
			
			jrs.setCommand(sql);
			
			jrs.setInt(1, comprador.getId());
			
			jrs.execute();
			
			jrs.next();
			
			jrs.updateString("compradornome", "William");
			jrs.updateRow();
			
			ConexaoFactory.close(jrs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//CachedRowSet
	public static void updateRowSetCachedRS(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {

			System.out.println("Não foi possivel atualizar");
			return;

		}


		String sql = "SELECT * FROM agencia.comprador WHERE idcomprador = ?";
		
		CachedRowSet crs = ConexaoFactory.getRowSetConnectionCached();
				
		try {
			
			crs.setCommand(sql);
			
			crs.setInt(1, comprador.getId());
			
			crs.execute();
			
			crs.next();
			
			crs.updateString("compradornome", "WWW");
			crs.updateRow();
			//Thread.sleep(8000);
			crs.acceptChanges();

			//| InterruptedException 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Comprador> selectAll() {

		String sql = "SELECT idcomprador, compradorcpf, compradornome FROM agencia.comprador;";

		Connection conn = ConexaoFactory.getConnection();

		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			List<Comprador> compradores = new ArrayList<Comprador>();

			while (rs.next()) {

				Integer id = rs.getInt("idcomprador");// ou indice que começa em 1
				String cpf = rs.getString("compradorcpf");
				String nome = rs.getString(3);// comprador nome

				compradores.add(new Comprador(id, cpf, nome));

			}

			ConexaoFactory.close(conn, stmt, rs);

			return compradores;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void testTypeScroll() {

		String sql = "SELECT idcomprador, compradorcpf, compradornome FROM agencia.comprador;";

		Connection conn = ConexaoFactory.getConnection();

		try {

			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {

				Integer id = rs.getInt("idcomprador");// ou indice que começa em 1
				String cpf = rs.getString("compradorcpf");
				String nome = rs.getString(3);// comprador nome
				System.out.println("Ultima linha: " + new Comprador(id, cpf, nome));
				System.out.println("Numero ultima linha: " + rs.getRow());

			}
			// Movendo o cursor
			rs.first();// retornando para a primeira linha retorna um booleano
			rs.absolute(1);// diretamente para a linha informada
			rs.relative(-1);// mover baseado na linha atual ex linha 4 -1 linha 3
			rs.isLast();
			rs.isAfterLast();
			rs.isFirst();
			rs.isBeforeFirst();

			// move pro fim
			rs.afterLast();

			// executa ao contrario
			while (rs.previous()) {

				Integer id = rs.getInt("idcomprador");// ou indice que começa em 1
				String cpf = rs.getString("compradorcpf");
				String nome = rs.getString(3);// comprador nome
				System.out.println(new Comprador(id, cpf, nome));

			}

			ConexaoFactory.close(conn, stmt, rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Comprador> selectByName(String nome) {

		String sql = "SELECT idcomprador, compradorcpf, compradornome FROM agencia.comprador compradornome LIKE '"
				+ nome + "';";

		Connection conn = ConexaoFactory.getConnection();

		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			List<Comprador> compradores = new ArrayList<Comprador>();

			while (rs.next()) {

				Integer id = rs.getInt("idcomprador");// ou indice que começa em 1
				String cpf = rs.getString("compradorcpf");
				String name = rs.getString(3);// comprador nome

				compradores.add(new Comprador(id, cpf, name));

			}

			ConexaoFactory.close(conn, stmt, rs);

			return compradores;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public static List<Comprador> selectByNameCallable(String nome) {

		String sql = "CALL sp_getCompradoresPorNome( ? )";

		Connection conn = ConexaoFactory.getConnection();

		try {

			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, nome);
			
			ResultSet rs = cs.executeQuery(sql);

			List<Comprador> compradores = new ArrayList<Comprador>();

			while (rs.next()) {

				Integer id = rs.getInt("idcomprador");// ou indice que começa em 1
				String cpf = rs.getString("compradorcpf");
				String name = rs.getString(3);// comprador nome

				compradores.add(new Comprador(id, cpf, name));

			}

			ConexaoFactory.close(conn, cs, rs);

			return compradores;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public static List<Comprador> selectByNamePreparedStatement(String nome) {

		String sql = "SELECT idcomprador, compradorcpf, compradornome FROM agencia.comprador compradornome LIKE ?";

		Connection conn = ConexaoFactory.getConnection();

		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nome);
			
			ResultSet rs = ps.executeQuery();

			List<Comprador> compradores = new ArrayList<Comprador>();

			while (rs.next()) {

				Integer id = rs.getInt("idcomprador");// ou indice que começa em 1
				String cpf = rs.getString("compradorcpf");
				String name = rs.getString(3);// comprador nome

				compradores.add(new Comprador(id, cpf, name));

			}

			ConexaoFactory.close(conn, ps, rs);

			return compradores;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public static List<Comprador> selectByNameRowSet(String nome) {

		String sql = "SELECT idcomprador, compradorcpf, compradornome FROM agencia.comprador compradornome LIKE ?";

		
		//não pode utilizar comandos update, insert ou delete, tem que alterar o rs
		JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
		
		jrs.addRowSetListener(new MyRowSetListener());

		try {

			jrs.setCommand(sql);
			
			//PreparedStatement ps = conn.prepareStatement(sql);
			jrs.setString(1, nome);
			
			jrs.execute();

			List<Comprador> compradores = new ArrayList<Comprador>();

			while (jrs.next()) {

				Integer id = jrs.getInt("idcomprador");// ou indice que começa em 1
				String cpf = jrs.getString("compradorcpf");
				String name = jrs.getString(3);// comprador nome

				compradores.add(new Comprador(id, cpf, name));

			}

			ConexaoFactory.close(jrs);

			return compradores;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void selectMetadata() {

		String sql = "SELECT * FROM agencia.comprador;";

		Connection conn = ConexaoFactory.getConnection();

		try {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();

			rs.next();

			int qtdColunas = rsmd.getColumnCount();
			System.out.println("Colunas: " + qtdColunas);

			for (int i = 1; i <= qtdColunas; i++) {

				System.out.println("Tabela: " + rsmd.getTableName(i));
				System.out.println("Nome coluna: " + rsmd.getColumnName(i));
				System.out.println("Tamanho da coluna: " + rsmd.getColumnDisplaySize(i));

			}

			ConexaoFactory.close(conn, stmt, rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void checkDriverStatus() {

		Connection conn = ConexaoFactory.getConnection();

		try {

			DatabaseMetaData dbmd = conn.getMetaData();

			// MOVER O CURSOR PARA FRENTE
			if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {

				System.out.println("suporta Type forward only");
				// UPDATE COM RESULTSET ABERTO
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {

					System.out.println("também Suporta concurupdatable");

				}

			}

			// MOVER O CURSOR PARA FRENTE E PARA TRÁS OU PARAR EM UMA POSIÇÃO qualque
			// mudança não afeta o banco
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {

				System.out.println("suporta Type forward only");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {

					System.out.println("também Suporta concurupdatable");

				}

			}

			// MOVE PARA FRENTE E TRÁS MAS AS MUDANÇAS SÃO REFLETIDAS NO BANCO
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {

				System.out.println("suporta Type forward only");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {

					System.out.println("também Suporta concurupdatable");

				}

			}
			ConexaoFactory.close(conn);

		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

	public static void updateNomesToLower() {

		String sql = "SELECT idcomprador, compradorcpf, compradornome FROM agencia.comprador;";

		Connection conn = ConexaoFactory.getConnection();

		try {

			DatabaseMetaData dbmd = conn.getMetaData();
			
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println(dbmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
			
			while (rs.next()) {

				//update no banco não reflete no resultset
				rs.updateString("compradornome", rs.getString("nome").toLowerCase());
				
				//rs.cancelRowUpdates();//tem que ser antes do update row
				
				rs.updateRow();
			
			}
			
			rs.absolute(2);
			String nome = rs.getString("nome");
			rs.moveToInsertRow();
			rs.updateString("nome", nome.toUpperCase());
			rs.updateString("cpf", "999.999.999-20");
			rs.insertRow();
			rs.moveToCurrentRow();
			
			rs.absolute(7);
			rs.deleteRow();

			ConexaoFactory.close(conn, stmt, rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
