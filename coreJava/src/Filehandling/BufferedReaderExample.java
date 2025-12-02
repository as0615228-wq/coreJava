package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		try {
				BufferedReader br = new BufferedReader(new FileReader("example1.txt"));
						String line;
						int countLine=0;
						int countword=0;
						int charcount=0;
						while((line = br.readLine()) != null);{
							System.out.println(line);
							charcount+=line.length();
							String arr[]= line.split(" ");
							
							countword+=arr.length;
							countLine++;
							
						}
			System.out.println("Number of lines in the file:"+countLine);
			System.out.println("number of word present in the file: "+countword);
			System.out.println("Number of character present in the file:"+charcount);
			br.close();
			
		}catch (IOException e) {
			System.out.println("Error rerading file.");
			e.printStackTrace();
			e.getStackTrace();
		}

	}

}
