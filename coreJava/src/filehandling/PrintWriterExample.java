package filehandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExample {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("students.txt");
			
			pw.println("Aditya 98 488.5 Maths");
			pw.println("karan 88 888.7 Science");
			pw.println("Shivam 89 235.9 SST");
			pw.println("Satyam 78 892.54 Hindi");
			pw.close();
			
			Scanner sc = new Scanner(new File("students.txt"));
			while (sc.hasNext()) {
				String name = sc.next();
				int marks = sc.nextInt();
				double totalmarks= sc.nextDouble();
				String subject= sc.next();
				System.out.println(name + " scored " +marks+" Total Marks:"+totalmarks+" Subject: "+subject);
			}
			sc.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
