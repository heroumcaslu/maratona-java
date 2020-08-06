package com.devdojo.collections.test;

import com.devdojo.collections.Celular;

public class EqualsTest {
	
	public static void main(String[] args) {
		
		//Pool
		String nomew = "Lucas Herom";
		//Pool
		String nomex = "Lucas Herom";

		//Pool
		Integer intw = 5;
		//Heap
		Integer intx = new Integer(5);
		
		//true
		System.out.println(nomew == nomex);
		//false
		System.out.println(intw == intx);
		//true
		System.out.println(intw.equals(intx));
		
		Celular cx = new Celular("iPhone", "1234");
		Celular xc = new Celular("iPhone", "1234");
		
		System.out.println(cx.equals(xc));
		
		
	}

}
