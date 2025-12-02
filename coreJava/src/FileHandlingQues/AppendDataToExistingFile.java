package FileHandlingQues;

import java.io.FileWriter;
import java.io.IOException;

public class AppendDataToExistingFile {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Text.txt",true);
			fw.write("And I am from Delhi...");
			System.out.println("Append Successfull....");
			fw.close();
			
		}catch(IOException e) {
			System.out.println("Error :"+e.fillInStackTrace());
		}

	}

}
