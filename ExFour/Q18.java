package com.rays.ExFour;

public class Q18 {
	public static void main(String[] args) {
		int a[] = {9 , 8, 7 , 6 , 5 , 4};
		int d = position(a,5);
	}

	private static int position(int[] arr, int number) {
		// TODO Auto-generated method stub
		int d = 0;
		for(int i = 0; i<arr.length; i++) {
			if(number == arr[i]) {
				d = i;
				break;
			} else if(number != arr[i]) {
				d = -1;
			}
		}
		System.out.println(number + " : is at index = " +d);
		return d;
	}

}
