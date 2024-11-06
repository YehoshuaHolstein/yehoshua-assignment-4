package com.coderscampus;

public class College {

	private String studentID;
	private String studentName;
	private String course;
	private String grade;

	public College(String studentID, String studentName, String course, String grade) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "College [studentID=" + studentID + ", studentName=" + studentName + ", course=" + course + ","
				+ " grade=" + grade + "]";
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
