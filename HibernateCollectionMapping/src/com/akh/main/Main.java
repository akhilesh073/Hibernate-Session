package com.akh.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author akhilesh
 *
 */
public class Main {
	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();

		Answers answer = new Answers(12, "java is a programming language",
				"Akhilesh");
		Answers answer1 = new Answers(12, "java is a platform", "Amit");
		List<Answers> list = new ArrayList<Answers>();
		list.add(answer);
		list.add(answer1);
		Question question1 = new Question();

		question1.setQname("What is Java?");
		question1.setAnswers(list);

		session.persist(question1);

		t.commit();
		session.close();
		System.out.println("success");
	}
}
