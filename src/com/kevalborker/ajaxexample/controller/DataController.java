package com.kevalborker.ajaxexample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kevalborker.ajaxexample.dto.AjaxDTO;

@Controller
@RequestMapping("/")
public class DataController {

	public DataController() {
		System.out.println(this.getClass().getSimpleName()+ " Object created");
	}
	
	
	List<AjaxDTO> UserList= new ArrayList<AjaxDTO> ();
	
	
	//AjaxService ajxService;
	
	@RequestMapping(value="/AddUser.jsp" , method=RequestMethod.GET)
	public String showForm() {
		System.out.println("ShowForm Started");
		System.out.println("ShowForm ended");
		return "AddUser.jsp";
	}
	
	@RequestMapping(value="AddUser.jsp" , method=RequestMethod.POST)
	public @ResponseBody String addUser(@ModelAttribute(value="dtofromUsr") AjaxDTO dtofromUsr ,BindingResult result) {
		System.out.println("Add user started");
		
		String msg="";
		if(!result.hasErrors()) {
			UserList.add(dtofromUsr);
			
			msg="User has beed added to thr list !"+"Total Users : "+UserList.size();
		}else {
			msg=" Something went wrong, user not added to the list ";
		}
		System.out.println("Add user Ended");
		return msg;
	}
	
	@RequestMapping(value="index.jsp" )
	public String showUserList(ModelMap model) {
		System.out.println("ShowUserList Started");
		
		model.addAttribute("dtofromUsrList",UserList);
		
		System.out.println("ShowUserList ended");
		return "index.jsp";
		
	}
}
