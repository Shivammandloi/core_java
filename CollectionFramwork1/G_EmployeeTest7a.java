package com.rays.CollectionFramwork1;

public class G_EmployeeTest7a {
	public static void main(String[] args) {
		
		G_Employee7 em = new G_Employee7(1,"Pradeep",24);
		G_Employee7 em1 = new G_Employee7(1,"Pradeep",24);
		//Employee7 em2 = new Employee7(1,"patel",29);
		//Employee7 em3 = new Employee7(1,"Chandravanshi",20);
		
		System.out.println(em.hashCode());
		System.out.println(em1.hashCode());
		System.out.println("equal = " + em.equals(em1));
		//System.out.println(em2.hashCode());
		//System.out.println(em3.hashCode());
		
		
	}

}
