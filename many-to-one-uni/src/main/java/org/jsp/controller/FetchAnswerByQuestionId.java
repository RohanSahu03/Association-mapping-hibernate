package org.jsp.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Answer;

public class FetchAnswerByQuestionId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter question id");
		int id = sc.nextInt();
		EntityManager manager = Persistence.createEntityManagerFactory("HibernateJPA").createEntityManager();
		
		Query q =manager.createQuery("select a from Answer a where a.q.id=?1");
		q.setParameter(1, id);
		List<Answer> ans =q.getResultList();
		if(ans.size()!=0) {
			for(Answer a :ans) {
				System.out.println(a.getAnswer());
			}
		}
		else {
			System.out.println("invalid question id");
		}
	}

}
