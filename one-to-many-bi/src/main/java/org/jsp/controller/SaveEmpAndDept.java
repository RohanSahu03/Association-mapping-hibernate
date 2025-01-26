package org.jsp.controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.mapping.List;
import org.jsp.dto.Department;
import org.jsp.dto.Employee;

public class SaveEmpAndDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d = new Department();
		d.setDeptName("computer");
		d.setLocation("btm");
		
		Employee e1 = new Employee();
		e1.setName("Rohan");
		e1.setEmail("rohan@123.gmail.com");
		e1.setDept(d);
		
		Employee e2 = new Employee();
		e1.setName("raj");
		e1.setEmail("raj@123.gmail.com");
		e1.setDept(d);
		
	ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		
		d.setEmp(al);
		
EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
EntityTransaction transaction = manager.getTransaction();
manager.persist(d);
transaction.begin();
transaction.commit();
	}

}
