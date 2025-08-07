package com.java.Hospital;


import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner; 

import Service.Hospital_Service;

public  class Main {
	
	public static void main(String args[]) {
		Hospital_Service obj =new Hospital_Service();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("************************Hospital Management System******************");
			System.out.println("1.Add Doctor");
			System.out.println("2.Add patient");
			System.out.println("3.Add Staff");
			System.out.println("4.Exit");
			//System.out.println("5.Add Doctor");
			System.out.println("Enter your choice");
			
		  int Choice=sc.nextInt();
		  String name="";
			int age=0;
			String gender ="";
			String id=" ";
		  switch (Choice) {
		case 1: 
			
			System.out.println("Enter the Name");
			 name=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the age ");
			 age=sc.nextInt();
			 
			 sc.nextLine();			
			System.out.println("Enter the gender");
			 gender=sc.nextLine();
			
			System.out.println("Enter the Id");
			 id=sc.nextLine();
			 
			 sc.nextLine();
			
			System.out.println("Enter the specialization");
			String specialization=sc.nextLine();
			
			System.out.println("Enter the department");
			String department=sc.nextLine();
			
			Doctor doc= new Doctor(name, age,gender , id);
			doc.setSpecialization(specialization);
			doc.setSpecialization(department);
			obj.addDoctor(doc);
			System.out.println("Doctor added successfully!");

			
			break;
		case 2:
			System.out.println("Enter the name ");
			 name= sc.nextLine();
			 sc.nextLine();
			
			System.out.println("Enter the age");
			age=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the id");
			id=sc.nextLine();
			
			System.out.println("Enter the gender");
			gender=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the disease");
			String disease=sc.nextLine();
			
			System.out.println("Enter the status");
			String status=sc.nextLine();
			
			System.out.println("Enter the room no");
			int roomno=sc.nextInt();
			
			Patient pat= new Patient(name, age,id, gender);
			pat.setDisease(disease);
			pat.setStatus(status);
			pat.setRoomno(roomno);
			obj.addPatient(pat);
			System.out.println("Patient added successfully");
			
			break;
		case 3:
			System.out.println("Enter the name");
			name=sc.nextLine();
			sc.nextLine();
			
			System.out.println("Enter the age");
			age=sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the id");
			id=sc.nextLine();
			System.out.println("Enter the gender");
			gender=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the shift");
			String shift=sc.nextLine();
			System.out.println("Enter the role");
			String role=sc.nextLine();
			nurse st=new nurse(name,age,id,gender);
			st.setshift(shift);
			st.setRole(role);
			obj.addStaff(st);
			System.out.println("Staff is added successfully");
			break;
		case 4:
		
		System.out.println("exiting");
		System.exit(0);
		default:
			System.out.println("Invalid choice please try again");
	}
}
	}
}

