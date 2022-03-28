package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.PAN;
import com.ty.onetoone.dto.Person;

public class TestGetPAN {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		PAN pan = entityManager.find(PAN.class, 1);
		if (pan != null) {
			Person person = pan.getPerson();
			System.out.println("Name is:" + person.getName());
			System.out.println("Phone:" + person.getPhone());
			System.out.println("Gender:" + person.getGender());
			System.out.println("Id is:" + person.getId());
			System.out.println("PAN Card details");
			System.out.println("Pan Id:" + pan.getId());
			System.out.println("Pan number:" + pan.getPan_number());
			System.out.println("Country:" + pan.getCountry());
			System.out.println("Date:" + pan.getDate());
		} else {
			System.out.println("The given PAN with the id not present");
		}
	}
}
