package com.trywithresource;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Try_with_resource_demo {
	public static void main(String[] args) {
		
	
		String line;
		
	    try(BufferedReader br = new BufferedReader(new FileReader("D:\\Full Stack Training\\22Aug 22\\src\\com\\trywithresource\\test.txt"))) {
	      while ((line = br.readLine()) != null) {
	        System.out.println("Line =>"+line);
	      }
	    } catch (IOException e) {
	      System.out.println("IOException in try block =>" + e.getMessage());
	    }
	
	}      



	
}