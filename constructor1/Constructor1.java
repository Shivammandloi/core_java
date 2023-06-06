package com.rays.oop.constructor1;

public class Constructor1 {
	

		private String color = null;
		private int borderWidth = 0;

		public Constructor1() {

		}

		public Constructor1(String color) {
			this.color = color;
		}

		public Constructor1(int borderWidth) {
			this.borderWidth = borderWidth;
		}
		public Constructor1(String color ,int borderWidth) {   //parmeterized constrocter
			this.color= color;
			this.borderWidth = borderWidth;            //constructor overloading
		}                                                   

		public String getColor() {
			return color;
		}
		public int getBorderWidth() {
			return borderWidth;
		}

	}



