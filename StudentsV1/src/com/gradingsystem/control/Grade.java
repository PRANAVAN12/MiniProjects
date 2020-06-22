package com.gradingsystem.control;

public class Grade {
	public static String findgrade(int avg) {

		
		if (avg >= 80) {
			System.out.print(" A ");
		} else if (avg >= 60 && avg < 80) {
			System.out.print(" B ");
		} else if (avg >= 40 && avg < 60) {
			System.out.print(" C ");
		} else {
			System.out.print(" D ");
		}
		return "";
	}
}