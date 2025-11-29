package Vehiclerentalsystem;

public class Car extends Vehicle{

	public Car(String vehicleId, String name, double dailyrent) {
		
		super(vehicleId, name, dailyrent);
	}

	

	@Override
	public void rent(int days) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnVehcle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return getDailyrent() * days ;
	}
		

}
