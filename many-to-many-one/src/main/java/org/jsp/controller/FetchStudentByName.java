package org.jsp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Student;

public class FetchStudentByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student name");
		String name= sc.nextLine();
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		
		Query q = manager.createQuery("select s from Student s where s.name=?1");
		q.setParameter(1, name);
		
		List<Student> st = q.getResultList();
		
		if(st.size()!=0) {
			for(Student s :st) {
				System.out.println(s);
		}
			}
		else {
			System.out.println("invalid name");
		}
	}

	}


