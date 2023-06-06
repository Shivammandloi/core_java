package com.rays.ExFour;

public class Q11_PrimeNo {

	public static void main(String[] args) {
		    int n = 3;
		    int count =0;
		   
		    for(int i=2;i<n;i++) {
		    
		    		if(n%i==0)
		         
		         {
		    		count++;
		         }
		         
		    	
		    }
		    if(count==0) {
		    	System.out.println(" prime");
		    	
		    }else {
		    	System.out.println("no prime");
		    }
            
	}
		    			    	
}
