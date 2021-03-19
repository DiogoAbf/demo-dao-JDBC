package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {
	
	void insert(Departament obj);
	void update(Departament obj);
	void deleteById(Departament obj);
	Departament findByidI(Integer id);
	List<Departament> findAll();
	
	

}
