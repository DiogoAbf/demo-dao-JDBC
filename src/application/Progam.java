package application;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Progam {

	public static void main(String[] args) {
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Departament departament = new Departament(2,null);
		
		List<Seller> list = sellerdao.findByDepartament(departament);
		
		for(Seller obj: list) {
			
			System.out.println(obj);
		}
		
		

	}

}
