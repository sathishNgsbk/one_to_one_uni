package com.ty.onetoone.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class PAN {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String pan_number;
private LocalDate date;
private String country;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPan_number() {
	return pan_number;
}
public void setPan_number(String pan_number) {
	this.pan_number = pan_number;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
@OneToOne
private Person person;
}
