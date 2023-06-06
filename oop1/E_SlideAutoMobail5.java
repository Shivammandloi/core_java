package com.rays.oop1;

public class E_SlideAutoMobail5 {
	
	private String color = null;
	private int speed = 0;
	private String make = null;
	public static int NO_OF_GEAR = 10;
	private int changeGear = 0;
	private int accelerator = 0;	
	
	public void setColor(String c) {
		color = c;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public int getSpeed() {
		return speed;
	}
	public void setMake(String m) {
		make = m;
	}
	public String getMake() {
		return make;
	}
	public void setNO_OF_GEAR(int n) {
		NO_OF_GEAR = n;
	}
	public int getNO_OF_GEAR() {
		return NO_OF_GEAR;
	}
	public void setChangeGear(int cg) {
		changeGear = cg;
	}
	public int getChangeGear() {
		return changeGear;
	}
	public void setAccelerator(int ac) {
		accelerator = ac; 
	}
	public int getAccelerator() {
		return accelerator;
	}

}
