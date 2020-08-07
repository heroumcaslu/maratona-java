package com.devdojo.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversãoDeListasArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = new ArrayList<Integer>();
		Integer[] arrayInt = new Integer[4];

		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);
		
		arrayInt[0] = 2;
		arrayInt[1] = 0;
		arrayInt[2] = 4;
		arrayInt[3] = 3;
		
		Integer[] numerosArray = new Integer[numeros.size()];
		numeros.toArray(numerosArray);
		@SuppressWarnings("unused")
		Object[] objects = numeros.toArray();
		
		//Forma 1 Array to list-
		//Ocupa o mesmo lugar no heap, a alteração de um ocorre no outro
		//Se quiser adicionar UnsuportedOperation
		@SuppressWarnings("unused")
		List<Integer> inteiros = Arrays.asList(arrayInt);
		
		//Forma 2
		List<Integer> ints = new ArrayList<Integer>();
		ints.addAll(Arrays.asList(arrayInt));

	}

}
