package com.kevalborker.ajaxexample.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="event_table")
public class AjaxDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="myId" ,strategy="increment")
	@GeneratedValue(generator="myId")
	private int id;
	private String name ;
	private int age ;
	private String city ;
	
	public AjaxDTO() {
		System.out.println(this.getClass().getSimpleName()+ " Object created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
