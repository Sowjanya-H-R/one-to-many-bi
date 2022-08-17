package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class GetSim {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Sim sim = entityManager.find(Sim.class, 2);
		System.out.println("sim2 id is :" + sim.getId());
		System.out.println("sim2 provider is :" + sim.getProvider());
		System.out.println("sim2 imrc is :" + sim.getImrc());

		System.out.println("----------------");

		Mobile mobile = sim.getMobile();
		System.out.println("Mobile id is :" + mobile.getId());
		System.out.println("Mobile name is :" + mobile.getName());
		System.out.println("Mobile cost is :" + mobile.getCost());
		System.out.println("-------------------------");

	}
}
