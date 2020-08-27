package com.devdojo.designpatterns.test;

import com.devdojo.designpatterns.Country;
import com.devdojo.designpatterns.Moeda;
import com.devdojo.designpatterns.MoedaFactory;

public class MoedaFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moeda moeda = MoedaFactory.criarMoeda(Country.BRAZIL);
		System.out.println(moeda.getSimbolo());

	}

}
