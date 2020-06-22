package com.gradingsystem.login;

import java.util.Arrays;
import java.util.Scanner;

import com.gradingsystem.control.AddMarks;
import com.gradingsystem.control.Grade;
import com.gradingsystem.control.Sum;

public class StudentsLogin {

	public static String username[] = { "Tom", "Cruse", "Jackie" };

	public static String password[] = { "123", "456", "456" };

	public static String userOne = "", userOneP = "";

	public static int storeLog = 0;
	public static int length = username.length;

	private static Scanner sc;

	public static void Login() {
		sc = new Scanner(System.in);

		System.out.println(" STUDENTS LOGIN");
		System.out.print("Enter username:");
		userOne = sc.next();
		System.out.print("Enter password:");
		userOneP = sc.next();

		for (int i = 0; i <= length; i++) {
			if (userOne.equals(username[i])) {
				storeLog = i;
				break;
			}

		}
		Checker();

	}

	static void Checker() {
		if (userOne.equals(username[storeLog]) && userOneP.equals(password[storeLog])) {
			System.out.println("SuccessFully Logged in");

			System.out.println("1.View Report Card");
			System.out.println("2.Exit");
			TeacherLogin t = new TeacherLogin();
			Scanner sc2 = new Scanner(System.in);
			int y = sc2.nextInt();

			switch (y) {
			case 1:
				System.out.println("********************REPORT CARD******************************** ");

				for (int i1 = 0; i1 < StudentsLogin.username.length; i1++) {
					System.out.println(" Username :  " + StudentsLogin.username[i1] + " Physics Marks :  " + t.Phy[i1]
							+ " Chemistry Marks   :  " + t.Che[i1] + "  Maths Marks  :  " + t.Mat[i1]
							+ Grade.findgrade(t.Phy[i1]) + Grade.findgrade(t.Che[i1]) + Grade.findgrade(t.Mat[i1])
							+ "  Total Marks : " + Sum.sum(t.Che[i1], t.Phy[i1], t.Mat[i1]));
				}

				break;

			case 2:
				System.out.println("System Going to ShutDown.........!!!!! Bye Bye ");

				break;

			}
		} else {
			System.out.println("Wrong!");
			Login();
		}
	}

}