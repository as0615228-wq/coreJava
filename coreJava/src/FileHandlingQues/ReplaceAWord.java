package FileHandlingQues;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceAWord {

	public static void main(String[] args) {
		try {
			BufferedWriter bw2=new BufferedWriter(new FileWriter("example.txt"));
			bw2.write("I am good");
			BufferedReader br=new BufferedReader(new FileReader("example1.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("example.txt"));
			String line;
			while((line=br.readLine())!=null) {
				line=line.replace("bad","am" ); 
				bw.write(line);
				System.out.println("Replaced Successfully..");
			}
			bw2.close();
			bw.close();
			br.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getLocalizedMessage());
		}

	}

}
