package org.jsp.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Branch;
import org.jsp.dto.Hospital;

public class SaveHospitalAndBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital h= new Hospital();
		h.setName("pulse");
		h.setFounder("xyz");
		h.setGst("ab123");
		
		Branch b1 = new Branch();
		b1.setEmail("pulse@123");
		b1.setName("pulse bhilai");
		b1.setPhone(5267128);
		
		Branch b2 = new Branch();
		b2.setEmail("pulse@423");
		b2.setName("pulse durg");
		b2.setPhone(9827237);
		
		Branch b3 = new Branch();
		b3.setEmail("pulse@925");
		b3.setName("pulse raipur");
		b3.setPhone(837662);
		
		h.setBranches(new ArrayList<Branch>(Arrays.asList(b1,b2,b3)));
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		EntityTransaction t = manager.getTransaction();
		manager.persist(h);
		t.begin();
		t.commit();

	}

}
