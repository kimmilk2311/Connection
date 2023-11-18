package com.java.be;

public class User {
     public User(String firstName, String lastName, String doB, String poB, String sex, String[] freeday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.doB = doB;
		this.poB = poB;
		this.sex = sex;
		this.freeday = freeday;
	}
     public User() {
    	 
     }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDoB() {
		return doB;
	}
	public void setDoB(String doB) {
		this.doB = doB;
	}
	public String getPoB() {
		return poB;
	}
	public void setPoB(String poB) {
		this.poB = poB;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getFreeday() {
		return freeday;
	}
	public void setFreeday(String[] freeday) {
		this.freeday = freeday;
	}
	String firstName;
     String lastName;
     String doB;
     String poB;
     String sex;
     String[] freeday;
}
