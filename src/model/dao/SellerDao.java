package model.dao;

import java.util.List;

import model.entities.Departament;
import model.entities.Seller;

public interface SellerDao {
	void insert(SellerDao obj);
	void update(SellerDao obj);
	void deleteById(SellerDao obj);
	Seller findById(Integer id);
	List<Seller> findByDepartament(Departament departament);
	List<Seller> findAll();
	void insert(Seller obj);
	

}
