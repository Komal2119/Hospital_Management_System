package com.java.Hospital;

public class Patient extends Person{

	public Patient(String name, int age, String gender, int id) {
		super(name, age, gender, id);
		
		// TODO Auto-generated constructor stub
	}
	String disease;
	String status;
	String roomno;
	
	

	public String getDisease() {
		return disease;
	}



	public void setDisease(String disease) {
		this.disease = disease;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getRoomno() {
		return roomno;
	}



	public void setRoomnoString(String roomnoString) {
		this.roomno = roomno;
	}



	@Override
	void displayDetails() {
		System.out.println("patient Name:"+getName());
     	System.out.println("patient age:"+getAge());
		System.out.println("patient gender:"+getGender());
		System.out.println("patient ID:"+getId());
		System.out.println("patient Disease:"+disease);
		System.out.println("patient Status:"+status);
		System.out.println("patient Status:"+roomno);
	
		
	}

}
