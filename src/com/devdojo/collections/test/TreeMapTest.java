package com.devdojo.collections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<String, String> map = new TreeMap<String, String>();
		
		//A chave precisa implementar comparable
		map.put("A", "Letra A");
		map.put("D", "Letra D");
		map.put("B", "Letra A");
		map.put("C", "Letra C");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		//chaves menores que a do parametro, segundo parametro pra incluir a chave do parametro
		System.out.println(map.headMap("C", true));
		System.out.println(map.higherEntry("C"));
		System.out.println(map.descendingMap());

	}

}
