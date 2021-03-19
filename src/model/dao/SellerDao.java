package model.dao;

import java.util.List;

import model.entities.Departament;

public interface SellerDao {
	void insert(SellerDao obj);
	void update(SellerDao obj);
	void deleteById(SellerDao obj);
	SellerDao findByidI(Integer id);
	List<SellerDao> findAll();
	

}
