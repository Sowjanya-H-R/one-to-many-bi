package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class SaveBrand {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Brand brand=new Brand();
		brand.setName("Sony");
		
		Product product1=new Product();
		product1.setName("Laptop");
		product1.setCost(60000);
		product1.setBrand(brand);
		
		Product product2=new Product();
		product2.setName("Fridge");
		product2.setCost(50000);
		product2.setBrand(brand);
		
		Product product3=new Product();
		product3.setName("Washing machine");
		product3.setCost(60000);
		
		
		Product product4=new Product();
		product4.setName("music player");
		product4.setCost(80000);
		

         List<Product> product=new ArrayList<Product>();
         product.add(product3);
         product.add(product4);
        
		
		Brand brands=entityManager.find(Brand.class,1);
		
		brands.setProduct(product);
		product4.setBrand(brands);
		product3.setBrand(brands);

		
		entityTransaction.begin();
		entityManager.persist(product3);
		entityManager.persist(product4);
		entityManager.persist(brands);
		entityTransaction.commit();
		
		System.out.println("----------data stored------------");


	}
}
