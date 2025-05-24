public abstract class Vehicle {
 protected String vehicleId;
 protected String model;
 protected boolean isRented;
 public Vehicle(String vehicleId, String model) {
 this.vehicleId = vehicleId;
 this.model = model;
 this.isRented = false;
 }
 public String getVehicleId() {
 return vehicleId;
 }
 public String getModel() {
 return model;
 }
 public boolean isRented() {
 return isRented;
 }
 public void rent() {
 isRented = true;
 }
 public void returnVehicle() {
 isRented = false;
 }
 public abstract String getType();
 @Override
 public String toString() {
 return "[" + getType() + "] " + model + " (ID: " + vehicleId + ") - " +
(isRented ? "Rented" : "Available");
 }
}
