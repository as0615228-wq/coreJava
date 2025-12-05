package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerlizationExample {

	public static void main(String[] args) {
		//		Student s1 = new Student("Aditya", 89);
		//
		//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.ser"))) {
		//
		//			oos.writeObject(s1);
		//			System.out.println("Object Serialized!!");
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//	}
		//
		//	}

		//Deserialization

		try(

				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.ser"))){
			Student s2=(Student)ois.readObject();
			System.out.println("Object deserialized:" +s2.name + " - " +s2.marks);
		}catch(IOException | ClassNotFoundException m) {
			m.printStackTrace();
		}
		
    }
}