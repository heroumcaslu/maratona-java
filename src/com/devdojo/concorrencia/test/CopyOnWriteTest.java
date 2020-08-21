package com.devdojo.concorrencia.test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

final class Pessoa {

	// esse é um objeto imutável, ele é auto thread safe

	private final String nome;

	public Pessoa(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
	}

}

public class CopyOnWriteTest implements Runnable {

	// private List<Integer> list = Collections.synchronizedList(new ArrayList<>());
	private List<Integer> list = new CopyOnWriteArrayList<Integer>();
	// [0][1][2]
	// [0][1] - ao excluir é feita uma copia

	public CopyOnWriteTest() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 9000; i++) {

			list.add(i);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteTest ct = new CopyOnWriteTest();
		
		Thread t1 = new Thread(ct);
		Thread t2 = new Thread(ct);
		Thread removedor = new Thread(new RemoverMembros(ct.getList()));
		
		t1.start();
		t2.start();
		removedor.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		Iterator<Integer> iterator = list.iterator();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//nem remoção nem adição pode ser feita com iterator
		while(iterator.hasNext()) {
			
			System.out.println(Thread.currentThread().getName()+" "+iterator.next());
			
		}
		
	}
	
	public List<Integer> getList() {
		return list;
	}
	
	private static class RemoverMembros implements Runnable{

		private List<Integer> list;
		
		public RemoverMembros(List<Integer> list) {
			// TODO Auto-generated constructor stub
			this.list = list;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 500; i++) {
				
				System.out.println(Thread.currentThread().getName()+" removeu "+list.remove(i));
				
			}
			
		}
		
		
		
	}

}
