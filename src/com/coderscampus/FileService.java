package com.coderscampus;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class FileService {

	public College[] readFile(String filePath) {

		String line;
		int index = 0;
		String IDcheck;
		College[] masterCourse = new College[100];
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			while ((line = bufferedReader.readLine()) != null) {
				String[] studentData = line.split(",");
				IDcheck = studentData[0];
				if (!IDcheck.equals("﻿Student ID")) {
					College college = new College(studentData[0], studentData[1], studentData[2], studentData[3]);
					masterCourse[index] = college;
					index++;
				}
			}
		} catch (IOException e) {
			System.out.println("There was a problem: " + e.getMessage());
		}

		Arrays.sort(masterCourse, new Comparator<College>() {

			@Override
			public int compare(College firstCourse, College secondCourse) {
				if (firstCourse == null && secondCourse == null) {
					return 0;
				}
				if (firstCourse == null) {
					return 1;
				}
				if (secondCourse == null) {
					return -1;
				}
				return firstCourse.getCourse().compareTo(secondCourse.getCourse());
			}
		});

		return masterCourse;
	}
}
