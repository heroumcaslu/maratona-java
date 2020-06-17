package com.devdojo.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
	
	public static void main(String[] args) {
		
		Path dir = Paths.get("home\\lucas");
		Path arquivo = Paths.get("dev\\arquivo.txt");
		
		Path result = dir.resolve(arquivo);
		
		Path abs = Paths.get("/home/lucas");
		Path relative = Paths.get("dev");
		Path file = Paths.get("file.txt");
		
		// \home\lucas\dev
		System.out.println(abs.resolve(relative));
		// \home\lucas\file.txt
		System.out.println(abs.resolve(file));
		// \home\lucas
		System.out.println(relative.resolve(abs));
		// dev\file.txt
		System.out.println(relative.resolve(file));
		// \home\lucas
		System.out.println(file.resolve(abs));
		// file.txt\dev
		System.out.println(file.resolve(relative));
		
		
	}

}
