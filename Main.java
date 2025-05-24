import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 RentalService service = new RentalService();
 Scanner scanner = new Scanner(System.in);
 service.addVehicle(new Car("C101", "Toyota Innova"));
 service.addVehicle(new Car("C102", "Honda City"));
 service.addVehicle(new Bike("B201", "Yamaha R15"));
 service.addVehicle(new Bike("B202", "Bajaj Pulsar"));
 int choice;
 do {
 System.out.println("\n--- Vehicle Rental System ---");
 System.out.println("1. Show All Vehicles");
 System.out.println("2. Show Available Vehicles");
 System.out.println("3. Rent Vehicle");
 System.out.println("4. Return Vehicle");
 System.out.println("0. Exit");
 System.out.print("Enter your choice: ");
 choice = scanner.nextInt();
 switch (choice) {
 case 1:
 service.showAllVehicles();
 break;
 case 2:
 service.showAvailableVehicles();
 break;
 case 3:
 System.out.print("Enter Vehicle ID to rent: ");
 String rentId = scanner.next();
 if (service.rentVehicle(rentId)) {
 System.out.println("Vehicle rented successfully.");
 } else {
 System.out.println("Vehicle not available.");
 }
 break;
 case 4:
 System.out.print("Enter Vehicle ID to return: ");
 String returnId = scanner.next();
 if (service.returnVehicle(returnId)) {
 System.out.println("Vehicle returned successfully.");
 } else {
 System.out.println("Invalid ID or vehicle not rented.");
 }
 break;
 case 0:
 System.out.println("Exiting system. Goodbye!");
 break;
 default:
 System.out.println("Invalid choice.");
 }
 } while (choice != 0);
 scanner.close();
 }
}
