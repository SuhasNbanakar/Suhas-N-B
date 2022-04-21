package com.xwokzodc.suhas;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class TextFile {

		
		
		  public static void main(String[] args) {
		    try {
		    	String text="My first text file";
		      File myObj = new File("C:\\Users\\Lenovo\\Desktop\\suhas1.txt");
		      
		      FileWriter wt=new FileWriter(myObj);
		      wt.write(text);
		      wt.close();
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		}


