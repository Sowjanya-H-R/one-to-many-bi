package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class GetProduct {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product product=entityManager.find(Product.class,1);
		System.out.println("product Id is :" + product.getId());
		System.out.println("product  Cost is :" + product.getCost());
		System.out.println("product name is :" + product.getName());
		System.out.println("---------------------");
		
		Brand brand=product.getBrand();
		System.out.println("Brand Id is :" + brand.getId());
		System.out.println("Brand name is :" + brand.getName());
		System.out.println("---------------------");
	}
}
