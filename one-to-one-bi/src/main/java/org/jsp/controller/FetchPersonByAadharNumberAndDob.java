package org.jsp.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.AadharCard;

public class FetchPersonByAadharNumberAndDob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter aadhar number");
		long number = sc.nextLong();
		System.out.println("enter dob in yyyy-mm-dd format");
		String dob = sc.next();
		LocalDate date =LocalDate.parse(dob);
		
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Query q = manager.createQuery("select p form Person p where p.card.number=?1  and p.card.dob=?2");
		q.setParameter(1, number);
		q.setParameter(2, date);
		
		AadharCard ac =  (AadharCard) q.getSingleResult();
		System.out.println(ac.getP());

	}

}
