package com.coderscampus;

public class College {

	Student[] course1;
	Student[] course2;
	Student[] course3;

	public College(Student[] course1, Student[] course2, Student[] course3) {
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
	}

	public Student[] getcourse1() {
		return course1;
	}

	public void setcourse1(Student[] course1) {
		this.course1 = course1;
	}

	public Student[] getcourse2() {
		return course2;
	}

	public void setcourse2(Student[] course2) {
		this.course2 = course2;
	}

	public Student[] getcourse3() {
		return course3;
	}

	public void setcourse3(Student[] course3) {
		this.course3 = course3;
	}

	public Student[][] getcourses() {
		return new Student[][] { course1, course2, course3 };
	}

}
