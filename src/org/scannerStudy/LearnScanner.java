package org.scannerStudy;

import java.util.Scanner;

public class LearnScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int empId = s.nextInt();
		System.out.println("Employee Id is:"+empId);
		String empName = s.next();
		System.out.println("Employee Name is:"+empName);
		String empEmail = s.next();
		System.out.println("Employee email is:"+empEmail);
		long empPhone = s.nextLong();
		System.out.println("Employee Phone no is:"+empPhone);
		float empSalary = s.nextFloat();
		System.out.println("Employee Salary is:"+empSalary);
		String empGender = s.next();
		System.out.println("Employee Gender is "+ empGender);
		String empCity = s.next();
		System.out.println("Employee city is:"+empCity);
	    
	
	}
	
	

}
