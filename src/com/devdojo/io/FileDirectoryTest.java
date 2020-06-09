package com.devdojo.io;

import java.io.File;
import java.io.IOException;

public class FileDirectoryTest {

	public static void main(String[] args) {

		File directory = new File("folder");
		boolean dir = directory.mkdir();
		System.out.println("Diretorio criado" + dir);

		File file = new File(directory, "arquivo.txt");

		try {

			boolean newFile = file.createNewFile();
			System.out.println("Arquivo criado: " + newFile);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Renomeando arquivos
		File fileNewName = new File(directory, "arquivoRenomeado.txt");
		boolean renamed = file.renameTo(fileNewName);

		System.out.println("Renomeado: " + renamed);

		// Renomeando pastas
		File directoryRenamed = new File("folder2");
		boolean renamedDirectory = directory.renameTo(directoryRenamed);
		System.out.println("Dir renamed? "+renamedDirectory);

	}
	
	public static void buscarArquivos() {
		
		File file = new File("folder2");
		String[] list = file.list();
		
		for(String fileName : list) {
			
			System.out.println(fileName);
			
		}
		
		
	}

}
