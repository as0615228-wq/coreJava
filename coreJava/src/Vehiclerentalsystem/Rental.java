package Vehiclerentalsystem;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class Rental {
			private static List<Vehicle> vehicles = new ArrayList<>();
			private static List<Customer> customers = new ArrayList<>();
			private static List<VehicleBooking> vehicleBookings = new ArrayList<>();
			private static Scanner scanner = new Scanner (System.in);
			
			public static void main(String[]args) {
				initializeVehicle();
				int choice;
				
				do {
					System.out.println("\n--- Welcome To Fusion Vehicles ---");
						System.out.println("1. Show Vehicles  ");
						System.out.println("2. Customer Registeration  ");
						System.out.println("3. Vehicle Booking  ");
						System.out.println("4. Display All Booking  ");
						System.out.println("5. Exit  ");
						System.out.println(" Enter your choice:  ");
								
						   choice = scanner.nextInt();
						   
						   switch (choice) {
						   case 1 -> showVehicles();
						   case 2 -> CustomerRegistration();
						   case 3 -> booking();
						   case 4 -> displayVehicleBooking();
						   case 5 -> System.out.println("Thank you..");
						   default -> System.out.println("Invalid choice.");
						   
						   
						   }
				}while (choice != 5);
				
				
			}
					
			private static void displayVehicleBooking() {
				if(VehicleBooking.isEmpty())
				{
					System.out.println("not rent vehiclebooking");
					return ;
				}
				
				for(VehicleBooking v:vehicleBookings)
				{
					v.displaySummary();
				}
			}

			private static void booking() {
				scanner.nextLine(); // 
		         System.out.print("Enter Customer ID: ");
		         String cid = scanner.nextLine();
		         for(VehicleBooking  p: vehicleBookings )
		         {
		        	Customer obj=p.getCustomer();
		        	String oldid=obj.getCustomerId();
		        	if(cid.equals(oldid))
		        	{
		        		System.out.println("Already Booked!");
		        		return;
		        	}
		        	
		         }
		         Customer customer= findCustomerById(cid);
				 if(customer==null)
				 {
					 System.out.println("Customer not found.. Try to register");
					 return;
				 }
		         
				 System.out.print("Enter Vehicle Id: ");
				 String vid = scanner.nextLine();

		         Vehicle vehicle= findVehicleById(vid);
		         if(vehicle==null)
		         {
		        	 System.out.println("Vehicle not found");
		        	 return;
		         }

				 System.out.print("Enter number of days: ");
		         int days = scanner.nextInt();
		         scanner.nextLine(); String bid;
		         System.out.println("Enter the booking id:");
		         bid=scanner.nextLine();
		         VehicleBooking book= new VehicleBooking(bid,customer,vehicle,days);
		         vehicleBookings.add(book);
		         System.out.println("Booking Successful!");
		         
			}

			private static Vehicle findVehicleById(String vid) {
				 for (Vehicle d : vehicles) {
				        if (d.getVehicleId().equalsIgnoreCase(vid)) {
				            return d;
				        }
				    }
				    return null;
				}
			
			

			private static Customer findCustomerById(String cid) {
				 for (Customer c : customers) {
				        if (c.getCustomerId().equalsIgnoreCase(cid)) {
				            return c;
				        }
				    }
				    return null;
			}

			private static void showVehicles() {
				
				System.out.println("\n Available Vehicles:");
				for (Vehicle v : vehicles)
					v.displayVehicle();

			}

			private static void CustomerRegistration() {
				scanner.nextLine(); // consume newline
				System.out.print("Enter Customer ID: ");
				String id = scanner.nextLine();
				for(Customer p: customers)
				{
					if(p.getCustomerId().equals(id))
					{
						System.out.println("Customer already exist!");
						return;
					}
				}
				
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Age: ");
				int age =scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Contact: ");
				String contact = scanner.nextLine();
				Customer obj = new Customer(name,id,contact,age);
				customers.add(obj);
				System.out.println("Customer registered successfully!"+customers);

			
			}

			private static void initializeVehicle() {
				vehicles.add(new Car("101","Tata",1564));
				vehicles.add(new Bike("102","Yamaha",5625));
				vehicles.add(new Truck("105","AshokLeyland",8985));
				vehicles.add(new Bike("106","Honda",15000));
					
			}
		
					
					
				
			
	}


	

	


