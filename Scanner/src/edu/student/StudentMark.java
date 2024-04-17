package edu.student;

import java.util.Scanner;

public class StudentMark {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Student reg. no. : ");
		int regNo = in.nextInt();
		in.nextLine();

		System.out.println("Enter the Student Name : ");
		String stuName = in.nextLine();

		System.out.println("Enter the suject 1 mark : ");
		int mark1 = in.nextInt();
		in.nextLine();

		System.out.println("Enter the suject 2 mark : ");
		int mark2 = in.nextInt();
		in.nextLine();

		System.out.println("Enter the suject 3 mark : ");
		int mark3 = in.nextInt();
		in.nextLine();

		System.out.println("Enter the suject 4 mark : ");
		int mark4 = in.nextInt();
		in.nextLine();

		System.out.println("Enter the suject 5 mark : ");
		int mark5 = in.nextInt();
		in.nextLine();

		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		int arg = total / 5;

		System.out.println("Student Name : " + stuName);
		System.out.println("Student Reg. No. : " + regNo);
		System.out.println("Total Mark : " + total);
		System.out.println("Average Mark : "+arg);
	}

}
