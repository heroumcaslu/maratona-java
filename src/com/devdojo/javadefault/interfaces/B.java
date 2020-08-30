package com.devdojo.javadefault.interfaces;

public interface B extends A {

	default void oi() {

		System.out.println("Dentro oi B");

	}

}
