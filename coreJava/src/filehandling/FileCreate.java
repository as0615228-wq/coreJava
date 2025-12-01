package filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
	try {
		File file=new File("Text.txt");
		if(file.createNewFile()) {
			System.out.println("File created" +file.getName());
		}else {
			System.out.println("File already created...");
		}
	}catch(IOException e) {
		e.getStackTrace();
	}
	}

}
