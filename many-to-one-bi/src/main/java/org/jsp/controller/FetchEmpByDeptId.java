package org.jsp.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.dto.Department;

public class FetchEmpByDeptId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter department id");
		int id= sc.nextInt();
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		Department dept=manager.find(Department.class, id);
		if(dept!=null) {
			System.out.println(dept.getEmps());
		}
		else
			System.out.println("invalid dept id");

	}

}
