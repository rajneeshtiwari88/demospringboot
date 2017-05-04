package com.impress.firstTest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App{
	
	
	public List<String> getData() {
		List<String> list = new ArrayList<String>();
		SessionFactory factory = new Configuration().configure("/hibernate.xml").buildSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EntityTest.class);
		List<EntityTest> entityTests = criteria.list();
		for (EntityTest entityTest : entityTests)
			list.add(entityTest.getAge());
		closeSession(session);
		return list;
	}

	public void closeSession(Session session) {
		if (session != null)
			session.close();

	}

	private void saveApp(Session session, Object entityTest) {
		Transaction transaction = session.beginTransaction();
		session.save(entityTest);
		transaction.commit();
		closeSession(session);
	}

	public void createEntity(String age) {
		Session session = createSession();
		EntityTest entityTest = new EntityTest();
		entityTest.setAge(age);
		entityTest.setName("sach");
		entityTest.setSal(10000);
		saveApp(session, entityTest);
	}

	private Session createSession() {
		SessionFactory factory = new Configuration().configure("/hibernate.xml").buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
}
