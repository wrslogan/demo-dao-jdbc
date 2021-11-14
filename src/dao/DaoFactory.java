package dao;

import dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao creatSellerDao () {
		return new SellerDaoJDBC();
	}

}
