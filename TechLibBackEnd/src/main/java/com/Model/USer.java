package com.Model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class USer implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String name;
	  private String password;
	 	 private String email;
	  private String address;
	  private String phone;
	  
	 public  USer(String name,String password,String email,String address,String phone){
		  this.name=name;
		  this.password=password;
		  this.email=email;
		  this.address=address;
		  this.phone=phone;
				  
	  }
	 public USer()
	 {
		 
	 }
	  public String getName() {
	  return name;
	  }
	  public void setName(String name) {
	  this.name = name;
	  }
	  public String getPassword() {
	  return password;
	  }
	  public void setPassword(String password) {
	  this.password = password;
	  }
		  
	  public String getEmail() {
	  return email;
	  }
	  public void setEmail(String email) {
	  this.email = email;
	  }
	  public String getAddress() {
	  return address;
	  }
	  public void setAddress(String address) {
	  this.address = address;
	  }
	  public String getPhone() {
	  return phone;
	  }
	  public void setPhone(String phone) {
	  this.phone = phone;
	  }
	}

