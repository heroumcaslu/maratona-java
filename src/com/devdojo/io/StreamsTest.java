package com.devdojo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsTest {

	public static void main(String[] args) {

	}

	@SuppressWarnings("unused")
	private static void gravador() {

		byte[] dados = { 65, 66, 67, 68, 69, 70 };

		// bool append false(padrão) sobrescreve true adiciona
		try (FileOutputStream gravador = new FileOutputStream("/pasta/stream.txt")) {

			for (Byte b : dados) {

				gravador.write(b);
				gravador.flush();
				// gravador.write(dados);
				System.out.println("Dados gravados com sucesso");

			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	//Buffered
	@SuppressWarnings("unused")
	private static void gravadorTunado() {

		byte[] dados = { 65, 66, 67, 68, 69, 70 };

		// bool append false(padrão) sobrescreve true adiciona
		try (BufferedOutputStream gravadorBuffered = new BufferedOutputStream(new FileOutputStream("/pasta/stream.txt"))) {

			for (Byte b : dados) {

				gravadorBuffered.write(b);
				gravadorBuffered.flush();
				System.out.println("Dados gravados com sucesso");

			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unused")
	private static void leitor() {

		try (FileInputStream leitor = new FileInputStream("/pasta/stream.txt")) {

			int leitura;
			while((leitura = leitor.read()) != -1) {
				
				byte b = (byte) leitura;
				System.out.println(" "+b);
				
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("unused")
	private static void leitorTunado() {

		try (BufferedInputStream leitorBuffered = new BufferedInputStream(new FileInputStream("/pasta/stream.txt"))) {

			int leitura;
			while((leitura = leitorBuffered.read()) != -1) {
				
				byte b = (byte) leitura;
				System.out.println(" "+b);
				
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
