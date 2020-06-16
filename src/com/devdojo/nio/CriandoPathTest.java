package com.devdojo.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
	
	public static void main(String[] args) {
		Path p1 = Paths.get("home/lucas/Documents","filesjava");
		Path p2 = Paths.get("home/lucas/Documents","filesjava");
		Path p3 = Paths.get("home","lucas/Documents","filesjava");
		Path p4 = Paths.get("home","lucas","Documents","filesjava");
	}

}
