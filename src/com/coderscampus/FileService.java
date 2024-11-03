package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	public College[] readFile(String filePath) {

		String line;
		int index = 0;
		College[] courseArray = new College[3];
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			while ((line = bufferedReader.readLine()) != null) {
				String[] studentData = line.split(",");
				System.out.println("pre-parseInt");
				System.out.println(studentData[3]);
				Integer myIntVal = Integer.parseInt(studentData[3]);
				System.out.println(myIntVal);
				College college = new College(studentData[0], studentData[1], studentData[2], myIntVal);
				courseArray[index] = college;
				index++;
			}
		} catch (IOException e) {
			System.out.println("There was a problem: " + e.getMessage());
		}

		return courseArray;
	}

}
