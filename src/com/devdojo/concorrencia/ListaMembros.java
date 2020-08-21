package com.devdojo.concorrencia;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ListaMembros {

	private final Queue<String> emails = new LinkedList<String>();
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition conditionLock = lock.newCondition();
	private boolean aberta = true;
	
	public int getEmailsPendentes() {
		lock.lock();
	//	synchronized (emails) 
		try{

			return this.emails.size();
			
		} finally {
			
			lock.unlock();
			
		}
		
	}
	
	public boolean isAberta() {
		
		return this.aberta;
		
	}
	
	public String obterEmailMembro() {
		
		String email = null;
		try {
			
				lock.lock();
			
				while(this.emails.size() == 0) {
					
					if(!aberta) {
						
						return null;
						
					}
					System.out.println("Lista vazia, colocando a thread em wait: "+Thread.currentThread().getName());
					conditionLock.await();
					
				}
				email = this.emails.poll();
				
			
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			
			lock.unlock();
			
		}
		return email;
		
	}
	
	public void adicionarEmailMembro(String email) {
		
		lock.lock();
		//synchronized (email) 
		try {
			this.emails.add(email);
			System.out.println("Email adicionado na lista");
			
			System.out.println("Notificando às threads que estão em espera");
			conditionLock.signalAll();
			
		} finally {
			lock.unlock();
		}
		
	}
	
	public void fecharLista() {
		
		lock.lock();
		System.out.println("Notificando todas as threads e fechando a lista");
		this.aberta = false;
		try {
			
			conditionLock.signalAll();
			
		} finally {
			
			lock.unlock();
			
		}
		
	}

}
