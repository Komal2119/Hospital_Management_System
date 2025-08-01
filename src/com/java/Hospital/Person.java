package com.java.Hospital;

public abstract class Person {
	private String name;
	private int age;
	private String gender;
	private int id;
	public Person(String name, int age, String gender, int id) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.id=id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	abstract void displayDetails();
	
}
//person ka obh kabhi nhi banega cuz person is abstract
