package org.employeedata;

import java.util.Scanner;

public class EmployeeData {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Employee Id : ");
		int empId = in.nextInt();
		in.nextLine();
		System.out.println("Enter Employee Name : ");
		String empName = in.nextLine();

		System.out.println("Enter Employee Email ID : ");
		String empEmail = in.nextLine();

		System.out.println("Enter the Phone NO. : ");
		long empPhoneno = in.nextLong();
		in.nextLine();
		System.out.println("Enter the Employee Salary : ");
		int empSalary = in.nextInt();
		in.nextLine();
		System.out.println("Enter the Employee Gender : ");
		String empGender = in.nextLine();

		System.out.println("Enter the Employee City : ");
		String empCity = in.nextLine();

	}
}
