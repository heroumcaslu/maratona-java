package com.devdojo.threads;

import javax.swing.JOptionPane;

import com.devdojo.threads.classes.Entregador;
import com.devdojo.threads.classes.ListaMembros;

public class EntregadorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaMembros listaMembros = new ListaMembros();
		
		Thread t1 = new Thread(new Entregador(listaMembros), "Entregador 1");
		Thread t2 = new Thread(new Entregador(listaMembros), "Entregador 2");
		
		t1.start();
		t2.start();
		
		while(true) {
			
			String email = JOptionPane.showInputDialog("Digite o email do membro");
			if(email == null || email.isEmpty()) {
				
				listaMembros.fecharLista();
				break;
				
			}
			listaMembros.adicionarEmailMembro(email);
			
		}

	}

}
