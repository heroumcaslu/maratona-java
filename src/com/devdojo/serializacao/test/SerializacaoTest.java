package com.devdojo.serializacao.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.devdojo.serializacao.Aluno;
import com.devdojo.serializacao.Turma;

public class SerializacaoTest {

	public static void main(String[] args) {

		gravadorObjeto();

	}

	private static void gravadorObjeto() {

		Turma t = new Turma("Maratona Java");
		Aluno aluno = new Aluno(1L, "Lucas", "123456");
		aluno.setTurma(t);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"));) {

			oos.writeObject(aluno);
			// autoclosable
			// oos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void leitorObjeto() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"));) {

			Aluno aluno = (Aluno) ois.readObject();
			//O construtor não é chamado
			System.out.println(aluno);
			// autoclosable
			// ois.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
