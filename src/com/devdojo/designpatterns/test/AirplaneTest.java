package com.devdojo.designpatterns.test;

import com.devdojo.designpatterns.Airplane;

public class AirplaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		agendarAssento("1A");
		agendarAssento("1A");

	}
	
	private static void agendarAssento(String assento) {
		
		Airplane a = new Airplane();
		a.bookAssento(assento);
		
	}

}
