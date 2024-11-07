package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;

public class Runnable {

	public static void main(String[] args) throws IOException {

		FileService fileService = new FileService();
		College[] campus = fileService.readFile("student-master-list.csv");
		System.out.println("Overall list, Grade desc");
		for (College student : campus) {
			System.out.println(student);
		}
		CollegeService collegeService = new CollegeService();
		CollegeServiceContainer collegeServicecontainer = collegeService.splitter(campus);
		System.out.println("Course1 list");
		College[] course1List = collegeServicecontainer.getCourse1();
		for (College result1 : course1List) {
			System.out.println(result1);
		}
		System.out.println("Course2 list");
		College[] course2List = collegeServicecontainer.getCourse2();
		for (College result2 : course2List) {
			System.out.println(result2);
		}
		System.out.println("Course3 list");
		College[] course3List = collegeServicecontainer.getCourse3();
		for (College result3 : course3List) {
			System.out.println(result3);
		}
	}

}
