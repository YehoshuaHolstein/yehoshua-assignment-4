package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class FileService {

	public Student[] read(String filePath) {

		String line;
		int index = 0;

		Student[] masterCourse = new Student[100];
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			bufferedReader.readLine();
			while ((line = bufferedReader.readLine()) != null) {
				String[] studentData = line.split(",");
				Student student = new Student(studentData[0], studentData[1], studentData[2], studentData[3]);
				masterCourse[index] = student;
				index++;
			}
		} catch (IOException e) {
			System.out.println("There was a problem: " + e.getMessage());
		}

		Comparator<Student> gradeComparator = Comparator.comparing(Student::getGrade,
				Comparator.nullsLast(Comparator.reverseOrder()));
		Arrays.sort(masterCourse, gradeComparator);

		return masterCourse;

	}

	public void write(String fileName, Student[] course) throws IOException {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".csv"))) {
			writer.write("Student ID" + "," + "Student Name" + "," + "Course" + " ," + "Grade\n");
			for (Student result : course) {
				writer.write(result.getID() + "," + result.getName() + "," + result.getCourse() + ","
						+ result.getGrade() + "\n");
			}
		}
	}
}
