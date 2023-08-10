package com.aurionpro.test;

import com.aurionpro.model.Irepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepoTest {
	public static void main(String[] args) {
		OrderRepository obj1 =new OrderRepository();
		ProductRepository obj2=new ProductRepository();
		dbOperations(obj1);
		dbOperations(obj2);
	}

	private static void dbOperations(Irepository repo) {
		repo.create();
		repo.read();
		repo.update();
		repo.delete();
		
	}

}
