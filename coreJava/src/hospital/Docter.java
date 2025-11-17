package hospital;

public class Docter extends person {
	private String docterId;
	private String specialization;
	public Docter(String name, int age, String contact, String docterId, String specialization) {
		super(name, age, contact);
		this.docterId = docterId;
		this.specialization = specialization;
	}
	
@override
public void getDetails() {
	System.out.println("Docter: " +"specialization: "+ specialization);
	
}

public String getDocterId() {
	return docterId;
}

public void setDocterId(String docterId) {
	this.docterId = docterId;
}

public String getSpecialization() {
	return specialization;
}

public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

}
