package com.devdojo.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("arquivo.txt");

		try {
			if (f.createNewFile()) {

				System.out.println("Arquivo criado");

			} else if (f.exists()) {

				System.out.println("Já existe");
				System.out.println(f.getPath());
				System.out.println(f.getAbsolutePath());
				System.out.println(f.isDirectory());
				System.out.println(f.isHidden());
				System.out.println(new Date(f.lastModified()));
				
				

			} else if (f.delete()) {

				System.out.println("Arquivo deletado");

			} else if (f.canRead()) {
				
				System.out.println("Tem permissão de leitura");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
