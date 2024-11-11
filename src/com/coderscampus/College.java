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

	public Student[] getCourse1() {
		return course1;
	}

	public void setCourse1(Student[] course1) {
		this.course1 = course1;
	}

	public Student[] getCourse2() {
		return course2;
	}

	public void setCourse2(Student[] course2) {
		this.course2 = course2;
	}

	public Student[] getCourse3() {
		return course3;
	}

	public void setCourse3(Student[] course3) {
		this.course3 = course3;
	}

	public Student[][] getCourses() {
		return new Student[][] { course1, course2, course3 };
	}

}
