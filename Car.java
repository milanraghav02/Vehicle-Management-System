public class Car extends Vehicle {
 public Car(String vehicleId, String model) {
 super(vehicleId, model);
 }
 @Override
 public String getType() {
 return "Car";
 }
}
