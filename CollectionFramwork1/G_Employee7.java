package com.rays.CollectionFramwork1;

public class G_Employee7 {
	private Integer id;
	private String name;
	private Integer age;

	public G_Employee7(int id, String name, int age) {
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
	public int hashCode() {     //hashcode method
		return id.hashCode() + name.hashCode() + age.hashCode(); // particular ek ke liye
		// return super.hashCode(); //all ke liye

	}

	@Override
	public boolean equals(Object obj) {       //equal method
		G_Employee7 w = (G_Employee7)obj;
		  return this.id.equals(w.id);
		//return name.equals(obj);

	}

}
