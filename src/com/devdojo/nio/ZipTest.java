package com.devdojo.nio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTest {

	public static void main(String[] args) {
		
		Path dirZip = Paths.get("pasta/subpasta");
		Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
		Path zipFile = dirZip.resolve("arquivo.zip");
		
		try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile())); 
			DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){
			
			for(Path path : stream) {
				
				ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
				zip.putNextEntry(zipEntry);
				FileInputStream fileInput = new FileInputStream(path.toFile());
				//BufferedInputStream bf = new BufferedInputStream(fileInput);
				byte[] buff = new byte[2048];
				int bytesRead;
				//while((bytesRead = bf.read(buff)) > 0)
				while((bytesRead = fileInput.read(buff)) > 0) {
					
					zip.write(buff, 0, bytesRead);
					
				}
				zip.flush();
				zip.closeEntry();
				fileInput.close();
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
