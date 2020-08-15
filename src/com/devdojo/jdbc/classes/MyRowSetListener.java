package com.devdojo.jdbc.classes;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

public class MyRowSetListener implements RowSetListener {

	@Override
	public void rowSetChanged(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("execute");
		
	}

	@Override
	public void rowChanged(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Linha foi atualizada, inserida ou deletada");
		if(event.getSource() instanceof RowSet) {
			
			try {
				((RowSet) event.getSource()).execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void cursorMoved(RowSetEvent event) {
		// TODO Auto-generated method stub
		System.out.println("cursor movido");
		
	}

}
