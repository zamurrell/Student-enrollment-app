package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor - name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		System.out.print("Enter year of student:\n 1 for freshman,\n 2 for sophomore,\n 3 for junior,\n 4 for senior:");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
	}
	
	// Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in Courses
	public void enroll() {
		// Get inside a loop, user hits 0 when done enrolling
		do {
			System.out.print("Enter course to enroll, (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals( "Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { 
				break;
				}
		} while ( 1 != 0);
	}
	// View balance and pay tuition
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	public void payTuition() {
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of " + payment);
		viewBalance();
	}
	
	// Status of the student - show/print
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
