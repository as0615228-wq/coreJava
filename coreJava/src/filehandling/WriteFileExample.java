package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("example.txt");
			
				writer.write("Hello, this is Aditya. \n Welecome to Java File Handling!!!");
				writer.write("\nHello, this is karan.\n Welecome to java File Handling!!!");
				
				writer.close();
				System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			
		}

	}

}
