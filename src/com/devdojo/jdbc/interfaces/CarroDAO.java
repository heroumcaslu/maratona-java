package com.devdojo.jdbc.interfaces;

import java.util.List;

import com.devdojo.jdbc.classes.Carro;

public interface CarroDAO {

	void save(Carro carro);

	void remove(Carro Carro);

	void update(Carro Carro);

	List<Carro> selectAll();

	List<Carro> selectByName(String nome);

	Carro selectById(Integer id);
	
	

}
