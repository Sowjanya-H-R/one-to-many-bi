package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;

public class MobileGet {
	public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = factory.createEntityManager();


}
}