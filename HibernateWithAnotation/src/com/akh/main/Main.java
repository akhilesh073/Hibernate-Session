package com.akh.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.akh.dao.Employee;

/**
 * @author akhilesh
 *
 */
public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(117, "Amit", "K");

		Session session = new AnnotationConfiguration().configure()
				.buildSessionFactory().openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		session.persist(e1);// persisting the object

		t.commit();// transaction is committed
		session.close();

		System.out.println("successfully saved");

	}
}