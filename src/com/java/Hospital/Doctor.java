package com.java.Hospital;

public class Doctor extends Person {
	public Doctor(String name, int age, String gender, int id) {
		super(name, age, gender, id);

	}
	String speciatization;
	String department;
	
	
	
	public String getSpeciatization() {
		return speciatization;
	}



	public void setSpeciatization(String speciatization) {
		this.speciatization = speciatization;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	
}
