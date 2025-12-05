package FileHandlingQues;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchInWordFile {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("example.txt"));
			String word = "And";
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				if (line.contains(word)) {
					System.out.println("This word exist in this file");
				} else {
					System.out.println("This word doesn't exist in this file");
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getStackTrace());
		}

	}

}
