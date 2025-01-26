package org.jsp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.AadharCard;

public class FetchPersonByAadharId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter aadhar id to print person details");
	int id = sc.nextInt();
	
	EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	//or we can use Query interface to fetch person using aadhar id
	//Query q =manager.createQuery("select p from Person p where p.card.id=?1")
	//                       OR
	//Query q =manager.createQuery("select a.p  from AadharCard a where a.id=?1")

	AadharCard ac =manager.find(AadharCard.class, id);
	if(ac!=null) {
		System.out.println(ac.getP());
	}
	else {
		System.out.println("invalid aadhar id");
	}
	
		

	}

}
