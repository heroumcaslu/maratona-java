package com.devdojo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {

		File file = new File("Arquivo.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			BufferedReader br = new BufferedReader(new FileReader(file));) {
			
			bw.write("Escrevendo");
			bw.newLine();
			bw.write("e pulando linha");
			bw.flush();
			String line;
			while((line=br.readLine())!= null) {
				
				System.out.println(line);
				
			}
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		/*
		 * try {
		 * 
		 * FileWriter fw = new FileWriter(file, true);//true - append ao inves de
		 * sobrescrever adiciona ao final do arquivo. BufferedWriter bw = new
		 * BufferedWriter(fw); bw.write("Escrevendo no arquivo"); bw.newLine();
		 * bw.write("e quebrando linha"); bw.flush(); bw.close();
		 * 
		 * FileReader fr = new FileReader(file); BufferedReader br = new
		 * BufferedReader(fr); String line = null; while((line=br.readLine()) != null) {
		 * 
		 * System.out.println(line);
		 * 
		 * } br.close(); } catch (IOException e) { // TODO: handle exception
		 * e.printStackTrace(); }
		 */

	}

}
