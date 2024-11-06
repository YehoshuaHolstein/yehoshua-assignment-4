package com.coderscampus;

import java.util.Arrays;

public class Runnable {

	public static void main(String[] args) {

		FileService fileService = new FileService();
		College[] campus = fileService.readFile("student-master-list.csv");
		for (College student : campus) {
			System.out.println(student);
		}
	}

}
