package com.gradingsystem.control;

public class Sum {

	public static int sum(int i, int y, int z) {
		int sum = 0; // initialize sum
		int i1;

		// Iterate through all elements and add them to sum
		for (i1 = 0; i1 < 3; i1++)
			sum = i + y + z;

		return sum;
	}

}