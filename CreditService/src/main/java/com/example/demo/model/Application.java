package com.example.demo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Application {


	@Id
	private String email;
	
	private String name;
	private String lastname;
	private String password;
	private String phone;
	private String contactPreference;
	private String username;
	private String status;
	private String address;
	private String address2;
	private String city;
	private String zip;
	private String startLivingDT;
	private String married;
	private String veteran;
	private String bankName;
	private String bankAccount;
	private String bankAmount;
	private String bankAmountToSpend;
	private String employeerCurrent;
	private String employeeDT;
	private ResponseStatus applicationStatus;
	
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getStartLivingDT() {
		return startLivingDT;
	}
	public void setStartLivingDT(String startLivingDT) {
		this.startLivingDT = startLivingDT;
	}

	public void setSpendingAmount(String spendingAmount) {
		spendingAmount = spendingAmount;
	}
	public String getMarried() {
		return married;
	}
	public void setMarried(String married) {
		this.married = married;
	}
	public String getVeteran() {
		return veteran;
	}
	public void setVeteran(String veteran) {
		this.veteran = veteran;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankAmount() {
		return bankAmount;
	}
	public void setBankAmout(String bankAmount) {
		this.bankAmount = bankAmount;
	}
	public String getBankAmountToSpend() {
		return bankAmountToSpend;
	}
	public void setBankAmountToSpend(String bankAmountToSpend) {
		this.bankAmountToSpend = bankAmountToSpend;
	}
	public String getEmployeerCurrent() {
		return employeerCurrent;
	}
	public void setEmployeerCurrent(String employeerCurrent) {
		this.employeerCurrent = employeerCurrent;
	}
	public String getEmployeeDT() {
		return employeeDT;
	}
	public void setEmployeedDT(String employeeDT) {
		this.employeeDT = employeeDT;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Application["
                + "email=%s,"
                + "name = %s,"
            	+ "lastname = %s,"
            	 + "password= %s,"
            	+ "phone= %s,"
            	+ "contactPreference= %s,"
            + "username= %s,"
            + "status= %s,"
            	+ "address= %s,"
            	+ "address2= %s,"
            	+"city= %s,"
            	+"zipcode= %s,"
            +"startLivingDT= %s,"
            +	"spendingAmount= %s,"
            +	"married= %s,"
            +	 "veteran= %s,"
            +	"bankName= %s,"
            +	"bankAccount= %s,"
            +	"bankAmout= %s,"
            +	"bankAmountToSpend= %s,"
            +	"employeerCurrent= %s,"
            +	"applicationStatus= %s,"
            +	"employeedDT= %s]",
            email,name, lastname, password, phone, contactPreference, username, status, address, address2, 
            city, zip, startLivingDT, married, veteran, bankName, bankAccount,
            bankAmount, bankAmountToSpend, employeerCurrent,applicationStatus, employeeDT);
    }
	/**
	 * @return the applicationStatus
	 */
	public ResponseStatus getApplicationStatus() {
		return applicationStatus;
	}
	/**
	 * @param approved the applicationStatus to set
	 */
	public void setApplicationStatus(ResponseStatus approved) {
		this.applicationStatus = approved;
	}
	

	
	
}
