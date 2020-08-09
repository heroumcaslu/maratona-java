package com.devdojo.collections.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Não pode existir chave duplicada
		Map<String, String> map = new HashMap<String, String>();
		//Mantendo a ordem de inserção - utiliza-se linked
		//Map<String, String> linkedMap = new LinkedHashMap<String, String>();
		
		//palavra incorreta -> palavra correta
		map.put("teklado", "teclado");
		map.put("mouze", "mouse");
		map.put("vc", "você");
		
		//map.keySet -> chaves
		//map.values -> valores
		//no Set quando inserir duplicado não é inserido, no map ele é substituido
		for(String key : map.values()) {
			
			System.out.println(key);
			
		}
		
		//por chave e valor
		for(Map.Entry<String, String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}

	}

}
