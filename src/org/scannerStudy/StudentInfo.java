package org.scannerStudy;

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int studentId = s.nextInt();
		System.out.println("Student Id is:  "+studentId);
		String studentName = s.next();
		System.out.println("Student Name is:  "+studentName);
		String studentEmail = s.next();
		System.out.println("Student Email is:"+ studentEmail);
		long studentPhone = s.nextLong();
		System.out.println("Student Phone is: "+studentPhone);
		String studentDept = s.next();
		System.out.println("Student Dept is: "+studentDept);
		String studentGender = s.next();
		System.out.println("Student Gender is:  "+studentGender);
		String studentCity = s.next();
		System.out.println("Student city is:  "+studentCity);
		
	}

}

