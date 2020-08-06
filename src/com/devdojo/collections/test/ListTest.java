package com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.List;

import com.devdojo.collections.Celular;

public class ListTest {
	public static void main(String[] args) {

		// generics java 5
		List<Celular> celulares = new ArrayList<Celular>();
		List<Celular> celulares2 = new ArrayList<Celular>();
		
		Celular celular = new Celular("iPhone", "12344");
		Celular celularAndroid = new Celular("Pixel", "12345");
		Celular celularIOS = new Celular("iPhone", "12344");
		
		celulares.add(celular);
		celulares2.add(celularAndroid);
		
		celulares.clear();//O que estiver dentro vai ser eliminado mas a referência ainda vai existir
		
		celulares.addAll(celulares2);
		
		celulares.remove(0);// Retorna um boolean
		celulares.remove(celular);
		
		System.out.println(celulares.size());
		System.out.println(celulares.contains(celularIOS));
		
		for(Celular cellphone : celulares) {
			
			cellphone.getNome();
			//ConcurrentModificationException o foreach fecha o arraylist pra modificações não é possivel modificar dentro do foreach
			//no for StackOverflowException
		}

		System.out.println(celulares.get(1));//indice não existentes = IndexOutOfBoundException
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10); //autoboxing
		for(Integer num : numbers) {
			
			System.out.println(num);
			
		}
		
	}

}
