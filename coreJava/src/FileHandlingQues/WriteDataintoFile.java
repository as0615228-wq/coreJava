package FileHandlingQues;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoFile {

	public static void main(String[] args) {
		try {
				FileWriter fw = new FileWriter("Text.txt");
				
				fw.write("I am a Full Stack Developer.");
				System.out.println("Created New Records And Erased Previous Records Successfully...");
				
				fw.close();
		}catch(IOException e) {
				System.out.println("Error :" +e.getStackTrace());
		}

	}

}
