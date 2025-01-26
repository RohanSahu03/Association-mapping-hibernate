package org.jsp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Employee;

public class FetchEmpByDesg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Employee designation");
		String desg= sc.nextLine();
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		
		Query q = manager.createQuery("select e from Employee e where e.desg=?1");
		q.setParameter(1, desg);
		
		List<Employee> emp = q.getResultList();
		if(emp.size()!=0) {
			for(Employee e :emp) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("not found");
		}
	}

}
