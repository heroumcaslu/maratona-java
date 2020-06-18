package com.devdojo.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizandoPaths {
	
	public static void main(String[] args) {
		
		Path p = Paths.get("/home/lucas");
		Path classe = Paths.get("/home/lucas/java/pessoa");
		
		Path pathToClass = p.relativize(classe);
		// o contrario do resolve
		System.out.println(pathToClass);
		
		Path abs1 = Paths.get("/home/lucas");
		Path abs2 = Paths.get("/usr/local");
		Path abs3 = Paths.get("/home/lucas/java/Pessoa.java");
		Path rel1 = Paths.get("tmp");
		Path rel2 = Paths.get("tmp/Funcionario.java");
		
		System.out.println(abs1.relativize(abs3));
		System.out.println(abs3.relativize(abs1));
		System.out.println(abs1.relativize(abs2));
		System.out.println(rel1.relativize(rel2));
		System.out.println(abs1.relativize(rel1));//illegal argument exception
		
	}

}
