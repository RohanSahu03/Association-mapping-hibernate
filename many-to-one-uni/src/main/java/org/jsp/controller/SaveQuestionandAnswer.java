package org.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Answer;
import org.jsp.dto.Question;

public class SaveQuestionandAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question q = new Question();
		q.setQuestion("what is java ?");
		q.setQuestionedBy("trainer");
		
		Answer a1 = new Answer();
		a1.setAnswer("java is a object oriented prog lang.");
		a1.setAnsweredBy("ranjit");
		a1.setQ(q);
		
		Answer a2 = new Answer();
		a2.setAnswer("java is a platform independent prog lang.");
		a2.setAnsweredBy("Banti");
		a2.setQ(q);
		
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		manager.persist(a1);
		manager.persist(a2);
		
		EntityTransaction t = manager.getTransaction();
		t.begin();
		t.commit();
		
		
	}

}
