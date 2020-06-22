
package com.gradingsystem.main;

import java.util.Scanner;

import com.gradingsystem.login.StudentsLogin;
import com.gradingsystem.login.TeacherLogin;

public class Display {

	private static Scanner sc;

	public static void main(String[] args) {
		int i;
		sc = new Scanner(System.in);

		System.err.println("************************WELCOME***********************************");

		System.out.println("*****************************STUDENTS LOGIN***********************");
		System.out.println("*****************************PRESS 1******************************");

		System.out.println("******************************************************************");
		System.out.println("*****************************TEACHERS LOGIN***********************");
		System.out.println("*****************************PRESS 2******************************");
		i = sc.nextInt();
		switch (i) {
		case 1:
			StudentsLogin.Login();
			break;
		case 2:
			TeacherLogin.Login();

		}
	}

}
