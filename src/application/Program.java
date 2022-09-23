package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		/*
		 * Date birth = new Date(); Department dep = new Department(1, "Books"); Seller
		 * seller = new Seller(21, "Yago", "yagolife1@gmail.com", birth, 10000.0, dep);
		 */
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}

}
