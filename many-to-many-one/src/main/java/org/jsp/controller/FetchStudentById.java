package org.jsp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.dto.Student;

public class FetchStudentById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id");
		int id = sc.nextInt();
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		Student st=manager.find(Student.class, id);

		if(st!=null) {
			System.out.println(st);
		}
		else
			System.out.println("invalid id");
	}

}
