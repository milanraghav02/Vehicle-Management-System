public class Bike extends Vehicle {
 public Bike(String vehicleId, String model) {
 super(vehicleId, model);
 }
 @Override
 public String getType() {
 return "Bike";
 }
}
