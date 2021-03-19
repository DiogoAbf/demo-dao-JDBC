package model.dao;

import java.util.List;

import model.entities.Departament;
import model.entities.Seller;

public interface SellerDao {
	void insert(SellerDao obj);
	void update(SellerDao obj);
	void deleteById(SellerDao obj);
	Seller findByidI(Integer id);
	List<SellerDao> findAll();
	

}
