package com.coderscampus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CollegeCourseApplication {

	public static void main(String[] args) throws IOException {

		FileService fileService = new FileService();
		Student[] students = fileService.read("student-master-list.csv");

		StudentService studentService = new StudentService();
		College college = studentService.splitByCourse(students);

		int i = 1;
		for (Student[] courseList : college.getcourses()) {
			fileService.write("course" + i, courseList);
			i++;
		}
	}
}
