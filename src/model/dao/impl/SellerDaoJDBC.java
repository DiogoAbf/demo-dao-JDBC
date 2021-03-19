package model.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {
	
	
	private Connection conn;
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
		// TODO Auto-generated constructor stub
	}
	



	@Override
	public void insert(SellerDao obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SellerDao obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(SellerDao obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findByidI(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.clientPrepareStatement("SELECT seller.*,department.Name as DepName\r\n" + 
					"FROM seller INNER JOIN department\r\n" + 
					"ON seller.DepartmentId = department.Id\r\n" + 
					"WHERE seller.Id = ?");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			
			if (rs.next()) {
				Departament dep = instantiateDepartatment(rs);
				Seller obj = instantiateSeller(rs,dep);
				return obj;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
			
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
	}

	private Seller instantiateSeller(ResultSet rs, Departament dep) throws SQLException {
		Seller obj = new Seller();	 
		obj.setId(rs.getInt("Id"));
		obj.setName(rs.getString("Name"));
		obj.setEmail(rs.getString("Email"));
		obj.setBaseSalary(rs.getDouble("BaseSalary"));
		obj.setBirthDate(rs.getDate("BirthDate"));
		obj.setDepartament(dep);
		return obj;
	}




	private Departament instantiateDepartatment(ResultSet rs) throws SQLException {
		Departament dep =  new Departament();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("DepName"));
		return dep;
	}




	@Override
	public List<SellerDao> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}