package org.jsp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Person;

public class TetchAadharByPersonName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name to print aadhar details");
	String name = sc.next();
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Query q = manager.createQuery("select p from Person p where p.name=?1");
		q.setParameter(1, name);
List<Person> p = q.getResultList();
if(p!=null) {
	for(Person person : p) {
	System.out.println(	person.getCard());
	}
}
else {
	System.out.println("name not found");
}
		

	}

}
