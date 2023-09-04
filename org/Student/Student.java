package org.Student;

import org.Department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("The student name is Mercy");

	}
	public void studentDept() {
		System.out.println("The Depatment of student is ECE");

	}
	public void studentID() {
		System.out.println("The student ID is OE101");

	}
public static void main(String[] args) {
	Student ST = new Student();
	ST.collegeCode();
	ST.collegeName();
	ST.collegeRank();
	ST.deptName();
	ST.studentDept();
	ST.studentID();
	ST.studentName();
}
}
