package com.rays.CollectionFramWork2;

import java.util.Comparator;

public class D_ComparatorEmployee4 {
	private Integer id;
	private String name;
	private Integer age;
	
	public D_ComparatorEmployee4(Integer id , String name , Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name+" "+this.age;
	}
	

}  //class end


class OByName implements Comparator<D_ComparatorEmployee4>{

	@Override
	public int compare(D_ComparatorEmployee4 o1, D_ComparatorEmployee4 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class OrderById implements Comparator<D_ComparatorEmployee4>{

	@Override
	public int compare(D_ComparatorEmployee4 o1, D_ComparatorEmployee4 o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}
	
}


class OrderByAge implements Comparator<D_ComparatorEmployee4>{

	@Override
	public int compare(D_ComparatorEmployee4 o1, D_ComparatorEmployee4 o2) {
		// TODO Auto-generated method stub
		return o1.getAge().compareTo(o2.getAge());
	}
	
}
