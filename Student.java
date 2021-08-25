package org.student;


import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("studentName : zzzzz");
	}
	public void studentDept() {
		System.out.println("studentDept : ccccc");
	}
	public void studentId() {
		System.out.println("studentId : 12345");
	}
	public static void main(String[] args) {
		
		Student std = new Student();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.deptName();
		std.studentDept();
		std.studentId();
		std.studentName();
	}
}
