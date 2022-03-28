package com.ty.onetoone.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.PAN;
import com.ty.onetoone.dto.Person;

public class PersonController {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	PAN pan=new PAN();
	pan.setCountry("India");
	pan.setDate(LocalDate.now());
	pan.setPan_number("IVJPS3405K");
	Person person=new Person();
	person.setGender("Male");
	person.setName("Sathish");
	person.setPhone(8884882497l);
	pan.setPerson(person);
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(pan);
	entityTransaction.commit();
}
}
