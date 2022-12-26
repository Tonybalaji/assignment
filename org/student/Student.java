package org.student;

import org.department.Department;

public class Student extends  Department
{
	public void   studentName()
	{
		System.out.println("Tony Balaji");
	}
	
	public void   studentDept()
	{
		System.out.println("Cs");
	}
	
	public void   studentId()
	{
		System.out.println("1008");
	}
	
	public static void main(String[] args)
	
	{
	Student stu =new Student();
	
	stu.collegeName();
	
	stu.collegeCode();
	
	stu.collegeRank();
	
	stu.deptName();
	
	stu.studentName();
	
	stu.studentDept();
	
	stu.studentId();
		
		
	}
}