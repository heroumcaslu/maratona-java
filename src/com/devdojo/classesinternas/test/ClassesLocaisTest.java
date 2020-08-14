package com.devdojo.classesinternas.test;

public class ClassesLocaisTest {

	private String nome = "William";
	
	public void fazAlgumaCoisa(String test) {
		
		String sobrenome = "Suane";
		
		//só aceita o modificador final e abstract (igual a atributos de metodos)
		class Interna {
			
			//classe interna não usa atributos locais de metodos a não ser que sejam finais no java 7
			//java 8 - ou ela é final ou ela é efetivamente final (considerado final quando não é mudado)
			//só é acessivel dentro do método
			public void imprimeNomeExterno() {
				System.out.println(nome);
				System.out.println(sobrenome);
			}
		}
		
		Interna in = new Interna();
		in.imprimeNomeExterno();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassesLocaisTest externa = new ClassesLocaisTest();
		

	}

}
