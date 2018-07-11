package com.kevalborker.ajaxexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevalborker.ajaxexample.dao.AjaxDAO;
import com.kevalborker.ajaxexample.dto.AjaxDTO;

@Service
public class AjaxService {
	
	public AjaxService() {
		System.out.println(this.getClass().getSimpleName()+ " Object created");
	}
	
	@Autowired 
	AjaxDAO ajxdao;
	
	public void ajaxStoreService(AjaxDTO dtofromCtrl) {
		
		System.out.println("ajaxStoreService in service started");
		
		ajxdao.storeRecords(dtofromCtrl);
		
		System.out.println("ajaxStoreService in service Ended");

	}
	
	
}
