package FileHandlingQues;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) {
		try {
				BufferedReader br=new BufferedReader(new FileReader("example.txt"));
				String line;
				int countWords = 0;
				while((line=br.readLine())!=null) {
					String arr[]=line.split(" ");
					countWords+=arr.length;
				}
				System.out.println("Words Count: "+countWords);
				br.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}

	}

}
