package org.jsp.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Department;
import org.jsp.dto.Employee;

public class SaveDeptAndEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d = new Department();
		d.setName("jspider");
		d.setLocation("btm");
		
		Employee e1 = new Employee();
		e1.setName("abc");
		e1.setDesg("development");
		e1.setSalary(438437);
		e1.setDept(d);
		
		Employee e2 = new Employee();
		e2.setName("xyz");
		e2.setDesg("HR");
		e2.setSalary(438427);
		e2.setDept(d);
		
		Employee e3 = new Employee();
		e3.setName("pqr");
		e3.setDesg("HR");
		e3.setSalary(432427);
		e3.setDept(d);
		
		d.setEmps(new ArrayList<Employee>(Arrays.asList(e1,e2,e3)));
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		EntityTransaction t = manager.getTransaction();
		manager.persist(d);
		t.begin();
		t.commit();

	}

}
