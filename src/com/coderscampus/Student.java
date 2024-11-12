package com.coderscampus;

public class Student {

	private String id;
	private String name;
	private String course;
	private String grade;

	public Student(String id, String name, String course, String grade) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "," + " grade=" + grade + "]";
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcourse() {
		return course;
	}

	public void setcourse(String course) {
		this.course = course;
	}

	public String getgrade() {
		return grade;
	}

	public void setgrade(String grade) {
		this.grade = grade;
	}

}
