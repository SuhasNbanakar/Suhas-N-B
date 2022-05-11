package com.xworkz.textfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyText {

	public static void main(String[] agrs) {
		try {
			String msg = "my new text file in eclips from java-am going to my native today for attending my friend wedding so am not attend the java class";
			File file = new File("C:/Users/Lenovo/Desktop/sandeep/My-Xworkx.txt");
			FileWriter temp = new FileWriter(file);
			temp.write(msg);
			temp.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
