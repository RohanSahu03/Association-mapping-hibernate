package org.jsp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Person;

public class FetchAadharByPersonId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id to print aadhar details");
		int id = sc.nextInt();
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Person p =manager.find(Person.class, id);
		if(p!=null) {
			System.out.println(p.getCard());
		}
		else {
			System.out.println("invalid id");
		}

	}

}
