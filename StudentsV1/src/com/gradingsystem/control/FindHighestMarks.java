package com.gradingsystem.control;

public class FindHighestMarks {

	public static void largest(int[] a) {
		int max;
		max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("Maximum value: " + max);
	}
}