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

		FileServiceWriter fileServiceWriter = new FileServiceWriter();

		fileServiceWriter.CreateFile("course1", course1List);
		fileServiceWriter.CreateFile("course2", course2List);
		fileServiceWriter.CreateFile("course3", course3List);

	}
}
