package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;

public class Runnable {

	public static void main(String[] args) throws IOException {

		FileService fileService = new FileService();
		College[] campus = fileService.readFile("student-master-list.csv");
		for (College student : campus) {
			System.out.println(student);
		}
		CollegeService collegeService = new CollegeService();
		CollegeServiceContainer collegeServicecontainer = collegeService.splitter(campus);

	}

}
