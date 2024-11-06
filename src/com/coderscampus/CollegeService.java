package com.coderscampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class CollegeService {

	public void splitter(College[] masterCourse) throws IOException {

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
			if (course.substring(0, 4).equals("APMTH")) {
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

		// sort each array by grade desc : convert string grade -> Integer grade
		String myStringGrade;
		
		for (College student : course1) {
			myStringGrade = student.getGrade();
			Integer myIntGrade = Integer.valueOf(myStringGrade);)
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
		}
	}
}
