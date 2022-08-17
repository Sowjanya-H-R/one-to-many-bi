package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class SaveSim {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Mobile mobile = new Mobile();
		mobile.setName("Techno");
		mobile.setCost(7000);

		Sim sim1 = new Sim();
		sim1.setProvider("Docommo");
		sim1.setImrc(5293);
		sim1.setMobile(mobile);

		Sim sim2 = new Sim();
		sim2.setProvider("Bsnl");
		sim2.setImrc(1477);
		sim2.setMobile(mobile);

		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
        System.out.println("---data stored----");
	}
}
