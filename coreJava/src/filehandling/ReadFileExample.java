package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		try {
			
			FileReader reader =new FileReader("example.txt");
			
			int character;
			int count=0;
			
			character = reader.read();
			while(character!= -1) {
					count++;
					System.out.println((char)character);
					character = reader.read();
					
			}
				System.out.println();
				System.out.println("Number of characters:"+count);
				reader.close();
				BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
					
				}
		
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
