package com.coderscampus;

public class Runnable {

	public static void main(String[] args) {

		FileService fileService = new FileService();
		College[] campus = fileService.readFile("student-master-list.csv");
		System.out.println(campus);

	}

}
