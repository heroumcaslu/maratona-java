package com.devdojo.classesinternas.test;

public class ClassesInternasTest {

	private String nome = "Lucas Silva";

	class Interna {

		// Como se fosse um método, tem acessoa todos os atributos da externa
		public void verClasseExtern() {

			System.out.println(nome);
			System.out.println(this);//classe interna
			System.out.println(ClassesInternasTest.this);//classe externa

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassesInternasTest externa = new ClassesInternasTest();
		ClassesInternasTest.Interna in = externa.new Interna();
		
		ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
		
		in.verClasseExtern();
		in2.verClasseExtern();

	}

}

/*
class Externa {

	private String nome = "Lucas Silva";

	class Interna {

		// Como se fosse um método, tem acessoa todos os atributos da externa
		public void verClasseExtern() {

			System.out.println(nome);

		}

	}

}
*/
