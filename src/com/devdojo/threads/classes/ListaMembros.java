package com.devdojo.threads.classes;

import java.util.LinkedList;
import java.util.Queue;

public class ListaMembros {

	private final Queue<String> emails = new LinkedList<String>();
	private boolean aberta = true;
	
	public int getEmailsPendentes() {
		
		synchronized (emails) {
			
			return this.emails.size();
			
		}
		
	}
	
	public boolean isAberta() {
		
		return this.aberta;
		
	}
	
	public String obterEmailMembro() {
		
		String email = null;
		try {
			
			synchronized (emails) {
			
				while(this.emails.size() == 0) {
					
					if(!aberta) {
						
						return null;
						
					}
					System.out.println("Lista vazia, colocando a thread em wait: "+Thread.currentThread().getName());
					this.emails.wait();
					
				}
				email = this.emails.poll();
				
			}
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return email;
		
	}
	
	public void adicionarEmailMembro(String email) {
		
		synchronized (email) {
			this.emails.add(email);
			System.out.println("Email adicionado na lista");
			
			System.out.println("Notificando às threads que estão em espera");
			this.emails.notifyAll();
			
		}
		
	}
	
	public void fecharLista() {
		
		System.out.println("Notificando todas as threads e fechando a lista");
		this.aberta = false;
		synchronized (emails) {
			this.emails.notifyAll();
		}
		
	}

}
