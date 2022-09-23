package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Date birth = new Date();
		Department dep = new Department(1, "Books");
		Seller seller = new Seller(21, "Yago", "yagolife1@gmail.com", birth, 10000.0, dep); 
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(dep);
		System.out.println(seller);
	}

}
