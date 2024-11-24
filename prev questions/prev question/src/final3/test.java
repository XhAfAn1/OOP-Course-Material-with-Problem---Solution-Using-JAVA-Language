package final3;
import java.util.Arrays;
interface Comparable{
    int compareTo(Vehicle other);
}
class Vehicle implements Comparable {
    private String vehicleName;
    private double mileage;
    private int capacity;

    public Vehicle(String vehicleName, double mileage, int capacity) {
        this.vehicleName = vehicleName;
        this.mileage = mileage;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getMileage() {
        return mileage;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int compareTo(Vehicle other) {
        // Compare based on mileage
        int mileageComparison = Double.compare(this.mileage, other.mileage);
        if (mileageComparison != 0) {
            return mileageComparison;
        }

        // If mileage is the same, compare lexicographically by vehicle name
        return this.vehicleName.compareTo(other.vehicleName);
    }

    @Override
    public String toString() {
        return "Vehicle Name: " + vehicleName + ", Mileage: " + mileage + ", Capacity: " + capacity;
    }
}

public class test {
    public static void main(String[] args) {
        try{
        Vehicle[] vehicles = new Vehicle[]{
            new Vehicle("Car", 25.5, 4),
            new Vehicle("Motorcycle", 40.2, 2),
            new Vehicle("Truck", 15.8, 6),
            new Vehicle("Bicycle", 0.0, 1),
            new Vehicle("Bus", 10.5, 40)
        };

        // Sort by mileage (ascending)
        Arrays.sort(vehicles);

        System.out.println("Vehicles sorted by mileage (ascending):");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        // Modify compareTo to compare based on vehicle name (lexicographically)
        Arrays.sort(vehicles, (v1, v2) -> v1.getVehicleName().compareTo(v2.getVehicleName()));

        System.out.println("\nVehicles sorted by name (lexicographically):");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
