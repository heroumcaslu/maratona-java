package com.devdojo.classes.tests;

import com.devdojo.classes.Student;

public class StudentsTests {
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		//passando argumentos
		//argumentos primitivos é passada uma cópia do valor e reference types é passado a referência ao objeto
		std.setIdade(15);
		std.setNome("João");
		std.setMatricula("70170393437");
		
	}

}
