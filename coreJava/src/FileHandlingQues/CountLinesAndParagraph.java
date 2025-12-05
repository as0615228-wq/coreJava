package FileHandlingQues;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountLinesAndParagraph {

	public static void main(String[] args) {
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("example1.txt"));
			bw.write("\n");
			bw.write("\nSatyam is bad boy");
			bw.close();
			
			BufferedReader br=new BufferedReader(new FileReader("example1.txt"));
			String line;
			int countLines=0;
			int countParagraphs=0;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				countLines++;
				if(line.isBlank()) {
					countParagraphs++;
				}
				System.out.println("Line count :"+countLines);
				System.out.println("Paragraph count:" +countParagraphs);
				
			}
			br.close();
		}catch(IOException e) {
			System.out.println("Error" +e.getStackTrace());
			
		}

	}

}
