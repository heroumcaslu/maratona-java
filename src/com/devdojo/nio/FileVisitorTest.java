package com.devdojo.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class findAllBkps extends SimpleFileVisitor<Path> {

	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

		if (file.getFileName().toString().endsWith(".bkp")) {

			System.out.println(file.getFileName());

		}
		return FileVisitResult.CONTINUE;

	}

}

public class FileVisitorTest {

	public static void main(String[] args) throws IOException {

		Files.walkFileTree(Paths.get("folder"), new findAllBkps());
		Files.walkFileTree(Paths.get("folder"), new PrintDirs());

	}

}

class PrintDirs extends SimpleFileVisitor<Path> {

	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {

		System.out.println("pre: " + dir);
		if(dir.getFileName().toString().equals("subsubpasta")) {
			
			//return FileVisitResult.TERMINATE;
			//return FileVisitResult.SKIP_SUBTREE;
			return FileVisitResult.SKIP_SIBLINGS;
			
		}
		return FileVisitResult.CONTINUE;

	}

	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

		System.out.println(file.getFileName());

		return FileVisitResult.CONTINUE;

	}

	public FileVisitResult visitFileFailed(Path file, BasicFileAttributes attrs) {

		return FileVisitResult.CONTINUE;

	}

	public FileVisitResult postVisitDirectory(Path dir, IOException exc) {

		System.out.println("post: " + dir);
		return FileVisitResult.CONTINUE;

	}

}
