package com.coderscampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Runnable {

	public static void main(String[] args) throws IOException {

		FileService fileService = new FileService();
		College[] campus = fileService.readFile("student-master-list.csv");

		CollegeService collegeService = new CollegeService();
		CollegeServiceContainer collegeServicecontainer = collegeService.splitter(campus);

		College[] course1List = collegeServicecontainer.getCourse1();
		College[] course2List = collegeServicecontainer.getCourse2();
		College[] course3List = collegeServicecontainer.getCourse3();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("course1.csv"))) {
			writer.write("Student ID" + "," + "Student Name" + "," + "Course" + " ," + "Grade\n");
			for (College result1 : course1List) {
				writer.write(result1.getStudentID() + "," + result1.getStudentName() + "," + result1.getCourse() + ","
						+ result1.getGrade() + "\n");
			}
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("course2.csv"))) {
			writer.write("Student ID" + "," + "Student Name" + "," + "Course" + " ," + "Grade\n");
			for (College result2 : course2List) {
				writer.write(result2.getStudentID() + "," + result2.getStudentName() + "," + result2.getCourse() + ","
						+ result2.getGrade() + "\n");
			}
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("course3.csv"))) {
			writer.write("Student ID" + "," + "Student Name" + "," + "Course" + " ," + "Grade\n");
			for (College result3 : course3List) {
				writer.write(result3.getStudentID() + "," + result3.getStudentName() + "," + result3.getCourse() + ","
						+ result3.getGrade() + "\n");
			}
		}
	}
}
