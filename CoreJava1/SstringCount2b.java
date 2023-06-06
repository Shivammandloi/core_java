package com.rays.CoreJava1;

public class SstringCount2b {
	public static void main(String[] args) {
		String str = "Shivam mandloi  Aadesh satyam Nilesh pradeep";
		int count = 0;
		for(char c = 'a'; c<='z'; c++) {
			for(int k =0; k<str.length(); k++) {
				if(str.charAt(k)==c)
				count++;
			}
			if(count>0) {
				System.out.println(c +"="+count);
				count = 0;
			}
		}
	}

}
