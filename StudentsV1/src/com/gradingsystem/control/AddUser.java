package com.gradingsystem.control;

import java.util.Scanner;

public class AddUser {
	static Scanner sc = new Scanner(System.in);

	public  static String[] add(String[] srcArray) {
		String[] destArray = new String[srcArray.length+1];
		 String elementToAdd;
		 System.out.println("Enter the element to add");
		 elementToAdd=sc.nextLine();
	 
	    for(int i = 0; i < srcArray.length; i++) {
	        destArray[i] = srcArray[i];
	    }
	 
	    destArray[destArray.length - 1] = elementToAdd;
	    return destArray;
	}
}
