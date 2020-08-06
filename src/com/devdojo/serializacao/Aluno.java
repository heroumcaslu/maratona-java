package com.devdojo.serializacao;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Aluno extends Pessoa implements Serializable {

	private Long id;
	private String nome;
	// transient = não serializado
	private transient String password;
	private static String nomeEscola = "DevDojo";
	//ou serializa ou coloca transient ou implementa os metodos
	private Turma turma;

	public Aluno(Long id, String nome, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getNomeEscola() {
		return nomeEscola;
	}

	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", password=" + password + ", nomeEscola=" + nomeEscola
				+ ", turma=" + turma + "]";
	}
	
	//metodo chamado quando a turma não é serializada
	private void writeObject(ObjectOutputStream oos) {
		
		try {
			
			oos.defaultWriteObject();
			oos.writeUTF(turma.getNome());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	private void readObject(ObjectInputStream ois) {
		
		try {
			
			ois.defaultReadObject();
			turma = new Turma(ois.readUTF());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
