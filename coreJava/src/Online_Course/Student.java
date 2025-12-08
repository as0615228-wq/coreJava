package Online_Course;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String studentId;
	private String password;
	private long contact;
	private String studentName;
	
	
	
	public Student(String studentId, String password, long contact, String studentName) {
		super();
		this.studentId = studentId;
		this.password = password;
		this.contact = contact;
		this.studentName = studentName;
	}

	private static List<Course> enrolledCourse=new ArrayList<>();



	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	    
		public void showReport() {
				System.out.println("Id");
		}
	
}
