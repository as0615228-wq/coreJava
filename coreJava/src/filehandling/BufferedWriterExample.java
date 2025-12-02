package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("example1.txt",true));
			String arr[ ]= {"Hello world","Welecome", "to", "java", "Programming"}; 
			for(String word:arr)
			{
				bw.write(word);
			}
			bw.close();
			System.out.println("Data appended successfully");
		}catch  (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}

	}
}
