package com.coderscampus;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Comparator;

public class StudentService {

	public College splitByCourse(Student[] masterCourse) {

		String course;

		Student[] course1 = new Student[33];
		Student[] course2 = new Student[34];
		Student[] course3 = new Student[33];

		int course1Index = 0;
		int course2Index = 0;
		int course3Index = 0;

		for (int i = 0; i < 100; i++) {
			Student student = masterCourse[i];
			course = student.getcourse();
			if (course.startsWith("APMT")) {
				course1[course1Index] = student;
				course1Index++;
			} else if (course.startsWith("COMP")) {
				course2[course2Index] = student;
				course2Index++;
			} else if (course.startsWith("STAT")) {
				course3[course3Index] = student;
				course3Index++;
			}
		}

		return new College(course1, course2, course3);
	}
}
