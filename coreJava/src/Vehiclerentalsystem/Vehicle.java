package Vehiclerentalsystem;
public abstract class Vehicle implements Rentable {
	private String vehicleId;
	private String name;
	private double dailyrent;
	private boolean isAvailable;
	
	
	public Vehicle(String vehicleId, String name, double dailyrent) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
		this.dailyrent = dailyrent;
		this.isAvailable = true;
	}
	
	public abstract double calculateRentalCost(int days);

	public String getVehicleId() {
		return vehicleId;
	}

	
	public String getName() {
		return name;
	}

	

	public double getDailyrent() {
		return dailyrent;
	}

	

	private boolean isAvailable() {
		return isAvailable;
	}

		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
	
			
		public void displayVehicle() {
			System.out.println(vehicleId + " | " + name + " | " + dailyrent + "/day | " + (isAvailable ? "Available" : "available"));
		}
	
	
}
