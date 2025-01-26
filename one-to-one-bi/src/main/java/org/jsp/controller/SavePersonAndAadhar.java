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
		p.setPhone(1234);
		
		AadharCard card = new AadharCard();
		card.setDob(LocalDate.parse("1985-08-25"));
		card.setNumber(84629);
		
		p.setCard(card);//assigning aadhar for person
		card.setP(p);//assigning person for aadhar
		manager.persist(p);
		transaction.begin();
		transaction.commit();
				
	}

}
