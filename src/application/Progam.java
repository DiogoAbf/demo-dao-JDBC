package application;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Progam {

	public static void main(String[] args) {
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
	
		
		List<Seller> list = sellerdao.findAll();
		
		for(Seller obj: list) {
			
			System.out.println(obj);
		}
		
		

	}

}
