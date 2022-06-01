package Synery_Lab;

import java.util.Scanner;

public class IntToRoman {

	
	 public static void integerToRoman(int num) {

		 if(num < 500) {
	        System.out.println("Integer: " + num);
	        int[] values = {500,400,100,90,50,40,10,9,5,4,1};
	        String[] romanLiterals = {"D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	        StringBuilder roman = new StringBuilder();
     
	       
	        for(int i=0;i<values.length;i++) {
	        	 
	            while(num >= values[i]) {
	                num -= values[i];
	                roman.append(romanLiterals[i]);
	            }
	        }
	        System.out.println("Roman: " + roman.toString());
	    }else {
	    	System.out.println("please enter number less than 500 ! ");
	    }
	 }

	    public static void main(String[] args) {
	    	Scanner sc =new Scanner(System.in);
	    	System.out.print("enter your number : ");
	    	int num =sc.nextInt();
	        integerToRoman(num);
	        
	    }
	}

