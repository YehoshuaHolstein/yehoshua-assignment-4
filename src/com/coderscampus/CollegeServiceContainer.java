package com.coderscampus;

public class CollegeServiceContainer {

	College[] course1 = new College[33];
	College[] course2 = new College[34];
	College[] course3 = new College[33];

	public CollegeServiceContainer(College[] course1, College[] course2, College[] course3) {
		super();
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
	}

	public College[] getCourse1() {
		return course1;
	}

	public void setCourse1(College[] course1) {
		this.course1 = course1;
	}

	public College[] getCourse2() {
		return course2;
	}

	public void setCourse2(College[] course2) {
		this.course2 = course2;
	}

	public College[] getCourse3() {
		return course3;
	}

	public void setCourse3(College[] course3) {
		this.course3 = course3;
	}

}
