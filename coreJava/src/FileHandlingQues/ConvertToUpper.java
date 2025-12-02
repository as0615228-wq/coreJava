package FileHandlingQues;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertToUpper {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
					BufferedWriter bw=new BufferedWriter(new FileWriter("example.txt"));
					String line;
					while((line=br.readLine())!=null) {
						String h=line.toUpperCase();
						bw.write(h);
					}
					System.out.println("Convert Successfull.....");
					br.close();
					bw.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}

	}

}
