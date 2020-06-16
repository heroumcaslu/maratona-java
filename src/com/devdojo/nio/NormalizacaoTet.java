package com.devdojo.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTet {

	public static void main(String[] args) {
		
		String projectDirectory = "JavaOnline\\home\\lucas\\dev";
		String arquivoTxt = "..\\..\\arquivo.txt";
		Path path = Paths.get(projectDirectory, arquivoTxt);
		
		//normalize remove os ../
		System.out.println(path.normalize());
		
		Path path2 = Paths.get("home/./lucas/./dev");
		
		System.out.println(path2.normalize());
		
		
	}
	
}
