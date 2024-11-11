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

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
