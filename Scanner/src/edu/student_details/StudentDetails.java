package edu.student_details;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Student ID : ");
		int stuId = in.nextInt();
		in.nextLine();

		System.out.println("Enter the Student Name : ");
		String stuName = in.nextLine();

		System.out.println("Enter the Student Email ID : ");
		String stuEmailId = in.nextLine();

		System.out.println("Enter the Student Phone No. : ");
		String stuPhone = in.nextLine();

		System.out.println("Enter the Student Department : ");
		String stuDept = in.nextLine();

		System.out.println("Enter the Student Gender : ");
		String stuGender = in.nextLine();

		System.out.println("Enter the Student City : ");
		String stuCity = in.nextLine();

	}
}
