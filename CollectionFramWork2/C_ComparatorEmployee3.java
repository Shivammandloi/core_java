package com.rays.CollectionFramWork2;

import java.util.Comparator;

public class C_ComparatorEmployee3 {
	private Integer id;
	private String name;
	private Integer age;

	public C_ComparatorEmployee3(Integer id, String name, Integer age) {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() { // toString method
		return this.id + " " + this.name + " " + this.age;
	}

	@Override
	public int hashCode() { // hashcode method
		return id.hashCode() + name.hashCode() + age.hashCode(); // particular ek ke liye
		// return super.hashCode(); //all ke liye

	}

	@Override
	public boolean equals(Object obj) { // equals method
		if (obj == null) {
			System.out.println("in obj");
			return false;
		}
		if (!(obj instanceof C_ComparatorEmployee3)) {
			System.out.println("in ins");
			return false;
		}

		C_ComparatorEmployee3 other = (C_ComparatorEmployee3) obj;
		System.out.println(this.age);
		System.out.println(other.age);
		//if (this.name == other.name && this.id.intValue() == other.id.intValue() && this.age.intValue() == other.age.intValue()) {    //127 se uper age lene par
		  if (this.name == other.name && this.id == other.id && this.age == other.age) {
			return true;
		} else {
			System.out.println("in else");
			return false;
		}
	}

	public int compareTo(C_ComparatorEmployee3 ob) { // compareTo method
		if (this.id == ob.id && this.name == ob.name) {
			return this.age.compareTo(ob.age);
			// return -1;
		} else {
			return this.id.compareTo(ob.id);
			// return 0;
		}

	}

} // class end

class OrderByName implements Comparator<C_ComparatorEmployee3> {

	@Override
	public int compare(C_ComparatorEmployee3 o1, C_ComparatorEmployee3 o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

