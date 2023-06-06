package com.rays.CollectionFramWork2;

public class B_ComparableEmployee2 implements Comparable<B_ComparableEmployee2> {
	private int id;
	private String name;
	private int age;

	public B_ComparableEmployee2(int id, String name, int age) {
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
	public String toString() { // toString method
		return this.id + " " + this.name + " " + this.age;
	}

	@Override
	// public int hashCode() {
	// return id.hashCode() + name.hashCode() + age.hashCode(); // particular ek ke liye
	// return super.hashCode(); //all ke liye

//	}

	// @Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof B_ComparableEmployee2)) {
			return false;
		}

		B_ComparableEmployee2 other = (B_ComparableEmployee2) obj;
		if (this.name == other.name && this.id == other.id && this.age == other.age) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(B_ComparableEmployee2 ob) {
		if (this.id == ob.id && this.name == ob.name) {
			// return this.age.compareTo(ob.age);
			return -1;
		} else {
			// return this.id.compareTo(ob.id);
			return 0;
		}

	}

}
