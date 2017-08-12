package com.example.model;

import org.springframework.hateoas.ResourceSupport;

public class User extends ResourceSupport {
	
	

	private String name;
	private String lastname;
	private String password;
	private String email;
	private String phone;
	private String contactPreference;
	private String username;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContactPreference() {
		return contactPreference;
	}
	public void setContactPreference(String contactPreference) {
		this.contactPreference = contactPreference;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	@Override
    public String toString() {
        return String.format(
                "User["
                + "email=%s,"
                + "name = %s,"
            	+ "lastname = %s,"
            	 + "password= %s,"
            	+ "phone= %s,"
            	+ "contactPreference= %s,"
            + "username= %s]",
            email,name, lastname, password, phone, contactPreference, username);
    }
	
}



