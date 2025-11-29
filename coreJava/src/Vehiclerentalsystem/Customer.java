package Vehiclerentalsystem;

public class Customer {
	private String name;
	private String customerId;
	private String mobileNo;
	private int age;
	
	
	public Customer(String name, String customerId, String mobileNo, int age) {
		super();
		this.name = name;
		this.customerId = customerId;
		this.mobileNo = mobileNo;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	


	public String getCustomerId() {
		return customerId;
	}


	


	public String getMobileNo() {
		return mobileNo;
	}





	public int getAge() {
		return age;
	}


	public void displayCustomer() {
		System.out.println(customerId + " | " + name + " | " + mobileNo + " | " + age);
		
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerId=" + customerId + ", mobileNo=" + mobileNo + ", age=" + age
				+ "]";
	}
		
			
	
	
	

}
