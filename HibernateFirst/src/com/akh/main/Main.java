package com.akh.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.akh.dao.Employee;

/**
 * @author akhilesh
 *
 */
public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(116,"Amit","K");
		/*e1.setId(115);
		e1.setFirstName("Akhilesh");
		e1.setLastName("Mohapatro");*/

		// creating configuration object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// populates the data of the configuration file

		// creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		session.persist(e1);// persisting the object

		t.commit();// transaction is committed
		session.close();

		System.out.println("successfully saved");

	}
}