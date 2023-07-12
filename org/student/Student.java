package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student Name: Amithab");
	}
	public void studentDept()
	{
		System.out.println("Student Department: ELC");
	}
	public void studentId()
	{
		System.out.println("student ID: 2003163");
	}
	
	public static void main (String[] args)
	{
		Student st= new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.studentName();
		st.studentDept();
		st.studentId();
		st.deptName();
	}
	
}
