package hospital;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HospitalSystem {
	private static List<Docter> docters = new ArrayList<>();
	private static List<Patient> patients = new ArrayList<>();
	private static List<Appointment> appointments = new ArrayList<>();
	
	private static Scanner scanner = new Scanner (System.in);
	

	public static void main(String[] args) {
		initilizeData();
		int choice;
		do {
            System.out.println("/--- Welcome To Anand Hospital---");
            System.out.println("1. Register Patient");
            System.out.println("2. Book Appointment");
            System.out.println("3. Display Appointments");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            
            switch (choice) {
            case 1 -> registerPatient();
            case 2 -> bookAppointment();
            case 3 -> displayAppointments();
            case 4 -> System.out.println("Thank you..");
            }
            }while (choice !=4);
		}
      private static Object displayAppointments() {
		// TODO Auto-generated method stub
		return null;
	}
	  private static void initilizeData() {
    	  docters.add(new Docter("Dr. Vivek",26, "9999562355", "D101","Cardiology"));
    	  docters.add(new Docter("Dr. Ayush",36, "8959562355", "D102","Dentist"));
    	  docters.add(new Docter("Dr. Som",39, "6393804266", "D103","Heart Specialist"));
      }
      private static void registerPatient() {
    	  scanner.nextLine();
    	  System.out.print("Enter Patient ID: ");
    	  String id = scanner.nextLine();
   
    	  for(Patient p: patients)
    	  { 
    		 if(p.getPatientId().equalsIgnoreCase(id)) 
    		 {
    			   System.out.println("Patient already registered");
    			        return;
    		 }
    	  }
      System.out.print("Enter Name:");
      String name = scanner.nextLine();
      System.out.print("Enter Age:");
      int age = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Enter Contact: ");
      String contact = scanner.nextLine();
      
      System.out.print("Enter Type (General/Surgery): ");
      String type = scanner.nextLine();
      Patient obj = new Patient(name, age, contact, id,type);
      
      private static void bookAppointment() {
    	  scanner.nextLine();
    	  System.out.print("Enter Patient ID: ");
    	  String pid = scanner.nextLine();
    	  
    	  
    	  for(Appointment a:appointments)
    	  {
    		  Patient old=a.getPatient();
    		  String oldpid=old.getPatientId();
    		  if(oldpid.equals(pid))
    		  {
    			  System.out.println(
    					  "Appointment already booked");
    		  }
    	  }
    	  
      }
      
      