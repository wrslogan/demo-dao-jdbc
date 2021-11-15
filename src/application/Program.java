package application;

import java.util.List;
import java.util.Scanner;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		/*System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id of delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");*/
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 3: department insert ===");
		Department newDep = new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted 1! New id = " + newDep.getId());
		newDep = new Department(null,"Footbal");
		depDao.insert(newDep);
		System.out.println("Inserted 2! New id =" + newDep.getId());
		
		System.out.println("\n=== TEST 4: department update ===");
		dep = depDao.findById(6);
		dep.setName("Food");
		depDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.print("Enter id of delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
