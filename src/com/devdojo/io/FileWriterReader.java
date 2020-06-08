package com.devdojo.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
	
	public static void main(String[] args) {
		
		File file = new File("Arquivo.txt");
		try(FileWriter fw = new FileWriter(file);
			FileReader fr = new FileReader(file)) {
			
			fw.write("Escrevendo no arquivo\n e quebrando linha");
			fw.flush();
			fw.close();
			
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("tamanho"+size);
			
			for(char c: in) {
				
				System.out.println(c);
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*try {
			
			FileWriter fw = new FileWriter(file, true);//true - append ao inves de sobrescrever adiciona ao final do arquivo.
			fw.write("Escrevendo no arquivo\n e quebrando linha");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(file);
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("tamanho"+size);
			
			for(char c: in) {
				
				System.out.println(c);
				
			}
			fr.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		
	}

}
