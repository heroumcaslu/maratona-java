package com.devdojo.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Path p1 = Paths.get("home/lucas/Documents", "filesjava");
		Path p2 = Paths.get("home/lucas/Documents", "filesjava");
		Path p3 = Paths.get("home", "lucas/Documents", "filesjava");
		Path p4 = Paths.get("home", "lucas", "Documents", "filesjava");

		System.out.println(p4.toAbsolutePath());

		File file = p4.toFile();
		Path p5 = file.toPath();
		Path path1 = Paths.get("directory\\file.txt");
		Path path2 = Paths.get("directory\\subdirectory\\subdirectory");
		Path arquivo = Paths.get("directory\\subdirectory\\file.txt");
		try {
			
			if (Files.notExists(path1)) {
				Files.createDirectory(path1.getParent());
			}
			
			if (Files.notExists(path2)) {
				
				Files.createDirectories(path2);
				
			}
			
			if(Files.notExists(arquivo)) {
				
				Files.createFile(arquivo);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Path source = Paths.get("directory\\file.txt");
		Path target = Paths.get("directory\\fileCopy.txt");
		try {
			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			Files.deleteIfExists(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
