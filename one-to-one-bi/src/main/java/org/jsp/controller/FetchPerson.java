package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.dto.Person;

public class FetchPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		manager.find(Person.class, 1);

	}

}
