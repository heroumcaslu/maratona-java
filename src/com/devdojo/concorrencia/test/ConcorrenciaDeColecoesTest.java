package com.devdojo.concorrencia.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcorrenciaDeColecoesTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WeaklyConsistent
		//ConcurrentHashMap, ConcurrentLinkedDeque, ConcurrentLinkedQueue,  ConcurrentSkipListMap, ConcurrentSkipSet
		
		Map<String, String> map = new HashMap<String, String>();
		map.putIfAbsent("1", "2");
		
		ConcurrentMap<String, String> curMap = new ConcurrentHashMap<String, String>();
		curMap.put("1", "1");
		curMap.put("1", "2");
		//só coloca se não existir
		curMap.putIfAbsent("1", "5");
		curMap.get("1");
		
		
	}

}
