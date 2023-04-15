package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Student Name: Suguna");
	}
	public void studentDept()
	{
		System.out.println("Student Department: ECE");
	}
	public void studentId()
	{
		System.out.println("Student id: 983456");
	}
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();		

	}

}
