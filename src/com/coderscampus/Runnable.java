package com.coderscampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Runnable {

	public static void main(String[] args) throws IOException {

		FileService fileService = new FileService();
		College[] campus = fileService.readFile("student-master-list.csv");
		// System.out.println("Overall list, Grade desc");
//		for (College student : campus) {
//			System.out.println(student);
//		}
		CollegeService collegeService = new CollegeService();
		CollegeServiceContainer collegeServicecontainer = collegeService.splitter(campus);
//		System.out.println("Course1 list");
		College[] course1List = collegeServicecontainer.getCourse1();
//		for (College result1 : course1List) {
//			System.out.println(result1);
//		}
//		System.out.println("Course2 list");
		College[] course2List = collegeServicecontainer.getCourse2();
//		for (College result2 : course2List) {
//			System.out.println(result2);
//		}
//		System.out.println("Course3 list");
		College[] course3List = collegeServicecontainer.getCourse3();
//		for (College result3 : course3List) {
//			System.out.println(result3);
//		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("course1.csv"))) {
			for (College result1 : course1List) {
				writer.write(result1.getStudentID() + "," + result1.getStudentName() + "," + result1.getCourse() + ","
						+ result1.getGrade() + "\n");
			}
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("course2.csv"))) {
			for (College result2 : course2List) {
				writer.write(result2.getStudentID() + "," + result2.getStudentName() + "," + result2.getCourse() + ","
						+ result2.getGrade() + "\n");
			}
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("course3.csv"))) {
			for (College result3 : course3List) {
				writer.write(result3.getStudentID() + "," + result3.getStudentName() + "," + result3.getCourse() + ","
						+ result3.getGrade() + "\n");
			}
		}
	}
}
