package application;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.*;

public class Progam {

	public static void main(String[] args) {
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Seller seller = sellerdao.findByidI(3);
		
		System.out.println(seller);

	}

}
