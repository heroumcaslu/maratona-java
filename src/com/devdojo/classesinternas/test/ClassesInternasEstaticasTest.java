package com.devdojo.classesinternas.test;

class Externa {

	// membros estáticos, não consegue acessar atributos externos a não ser que seja
	// estático também.
	static class Interna {

		public void imprimir() {

			System.out.println("oi");

		}

	}

}

public class ClassesInternasEstaticasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Externa.Interna teste = new Externa.Interna();
		teste.imprimir();
		
		Interna2 test2 = new Interna2();
		
		test2.imprimir();

	}

	static class Interna2 {

		public void imprimir() {

			System.out.println("Interna 2");

		}

	}

}
