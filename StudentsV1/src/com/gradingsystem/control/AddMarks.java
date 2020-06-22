package com.gradingsystem.control;

import java.util.Scanner;

public class AddMarks {
	static Scanner sc = new Scanner(System.in);

	public static int[] addX(int arr[]) {
		
		int[] destArray = new int[arr.length+1];
		 int elementToAdd;
		 System.out.println("Enter the element to add");
		 elementToAdd=sc.nextInt();
	 
	    for(int i = 0; i < arr.length; i++) {
	        destArray[i] = arr[i];
	    }
	 
	    destArray[destArray.length - 1] = elementToAdd;
	    return destArray;
	}
	
}
