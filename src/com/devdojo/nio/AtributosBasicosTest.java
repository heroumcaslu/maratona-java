package com.devdojo.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class AtributosBasicosTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Date decemberFirst = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
		File file = new File("folder/arquivoRenomeado.txt");
		file.createNewFile();
		file.setLastModified(decemberFirst.getTime());
		System.out.println(file.lastModified());
		file.delete();
		
		Path path = Paths.get("folder/arquivoPath.txt");
		Files.createFile(path);
		FileTime fileTime = FileTime.fromMillis(decemberFirst.getTime());
		Files.setLastModifiedTime(path, fileTime);
		System.out.println(Files.getLastModifiedTime(path));
		Files.deleteIfExists(path);
		
		path = Paths.get("folder/arquivo.txt");
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isExecutable(path));
		
		// BasicFileAttributes, PosixFileAttributes, DosFileAttributes.
		
		BasicFileAttributes basicAttr = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println(basicAttr.creationTime());
		System.out.println(basicAttr.lastAccessTime());
		System.out.println(basicAttr.lastModifiedTime());
		System.out.println(basicAttr.isDirectory());
		System.out.println(basicAttr.isSymbolicLink());
		System.out.println(basicAttr.isRegularFile());
		
		// BasicFileAttributeView, PosixFileAttributeView, DosFileAttributeView, FileOwnerAttributeView, AclFileAttributeView
		
		FileTime lastModified = basicAttr.lastModifiedTime();
		FileTime created = basicAttr.creationTime();
		FileTime lastAccess = basicAttr.lastAccessTime();
		BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		basicView.setTimes(lastModified, lastAccess, created);
		basicAttr = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println("create: "+basicAttr.creationTime());
		System.out.println("lastAccess"+basicAttr.lastAccessTime());
		System.out.println("LastModified:"+basicAttr.lastModifiedTime());
		

	}

}
