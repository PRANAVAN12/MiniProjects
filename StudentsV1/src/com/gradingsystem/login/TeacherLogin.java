package com.gradingsystem.login;

import java.util.Arrays;
import java.util.Scanner;

import com.gradingsystem.control.AddMarks;
import com.gradingsystem.control.AddUser;
import com.gradingsystem.control.FindHighestMarks;
import com.gradingsystem.control.Grade;

import com.gradingsystem.control.Ranking;
import com.gradingsystem.control.RemoveUser;
import com.gradingsystem.control.Sum;

public class TeacherLogin {

	public static String username[] = { "Teach", "lloyd", "dekudeku" };

	public static String password[] = { "123", "samson", "deku" };

	public static String userOne = "", userOneP = "";
	public static int[] Phy = {45,78,45};
	public static int Che[] = {78,65,52};
	public static int Mat[] = {78,52,89};
	public static int y;
	public static int phymarks, Mathsmarks, CheMarks;
	public static String elem, usr, pass;

	public static int storeLog = 0;
	public static int length = username.length;

	private static Scanner sc;

	private static Scanner sc2;
 

	public static void Login() {
		sc = new Scanner(System.in);

		System.out.println("TEACHERS LOGIN");
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
			System.out.println("Success");
			assaign();

		} else {
			System.out.println("Wrong!");
			Login();
		}
	}

	static void ontinue() {
		System.out.println("If you want to continue press Y and terminate press N");
		String s = sc2.nextLine();
		if (s == "Y") {
			assaign();
		} else if (s == "N") {
			System.err.println("see You Again....!!!");
		}

	}

	static void assaign() {

		sc2 = new Scanner(System.in);

	
		TeacherLogin t = new TeacherLogin();

		System.out.println("Add PhySics marks press 1");
		System.out.println("Add Maths marks press 2");
		System.out.println("Add chemistry marks press 3");
		System.out.println("Find Maths Highest marks press 4");
		System.out.println("Find Chemistry Highest marks press 5");
		System.out.println("Find Physics Highest marks press 6");
		System.out.println("Remove User press 7");
		System.out.println("Add User press 8");
		System.out.println("Print ReportCard press 9");
		y = sc2.nextInt();

		switch (y) {
		case 1:
			System.out.println("Add Physics Marks  ");

			t.Phy = AddMarks.addX(Phy);
			System.out.println("" + Arrays.toString(Phy));

			break;

		case 2:
			System.out.println("Add Maths Marks ");

			t.Mat = AddMarks.addX(Mat);
			System.out.println("" + Arrays.toString(Mat));
			break;
		case 3:
			System.out.println("Add Che Marks ");

			t.Che = AddMarks.addX(Che);
			System.out.println("" + Arrays.toString(Che));

			break;

		case 4:
			System.out.println("Find Maths Highest ");
			FindHighestMarks.largest(Mat);
			break;

		case 5:
			System.out.println("Find Chemistry Highest");
			FindHighestMarks.largest(Che);

			break;
		case 6:
			System.out.println("Find Physics Highest");
			FindHighestMarks.largest(Phy);

			break;
		case 7:
			System.out.println("Remove User");
			System.out.println("" + Arrays.toString(StudentsLogin.username));
			StudentsLogin.username = RemoveUser.removeTheElement(StudentsLogin.username);
			System.out.println("After Removing username " + Arrays.toString(StudentsLogin.username));
			System.out.println("" + Arrays.toString(StudentsLogin.password));
			StudentsLogin.password = RemoveUser.removeTheElement(StudentsLogin.password);
			System.out.println("After removing  password" + Arrays.toString(StudentsLogin.password));

			break;
		case 8:
			System.out.println("ADD New User");
			System.out.println("Username" + Arrays.toString(StudentsLogin.username));
			StudentsLogin.username = AddUser.add(StudentsLogin.username);
			System.out.println("After Add user name" + Arrays.toString(StudentsLogin.username));

			System.out.println("Passwords" + Arrays.toString(StudentsLogin.password));
			StudentsLogin.password = AddUser.add(StudentsLogin.password);
			System.out.println("After add password " + Arrays.toString(StudentsLogin.password));

			break;
		case 9:
			System.out.println("Print Report");
			System.out.println(
					"   Username   Physics_Marks  Physics_Grade   Chemistry_Marks Chemistry_Grade  Maths_Marks Maths_Grade  ");

			for (int i1 = 0; i1 < StudentsLogin.username.length; i1++) {
				System.out.println(" Username :  " + StudentsLogin.username[i1] + " Physics Marks :  " + Phy[i1]
						+ " Chemistry Marks   :  " + Che[i1] + "  Maths Marks  :  " + Mat[i1] + Grade.findgrade(Phy[i1])
						+ Grade.findgrade(Che[i1]) + Grade.findgrade(Mat[i1]) +"  Total Marks : "+ Sum.sum(Che[i1], Phy[i1], Mat[i1]));
			}
			// System.out.println("Maths Highest " +FindHighestMarks.largest(Mat)+
			// "Chemistry Highest "+FindHighestMarks.largest(Che)+"Physics Highest
			// "+FindHighestMarks.largest(Phy));
			break;
		case 10:
			System.err.println("The system Going To ShutDown........!!");
			break;
		default:
			System.out.println("You Entered wrong menuOption");

		}

	}

}