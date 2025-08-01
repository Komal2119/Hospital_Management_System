package com.java.Hospital;

public abstract class Staff extends Person {

	public Staff(String name, int age, String gender, int id) {
		super(name, age, gender, id);
		// TODO Auto-generated constructor stub
	}
private String Role;
private String Shift;
public String getRole() {
	return Role;
}
public void setRole(String Role) {
	this.Role=Role;
}
public String getShift() {
	return Shift;
}
public void setshift(String Shift) {
	this.Shift=Shift;
}

void Displaydetails() {
	System.out.println("Doctor Name:"+getName());
	System.out.println("Doctor age:"+getAge());
	System.out.println("Doctor gender:"+getGender());
	System.out.println("Doctor ID:"+getId());
	System.out.println("Doctor Role:"+Role);
	System.out.println("Doctor Shift:"+Shift);
}
}
