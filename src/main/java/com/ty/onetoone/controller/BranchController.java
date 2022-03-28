package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class BranchController {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Branch branch=new Branch();
	branch.setName("TYSS");
	branch.setPhone(7888);
	Address address=new Address();
	address.setArea("GandhiBazar");
	address.setPin(560001);
	address.setState("Karnataka");
	branch.setAddress(address);
	entityTransaction.begin();
	entityManager.persist(address);
	entityManager.persist(branch);
	
	entityTransaction.commit();
}
}
