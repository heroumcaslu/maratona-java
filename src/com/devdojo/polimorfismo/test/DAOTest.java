package com.devdojo.polimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import com.devdojo.polimorfismo.DatabaseDAOImpl;
import com.devdojo.polimorfismo.GenericDAO;

public class DAOTest {
	
	public static void main(String[] args) {
		
		//Programação orienteda à interface.
		GenericDAO dao = new DatabaseDAOImpl();
		dao.save();
		
		//Exemplo
		//Caso seja necessária a mudança List<String> names = new LinkedList<>();
		List<String> names = new ArrayList<>();
		names.add("Lucas");
		names.add("Herom");
		names.add("Silva");
		
		
	}

}
