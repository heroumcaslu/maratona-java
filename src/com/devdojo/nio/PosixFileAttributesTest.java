package com.devdojo.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest {
	
	public static void main(String[] args) throws IOException {
		
		//Alterando permissão em sistemas baseados em Unix
		//permissão no linux drwxrwxrwx d-owner-group-others (d = directory)
		//--- 0 --x 1 -w- 2 -wx 3 r-- 4 r-x 5 rw- 6 rwx 7
		Path path = Paths.get("/home/lucas/dev/file");
		PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
		System.out.println(posix.permissions());
		
		System.out.println("Alterando as permissões");
		//Forma 1
		//PosixFileAttributeView view = Files.getFileAttributeView(path, PosixFileAttributeView.class);
		//view.setPermissions(perms);
		//Forma 2
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-rw-rw-");
		Files.setPosixFilePermissions(path, perms);
		posix = Files.readAttributes(path, PosixFileAttributes.class);
		
		System.out.println(posix.permissions());
		
	}

}
