package com.abhinavgautam.jackson_demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	public static void main(String[] args) {
		try {
			// Get the object mapper
			ObjectMapper mapper = new ObjectMapper();

			// Read JSON file
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);

			// Print the object
			System.out.println(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
