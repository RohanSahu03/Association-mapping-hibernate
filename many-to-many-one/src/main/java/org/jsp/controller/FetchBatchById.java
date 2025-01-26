package org.jsp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.jsp.dto.Batch;



public class FetchBatchById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter batch id");
		int id = sc.nextInt();
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
	Batch b= manager.find(Batch.class, id);

		if(b!=null) {
			System.out.println(b);
		}
		else
			System.out.println("invalid id");
	}
	}


