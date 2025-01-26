package org.jsp.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Batch;
import org.jsp.dto.Student;

public class SaveBatchStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batch b1 = new Batch();
		b1.setCode("SEAJ3");
		b1.setSubject("hibernate");

		Batch b2 = new Batch();
		b2.setCode("SEjp4");
		b2.setSubject("spring");
		
		Batch b3 = new Batch();
		b3.setCode("sjar7");
		b3.setSubject("reactjs");
		
		Student s1 = new Student();
		s1.setName("virat kohli");
		s1.setPerc(98);
		
		Student s2 = new Student();
		s2.setName("Rohit sharma");
		s2.setPerc(90);
		
		Student s3 = new Student();
		s3.setName("sky");
		s3.setPerc(75);
		
		//adding student for hibernate
		b1.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		//adding student for spring
		b2.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		//adding student for reactjs
		b3.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		EntityTransaction t = manager.getTransaction();
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		
		t.begin();
		t.commit();
	}

}
