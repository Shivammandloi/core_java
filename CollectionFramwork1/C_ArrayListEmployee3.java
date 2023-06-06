package com.rays.CollectionFramwork1;

public class C_ArrayListEmployee3 {
	
	private int id;
	private String name;
	private int age;
	
	public C_ArrayListEmployee3(int id, String name,int age) {   //constructor
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {        //toString method
		// TODO Auto-generated method stub
		return this.id+" "+this.name+" "+this.age;
	}
	}


