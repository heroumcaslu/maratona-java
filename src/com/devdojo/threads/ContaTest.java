package com.devdojo.threads;

import com.devdojo.threads.classes.Conta;

public class ContaTest implements Runnable {
	
	private Conta conta = new Conta();
	
	public static void main(String[] args) {
		
		ContaTest contaTest = new ContaTest();
		
		Thread william = new Thread(contaTest, "William");
		Thread anna = new Thread(contaTest, "Anna");
		
	}
	//sincronizar pra proteger os dados que podem ser usados por threads -- lock da classe
	public static synchronized void imprime() {
		
		System.out.println("Dados");
		synchronized (ContaTest.class) {
			
			System.out.println("Dados");
			
		}
		
	}
	
	//só uma thread tem acesso por vez -- lock da instância
	private synchronized void saque(int valor) {
		
		if(conta.getSaldo() > valor) {
			
			System.out.println(Thread.currentThread().getName()+" sacando");
			conta.saque(valor);
			System.out.println(Thread.currentThread().getName()+" sacou, saldo:"+conta.getSaldo());
			
		} else {
			
			System.out.println("Sem dinheiro para "+Thread.currentThread().getName()+"efetuar o saque, saldo:"+conta.getSaldo());
			
		}
		
		//synchronized (conta) {
			
		//	if(conta.getSaldo() > 10) {
						
		//				System.out.println(Thread.currentThread().getName()+" sacando");
		//				conta.saque(10);
		//				System.out.println(Thread.currentThread().getName()+" sacou, saldo:"+conta.getSaldo());
						
		//			} else {
						
		//				System.out.println("Sem dinheiro para "+Thread.currentThread().getName()+"efetuar o saque, saldo:"+conta.getSaldo());
						
		//			}
			
		//}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i<5; i++) {
			
			saque(10);
			if (conta.getSaldo() < 0) {
				
				System.out.println("Oh meu deus!");
				
			}
			
		}
		
	}

}
