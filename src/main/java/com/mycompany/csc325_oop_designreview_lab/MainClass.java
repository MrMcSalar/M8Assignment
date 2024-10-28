package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 12: Set the gpa of the student using the scanner and user input

		// Create a Freshman
		Freshman std1 = new Freshman("Shahan", (short) 20, 12);

		// Create a Senior
		// set their GPAs based on user input, and print their details.
		Senior std2 = new Senior("Salar", (short) 30, 90);

		// Prompt user for GPA
		System.out.print("Enter Shahan the Freshman's GPA: ");
		double gpa1 = scanner.nextDouble();
		std1.setGpa(gpa1);

		System.out.print("Enter Salar the Senior's GPA: ");
		double gpa2 = scanner.nextDouble();
		std2.setGpa(gpa2);

		// Print outputs
		System.out.println(std1);
		System.out.println(std2);

		scanner.close();
	}
}
