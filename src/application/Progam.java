package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Progam {

	public static void main(String[] args) {
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Departament departament = new Departament(2,null);
		Seller newSeller = new Seller(null,"Greg","grege@gmail.com", new Date(),4000.0,departament);

		
	
		
Seller seller = sellerdao.findById(1);
seller.setName("marcos");
sellerdao.update(seller);

System.out.println(seller.getName());

	}

}
