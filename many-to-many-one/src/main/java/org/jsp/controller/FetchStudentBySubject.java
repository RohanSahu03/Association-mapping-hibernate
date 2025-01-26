package org.jsp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Batch;

public class FetchStudentBySubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter subject name");
	String subject = sc.nextLine();
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		Query q = manager.createQuery("select b from Batch b where b.subject=?1");
		q.setParameter(1, subject);
		 Batch b =   (Batch) q.getSingleResult();
		 
		 if(b!=null) {
			 System.out.println(b.getStudents());
		 }
		 else {
			 System.out.println("invalid batch id");
		 }

	}

}
