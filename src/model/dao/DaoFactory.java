package model.dao;

import com.mysql.jdbc.Connection;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao () {
		return new SellerDaoJDBC((Connection) DB.getConnection());
		
		
		
	}

}
