package com.coderscampus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileServiceWriter {

	public void CreateFile(String fileName, College[] course) throws IOException {

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".csv"))) {
			writer.write("Student ID" + "," + "Student Name" + "," + "Course" + " ," + "Grade\n");
			for (College result : course) {
				writer.write(result.getStudentID() + "," + result.getStudentName() + "," + result.getCourse() + ","
						+ result.getGrade() + "\n");
			}
		}

	}
}
