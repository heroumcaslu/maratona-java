package com.devdojo.designpatterns.test;

import com.devdojo.designpatterns.SingletonAirplaneEnum;

public class SingletonEnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Melhor forma, thread safe e não consegue usar reflexion
		SingletonAirplaneEnum.agendarAssento("1A");
		SingletonAirplaneEnum.agendarAssento("1A");
		
	}

}
