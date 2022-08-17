package com.ty.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class GetMobile {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		Mobile mobile = entityManager.find(Mobile.class, 1);
		System.out.println("Mobile id is :" + mobile.getId());
		System.out.println("Mobile name is :" + mobile.getName());
		System.out.println("Mobile cost is :" + mobile.getCost());
		System.out.println("-------------------------");

		List<Sim> sim = mobile.getSim();
		if (!sim.isEmpty()) {
			for (Sim s : sim) {
				System.out.println("sim id is :" + s.getId());
				System.out.println("sim provider is :" + s.getProvider());
				System.out.println("sim1 imrc is :" + s.getImrc());

				System.out.println("----------------");

			}
		}

	}
}
