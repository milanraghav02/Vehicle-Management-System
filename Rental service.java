import java.util.ArrayList;
public class RentalService {
 private ArrayList<Vehicle> vehicles;
 public RentalService() {
 vehicles = new ArrayList<>();
 }
 public void addVehicle(Vehicle vehicle) {
 vehicles.add(vehicle);
 }
 public void showAvailableVehicles() {
 System.out.println("\nAvailable Vehicles:");
 for (Vehicle v : vehicles) {
 if (!v.isRented()) {
 System.out.println(v);
 }
 }
 }
 public boolean rentVehicle(String vehicleId) {
 for (Vehicle v : vehicles) {
 if (v.getVehicleId().equals(vehicleId) && !v.isRented()) {
 v.rent();
 return true;
 }
 }
 return false;
 }
 public boolean returnVehicle(String vehicleId) {
 for (Vehicle v : vehicles) {
 if (v.getVehicleId().equals(vehicleId) && v.isRented()) {
 v.returnVehicle();
 return true;
 }
 }
 return false;
 }
 public void showAllVehicles() {
 System.out.println("\nAll Vehicles:");
 for (Vehicle v : vehicles) {
 System.out.println(v);
 }
 }
}
