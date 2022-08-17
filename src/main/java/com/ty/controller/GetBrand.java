package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class GetBrand {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Brand brand = entityManager.find(Brand.class, 1);
		System.out.println("Brand Id is :" + brand.getId());
		System.out.println("Brand name is :" + brand.getName());
		System.out.println("---------------------");

		List<Product> product = brand.getProduct();
		if (!product.isEmpty()) {
			for (Product p : product) {
				System.out.println("product Id is :" + p.getId());
				System.out.println("product  Cost is :" + p.getCost());
				System.out.println("product name is :" + p.getName());
				System.out.println("---------------------");

			}
		}

	}
}
