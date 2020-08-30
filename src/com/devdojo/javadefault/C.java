package com.devdojo.javadefault;

import com.devdojo.javadefault.interfaces.*;

public class C extends D implements A, B {
	
	public static void main(String[] args) {
		//Uma classe tem prioridade sobre a interface
		//Subinterface o metodo mais especifico é implementado
		//Se for ambiguo tera que especificar
		new C().oi();
	}
	
	//Especificando
	public void oi() {
		
		B.super.oi();
		
	}

}
