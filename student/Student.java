package org.student;

import org.department.Department;

public class Student extends Department{
public void studentName() {
	System.out.println("Student Name:Puhal");
}
public void studentDept() {
	System.out.println("Department:Civil");
}
public void studentId() {
	System.out.println("14CER152");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student();
obj.collegeName();
obj.collegeCode();
obj.collegeRank();
obj.departmentName();
obj.studentName();
obj.studentDept();
obj.studentId();
	}

}
