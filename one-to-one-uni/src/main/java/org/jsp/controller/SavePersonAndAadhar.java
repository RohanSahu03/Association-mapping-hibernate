package org.jsp.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.AadharCard;
import org.jsp.dto.Person;

public class SavePersonAndAadhar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Person p = new Person();
		p.setName("rohan");
		p.setPhone(63723829);
		
		AadharCard card = new AadharCard();
		card.setDob(LocalDate.parse("1999-04-03"));
		card.setNumber(5843343);
		
		p.setCard(card);
		manager.persist(p);
		transaction.begin();
		transaction.commit();
				
	}

}
