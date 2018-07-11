package com.kevalborker.ajaxexample.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kevalborker.ajaxexample.dto.AjaxDTO;

@Repository
public class AjaxDAO {

	public AjaxDAO() {
		System.out.println(this.getClass().getSimpleName()+ " Object created");
	}
	
	@Autowired
	SessionFactory factory;
	
	public void storeRecords(AjaxDTO dtofromser) {
	System.out.println("storeRecords in dao Started");
	Session session = factory.openSession();
	Transaction tx = null;
	try {
		tx = session.beginTransaction();
		session.save(dtofromser);
		tx.commit();
	} catch (Exception e) {
		tx.rollback();
	}finally {
		session.close();
	}
	
	System.out.println("storeRecords in dao Ended");

	}
}
