package com.coderscampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class CollegeService {

	public CollegeServiceContainer splitter(College[] masterCourse) throws IOException {

		String course;

		College[] course1 = new College[33];
		College[] course2 = new College[34];
		College[] course3 = new College[33];

		int course1Index = 0;
		int course2Index = 0;
		int course3Index = 0;

		for (int i = 0; i < 100; i++) {
			College collegeStudent = masterCourse[i];
			course = collegeStudent.getCourse();
			if (course.substring(0, 4).equals("APMT")) {
				course1[course1Index] = collegeStudent;
				course1Index++;
			} else if (course.substring(0, 4).equals("COMP")) {
				course2[course2Index] = collegeStudent;
				course2Index++;
			} else if (course.substring(0, 4).equals("STAT")) {
				course3[course3Index] = collegeStudent;
				course3Index++;
			}
		}

		CollegeServiceContainer collegeGraded = new CollegeServiceContainer(course1, course2, course3);
		return collegeGraded;
	}
}
