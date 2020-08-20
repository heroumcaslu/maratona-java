package com.devdojo.threads;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListaNomes{
	
	private List<String> nomes = new LinkedList<>();
	
	public synchronized void add(String nome) {
		
		nomes.add(nome);
		
	}
	
	public synchronized void removerPrimeiro() {
		
		if(nomes.size() > 0) {
			
			System.out.println(nomes.remove(0));
			
		}
		
	}
	
}

public class ThreadSafeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaNomes nome = new ListaNomes();
		
		nome.add("William Suane");
		
		class RemovedorNomes extends Thread{
			
			public void run() {
				
				nome.removerPrimeiro();
				
			}
			
		}
		
		new RemovedorNomes().start();
		new RemovedorNomes().start();

	}

}
