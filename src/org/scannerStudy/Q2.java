package org.scannerStudy;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int studentId = s.nextInt();		
		System.out.println("Student Id is:  "+studentId);
		String studentName = s.next();
		System.out.println("Student Name is:    "+studentName);
		int M1 = s.nextInt();
		int M2 = s.nextInt();
		int M3 = s.nextInt();
		int M4 = s.nextInt();
		int M5 = s.nextInt();
		int total = 0;
		total = total + M1+M2+M3+M4+M5;
		/*int Average =0;
		Average= total/5;*/
		System.out.println("total is:   "+ total);
		System.out.println("Average is:    "+ total/5);
		
	}

}
