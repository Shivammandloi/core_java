package com.rays.oop1;

public class E_SlideAutoMobailTest5 {
	public static void main(String[] args) {

		E_SlideAutoMobail5 sa = new E_SlideAutoMobail5();
		sa.setColor("Red");
		sa.setSpeed(100);
		sa.setMake("Maruti Suzuki");
		sa.setNO_OF_GEAR(7);
		sa.setChangeGear(7);
		sa.setAccelerator(1);

		System.out.println(" Color =" + sa.getColor());
		System.out.println(" Speed = " + sa.getSpeed());
		System.out.println(" Make = " + sa.getMake());
		System.out.println(" NO_OF_GEAR = " + sa.getNO_OF_GEAR());
		System.out.println(" ChangeGear = " + sa.getChangeGear());
		System.out.println(" Accelerator = " + sa.getAccelerator());

	}
}
