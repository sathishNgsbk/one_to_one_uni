package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestGetBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Branch branch = entityManager.find(Branch.class, 3);
		if (branch != null) {
			Address address = branch.getAddress();
			System.out.println("branch Name:" + branch.getName());
			System.out.println("Branch Id:" + branch.getId());
			System.out.println("Phone:" + branch.getPhone());
			System.out.println("Branch Address");
			System.out.println("Area:" + address.getArea());
			System.out.println("Address ID:" + address.getId());
			System.out.println("PIN:" + address.getPin());
			System.out.println("State:" + address.getState());
		} else {
			System.out.println("The given branch Id not present");
		}
	}
}
