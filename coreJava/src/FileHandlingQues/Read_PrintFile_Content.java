package FileHandlingQues;

import java.io.FileReader;
import java.io.IOException;

public class Read_PrintFile_Content {

	public static void main(String[] args) {
		try {
				FileReader fr = new FileReader("Text.txt");
				int ch;
				
				while((ch=fr.read())!=-1) {
					System.out.print((char)ch);
				}
				fr.close();
		}catch(IOException e) {
			
			System.out.println("Error :"+e.getStackTrace());
			
		}

	}

}
