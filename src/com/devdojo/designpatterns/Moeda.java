package com.devdojo.designpatterns;

public interface Moeda {
	
	String getSimbolo();

}

class Real implements Moeda {

	@Override
	public String getSimbolo() {
		// TODO Auto-generated method stub
		return "R$";
	}
	
}

class USDollar implements Moeda {

	@Override
	public String getSimbolo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
