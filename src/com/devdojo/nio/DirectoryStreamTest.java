package com.devdojo.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {
	
	public static void main(String[] args) {
		
		Path dir = Paths.get("folder");
		
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			
			for(Path path : stream) {
				
				System.out.println(path.getFileName());
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
