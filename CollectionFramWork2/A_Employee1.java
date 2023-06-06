package com.rays.CollectionFramWork2;

public class A_Employee1 {

	private Integer id;
	private String name;
	private Integer age;

	public A_Employee1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int hashCode() { // hashcode method
		return id.hashCode() + name.hashCode() + age.hashCode(); // particular ek ke liye
		// return super.hashCode(); //all ke liye

	}

	@Override
	public boolean equals(Object obj) { // equal method
		if (obj == null)
			return false;
		if (!(obj instanceof A_Employee1))
			return false;

		A_Employee1 other = (A_Employee1) obj;
		return (this.name.equals(other.name) && this.age.equals(other.age) && this.id.equals(other.id));
	}

}
